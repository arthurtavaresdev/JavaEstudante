package acao;

public class Carro {

	String nome;
	Fabricante fabricante;
	int ano;
	float valor;
	
	public Carro(String nome, Fabricante fab, int ano,float valor){
		
		this.nome = nome;
		this.fabricante = fab;
		this.ano = ano;
		this.valor = valor;
		
	}
	
	
	void imprimirCarro(){
		
		System.out.println("---- DADOS DO CARRO ----");
		System.out.println("Nome: " + this.nome);
		System.out.println("Ano: " + this.ano);
		System.out.println("Valor: " + this.valor);
		fabricante.imprimir();
		
	}
	
	void descontarValor(int ano,float valor){
		
		this.ano = ano;
		System.out.println("-=-=-=-=-=-=-=-=-=-= Desconto ? -=-=-=-=-=-=-=-=-=-=");
		
		if(ano > 2012 && (valor > 20000 && valor < 30000)){
			System.out.println("Desconto de 10%");
			System.out.println("Motivo: Ano de fabricação maior que 2010");
			this.valor *= 0.90;
			
		}
		else if(ano >= 2008 && ano <= 2012 && (valor <= 20000)){
			System.out.println("Desconto de 15%");
			System.out.println("Motivo: Ano de fabricação entre 2005 e 2010");
			this.valor *= 0.85;
			
		}else{
			
			System.out.println("Sem DESCONTO ;-;");
			
		}
	}
	
	boolean verificarFabricante(){
		if(!fabricante.nome.equalsIgnoreCase("Fiat")){
			return true;
		}
		return false;
	}
	
	void aplicarDescontoFabricante(){
		if(this.verificarFabricante()){
		System.out.println("----------------------------------------------");
		System.out.println("Desconto de 5%");
		System.out.println("Motivo: Carro da marca FIAT");
		this.valor *= 0.95;
		}
	}
	
	
}
