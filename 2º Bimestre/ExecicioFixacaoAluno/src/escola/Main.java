package escola;

public class Main {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Joaquim");
		aluno.setRg("MG-31014141");
		
		DataNasciemto dataNasc = new DataNasciemto();
		dataNasc.setDia(13);
		dataNasc.setMes(11);
		dataNasc.setAno(2018);
		
		aluno.setDataNasc(dataNasc);
		
		Turma turma = new Turma();
		turma.setTipoEnsino("Médio");
		turma.setSigla("FDA");
		turma.setSerie("2");
		turma.setTurno("Noite");
		
		aluno.setTurma(turma);
		aluno.associarAluno(turma);
		
		
		System.out.println(aluno.verificaridade(2018));
		System.out.println("Aniversario? "  + dataNasc.hojeAniversario(13, 11));
		aluno.mostrarDetalhes();
		turma.mostrarDetalhes();
		dataNasc.MostrarDetalhes();
	}

}
