package model;

public class Banco {

	private String nomeBanco;
	private String cnpj;
	public String getNomeBanco() {
		return nomeBanco;
	}
	public void setNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public void imprimirInformacoes(){
		System.out.println("--------------- BANCO --------------- ");
		System.out.println("Nome do banco: " + this.nomeBanco);
		System.out.println("CNPJ: " + this.cnpj);
	}
	
	
}
