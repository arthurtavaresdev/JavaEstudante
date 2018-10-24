package acao;

public class Fabricante {
	
	String cnpj; // Um long/int não suporta todos os Caracteres de um CNPJ.
	String nome;
	
	
	public Fabricante(String cnpj, String nome){
		
		this.cnpj = cnpj;
		this.nome = nome;
		
	}
	
	
	void imprimir(){
		System.out.println("---- DADOS DO FABRICANTE ----");
		System.out.println("CNPJ : "+ this.cnpj);
		System.out.println("Nome: " + this.nome);
		
	}
	
}
