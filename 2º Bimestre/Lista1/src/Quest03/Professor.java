package Quest03;

import java.util.*;

public class Professor {

	String nomeProfessor;
	String nomeDisciplina;
	int reg;
	String data2;
	int anoTrabs;

	Data data = new Data();
	public Professor(String professor, String disciplina, int reg,String dia) {

		this.nomeProfessor = professor;
		this.nomeDisciplina = disciplina;
		this.reg = reg;
		data.getDadosSistema(dia);
		data2 = dia;
	}



	public int anosDeTrabalho() {

		int anoTrab = data.idade(this.data2,data.getDateTime());

		return anoTrab;

	}

	void imprimir() {
		System.out.println("---------------------------------------------");
		System.out.println("Nome do professor : " + this.nomeProfessor);
		System.out.println("Nome do Disciplina : " + this.nomeDisciplina);
		System.out.println("Número de registro : " + this.reg);
		System.out.println("Anos trabalhados: " + this.anosDeTrabalho());
		this.imprimirData();
	}

	public void imprimirData() {

		System.out.println("Data de admissão " + data.data);
	}

}
