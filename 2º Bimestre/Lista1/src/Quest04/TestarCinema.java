package Quest04;

import java.util.*;
import Quest03.Data;

public class TestarCinema {

	public static void main(String[] args) {

		

		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite os dados da sessão");
		
		String data = "";
		String horario = "";
		
		Data date = new Data();
		
		while(true){
			
			System.out.print("Data: (DD/MM/AAAA): ");
			data = input.next();
			date.getDadosSistema(data, horario);
			
			if(date.valData())
				break;
			else
				System.out.println("Data invalida");
		}
 
		
		while(true){
			System.out.print("Horario: (00:00): ");
			horario = input.next();
			date.getDadosSistema(data, horario);
			
			if(date.valHoraMin())
				break;
			else
				System.out.println("Horario invalido");
		}
		
		System.out.print("Sala: ");
		int sala = input.nextInt();

		System.out.print("Valor: ");
		float valor = input.nextFloat();

		EntradaDeCinema ent = new EntradaDeCinema(data, horario, sala, valor);
		
		
		System.out.println("Dados do cliente");
		  
		String nasc = "";
		
		while(true){
			System.out.print("Data: (DD/MM/AAAA): ");
			nasc = input.next();
			date.getDadosSistema(nasc, horario);
			if(date.valData())
				break;
			else
				System.out.println("Data invalida");
		}
		
		System.out.print("Número da carteira de estudante: "); 
		int cart = input.nextInt();
	
		ent.calculaDescontoHorario(nasc, cart); 
		ent.imprimaString(nasc); 
		

	}

}
