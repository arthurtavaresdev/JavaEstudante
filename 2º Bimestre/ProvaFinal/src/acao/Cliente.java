package acao;

public class Cliente extends Pessoa {
	
	private String dataContratacao;
	
	void imprimeDataContrato(){
		System.out.println("Data do contrato: " + this.dataContratacao );
	}

	public String getDataContratacao() {
		return dataContratacao;
	}

	public void setDataContratacao(String dataContratacao) {
		this.dataContratacao = dataContratacao;
	}
	
	
}
