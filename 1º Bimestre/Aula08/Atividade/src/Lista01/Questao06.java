package Lista01;

import java.util.Scanner;

public class Questao06 {

	public static void main(String[] args) {
		/*
		 * 6 - DIGITE A QUANTIDADE DE ALUNOS DE UMA TURMA, DIGITE NOTAS PARA
		 * CADA ALUNO. NO FINAL IMPRIMA A NOTA MÉDIA DA TURMA.
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.print("Digite o número de alunos: " );
		int aluno = input.nextInt();
		double soma = 0;
		
		for(int i = 0; i<aluno;i++){
			System.out.print("Digite a nota do " + i +"º Aluno: " );
			double nota = input.nextDouble();
			
			soma += nota;
		}
		System.out.println("A Média geral dos" + aluno + "Alunos é " + (soma/aluno));
	}

}
