package metodoParametro;

public class Operacao {

	public int somarDoisNumeros(int num, int num2) {
		int res = num + num2;
		return res;
		
	}
	
	public void subtrairDoisNumeros(int x, int y){
		
		int res = x - y;
		
		 System.out.println(res);
		
	}
	
	public String converterNomeMaisculo(String nome){
		
		String nome2 = nome.toUpperCase();
		
		return nome2;	
		
	}
	
	public String converterNomeMinisculo(String nome){
		
		String nome2 = nome.toLowerCase();
		
		return nome2;	
		
	}
	
}
