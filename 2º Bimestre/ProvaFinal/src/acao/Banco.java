package acao;

public class Banco {
	private String nomeBanco;
	private String cnpj;
	
	void imprimirInformacoesBanco(){
		System.out.println("Nome do banco: " + this.nomeBanco);
		System.out.println("CNPJ: " + this.cnpj);
	}

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
}
