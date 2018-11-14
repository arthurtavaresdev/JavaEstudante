package escola;

public class Aluno {
	/*
	 * CRIE UMA CLASSE CHAMADA ALUNO PARA DEFINIR OS OBJETOS QUE REPRESENTARÃO
	 * OS ALUNOS DE UMA ESCOLA. NESSA CLASSE, DECLARE OS ATRIBUTOS: O PRIMEIRO
	 * PARA O NOME, O SEGUNDO PARA O RG E O TERCEIRO PARA A DATA DE NASCIMENTO
	 * DOS ALUNOS E O QUARTO PARA TURMA.
	 * 
	 * EM CADA CLASSE DEVERÁ POSSUIR O MÉTODO MOSTRARDETALHES QUE IRÁ IMPRIMIR
	 * OS VALORES DOS ATRIBUTOS.
	 * 
	 */

	private String nome;
	private String rg;
	private DataNasciemto dataNasc;
	private Turma turma;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public DataNasciemto getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(DataNasciemto dataNasc) {
		this.dataNasc = dataNasc;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

	public void mostrarDetalhes() {
		System.out.println("=-=-=-=-=-=-=   =-=-=-=-=-=-=");
		System.out.println("Nome: " + this.nome);
		System.out.println("RG: " + this.rg);
	}

	/*
	 * NA CLASSE ALUNO DEVERÁ CONTER O MÉTODO VERIFICARIDADE ONDE ESSE MÉTODO
	 * RECEBERÁ O ANO ATUAL E SUBTRAIRÁ O ATRIBUTO ANO E ASSIM RETORNARÁ A IDADE
	 * DO ALUNO.
	 */

	public int verificaridade(int anoAtual) {
		return dataNasc.getAno() - anoAtual;
	}
	
	/*
	 * AINDA NA CLASSE ALUNO CRIAR UM MÉTODO PARA ASSOCIAR ALUNO A TURMA, ESSE
	 * MÉTODO DEVERÁ VERIFICAR SE O ALUNO JÁ FOI ASSOCIADO A UMA TURMA CASO NÃO
	 * DEVERÁ SER ASSOCIADO CASO SIM NÃO PODERÁ SER ASSOCIADO NOVAMENTE.
	 */

	public void associarAluno(Turma turma) {
		
		if (this.turma == null) {
			this.turma = turma;
			System.out.println("Aluno associado com sucesso !");
		}else{
			System.out.println("Aluno já associado a uma turma !");
		}
		
	}
	
	

}
