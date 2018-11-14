package escola;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		
		
		Aluno aluno = new Aluno();
		aluno.setNome("Joaquim");
		aluno.setRg("MG-31014141");
		
		DataNasciemto dataNasc = new DataNasciemto();
		dataNasc.setDia(13);
		dataNasc.setMes(11);
		dataNasc.setAno(2000);
		
		aluno.setDataNasc(dataNasc);
		
		Turma turma = new Turma();
		turma.setTipoEnsino("Médio");
		turma.setSigla("FDA");
		turma.setSerie(2);
		turma.setTurno("Noite");
		
		aluno.setTurma(turma);
		aluno.associarAluno(turma);
		
		Calendar calendario = Calendar.getInstance();
		
		
		aluno.mostrarDetalhes();
		turma.mostrarDetalhes();
		dataNasc.MostrarDetalhes();
		System.out.println("=-=-=-=-=-=-=  OUTROS DADOS =-=-=-=-=-=-=");
		System.out.println("O aluno tem " + aluno.verificaridade(calendario.get(Calendar.YEAR)) + " Anos.");
		if(dataNasc.hojeAniversario(calendario.get(Calendar.DATE), calendario.get(Calendar.MONTH) + 1)){
			System.out.println("Hoje é o aniversario do(a) " + aluno.getNome() + " Deseje-o parabéns !");
		}else{
			System.out.println("Hoje NÃO é o aniversario do(a) " + aluno.getNome() + ".");
		}
		
	}

}
