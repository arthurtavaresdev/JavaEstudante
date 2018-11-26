package model;

public class Atendente extends Pessoa {
	
	private int matricula;

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	@Override
	public void imprimirInformacoes(){
		super.imprimirInformacoes();
		System.out.println("--------------- ATENDENTE ---------------");
		System.out.println("Matricula: " + this.matricula);

	}
}
