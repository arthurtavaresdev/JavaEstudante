package model;

public class Cliente {

	private int numeroContrato;

	public int getNumeroContrato() {
		return numeroContrato;
	}

	public void setNumeroContrato(int numeroContrato) {
		this.numeroContrato = numeroContrato;
	}
	
	public void imprimirInformacoes(){
		System.out.println("--------------- CLIENTE ---------------");
		System.out.println("Número do contrato " + this.numeroContrato);
	}
	
}
