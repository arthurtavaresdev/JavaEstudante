package escola;

public class DataNasciemto {
	/*
	 * CRIE UMA CLASSE CHAMADA DATANASCIMENTO PARA DEFINIR DIA, MÊS E ANO TODOS
	 * ESSES ATRIBUTOS SERÃO DO TIPO INTEIRO.
	 * 
	 * EM CADA CLASSE DEVERÁ POSSUIR O MÉTODO MOSTRARDETALHES QUE IRÁ IMPRIMIR
	 * OS VALORES DOS ATRIBUTOS.
	 */

	private int dia;
	private int mes;
	private int ano;

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public void MostrarDetalhes() {
		System.out.println("=-=-=-=-=-=-=  DATA DE NASCIMENTO =-=-=-=-=-=-=");
		System.out.println("Data de nascimento: " + this.dia + "/" + this.mes + "/" + this.ano);
	}

	/*
	 * NA CLASSE DATANASCIMENTO DEVERÁ CONTER O MÉTODO HOJEANIVERSÁRIO ONDE
	 * DEVERÁ SER PASSADO COMO PARÂMETROS OS VALORES DE DIA ATUAL E MÊS ATUAL E
	 * COMPARAR COM OS VALORES QUE ESTÃO NOS RESPECTIVOS ATRIBUTOS CASO
	 */
	
	public boolean hojeAniversario(int diaAtual, int mesAtual){
		String niver = this.dia + "-" + this.mes;
		String hoje = diaAtual + "-" + mesAtual;
		if(niver.equalsIgnoreCase(hoje)){
			return true;
		}
		
		return false;
	}

}
