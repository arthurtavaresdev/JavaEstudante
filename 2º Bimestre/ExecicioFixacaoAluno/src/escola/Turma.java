package escola;

public class Turma {

	/*
	 * CRIE UMA CLASSE CHAMADA TURMA QUE CONTENHA QUATRO ATRIBUTOS: O PRIMEIRO
	 * PARA O TURNO, O SEGUNDO PARA DEFINIR A SÉRIE, O TERCEIRO PARA SIGLA DO
	 * CURSO E O QUARTO PARA O TIPO DE ENSINO.
	 * 
	 * EM CADA CLASSE DEVERÁ POSSUIR O MÉTODO MOSTRARDETALHES QUE IRÁ IMPRIMIR
	 * OS VALORES DOS ATRIBUTOS.
	 * 
	 */

	private String turno;
	private int serie;
	private String sigla;
	private String tipoEnsino;

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno; 
	}

	public int getSerie() {
		return serie;
	}

	public void setSerie(int serie) {
		this.serie = serie;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getTipoEnsino() {
		return tipoEnsino;
	}

	public void setTipoEnsino(String tipoEnsino) {
		this.tipoEnsino = tipoEnsino;
	}

	public void mostrarDetalhes() {
		System.out.println("=-=-=-=-=-=-=  TURMA =-=-=-=-=-=-=");
		System.out.println("Turno: " + this.turno);
		System.out.println("Serie: " + this.serie + "º Serie.");
		System.out.println("Sigla: " + this.turno);
		System.out.println("Tipo de ensino: " + this.tipoEnsino);
	}

}
