package model;

public class Fabricante {
	private String cnpj;
	private String nome;
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getAllItens(){
		return "CNPJ: " + this.cnpj + ", Nome: " + this.nome;
	}
	
	
}
