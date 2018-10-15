package Quest03;

import java.text.*;
import java.util.*;

public class Data {
	
	public String horario;
	public String data;
	public int anoAtual;
	Calendar c = Calendar.getInstance();
	
	
	public String getDateTime() { 
		
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy"); 
		Date date = new Date(); 
		
		return dateFormat.format(date); 

	}
	

	
	public void getDadosSistema(String data,String horario){
		
		this.horario = horario;
		this.data = data;
		
	}
	
	public void getDadosSistema(String data){
		
		this.data = data;
		
	}
	

	public int idade(String nasc, String dataCalc){

		int filme[] = this.getData(nasc);
		int cliente[] = this.getData(dataCalc);
		int finala = 0;

		if (filme[1] <= cliente[1])
			
			finala = cliente[2] - (filme[2]);
		
		else if (filme[1] > cliente[1])
			finala = cliente[2] - (filme[2] + 1);
		
		else{
			if (cliente[0] <= filme[0])
				finala = cliente[2] - (filme[2]) ;
			else
				finala = cliente[2] - (filme[2] + 1); ;
		}

		return finala;

	}
	
	
	public int getAno(){
		
		int anos[] = this.getData(this.data);
		int ano = anos[2] ;
		
		return ano;
	}
	
	
	public int[] horaMinuto(){
		
		char hora[] = { this.horario.charAt(0), this.horario.charAt(1)};
		char minuto[] = { this.horario.charAt(3), this.horario.charAt(4)};
		int hr = Integer.parseInt(String.copyValueOf(hora));
		int min = Integer.parseInt(String.copyValueOf(minuto));
		
		int hm[] = {hr,min};
		
		return hm;
	}
	
	public boolean valData(){
		
		int datas[] = this.getData(this.data);
		
		if(datas[0] > 31 || datas[1] > 12)
			return false;
		else if(datas[1] == 2) {
			
			if(datas[0] > 28 && datas[2] % 4 == 1)
				return false;
			else if(datas[0] > 29)
				return false;
		}
			
		
		return true;
	}
	
	
	public boolean valHoraMin(){
		int hora[] = this.horaMinuto();
		
		if(this.horario.length() != 5)
			return false;
		if(hora[0] >= 25 || hora[1] >= 60)
			return false;
		 else if(hora[0] < 0 || hora[1] < 0)
			 return false;
		
		return true;
	}
	
	
	
	
	public int getHora(){
		
		int hora[] = this.horaMinuto();
		int hr = hora[0];
		
		return hr;
		
	}
	
	
	
	public int[] getData(String data) {

		char dia[] = { data.charAt(0), data.charAt(1) };
		char mes[] = { data.charAt(3), data.charAt(4) };
		char ano[] = { data.charAt(6), data.charAt(7), data.charAt(8), data.charAt(9) };
		int dia1 = Integer.parseInt(String.copyValueOf(dia));
		int mes1 = Integer.parseInt(String.copyValueOf(mes));
		int ano1 = Integer.parseInt(String.copyValueOf(ano));

		int completa[] = { dia1, mes1, ano1 };

		return completa;

	}
}
