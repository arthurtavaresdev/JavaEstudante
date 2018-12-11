package acao;

public class Atendente extends Pessoa {

	private String matricula;
	
	void imprimirAtedente(){
		System.out.println("Mat. Atendente: " + this.matricula);
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

}
