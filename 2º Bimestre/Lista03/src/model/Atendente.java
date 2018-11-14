package model;

public class Atendente {
	
	private int matricula;

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public void imprimirInformacoes(){
		System.out.println("--------------- ATENDENTE ---------------");
		System.out.println("Matricula: " + this.matricula);
	}
}
