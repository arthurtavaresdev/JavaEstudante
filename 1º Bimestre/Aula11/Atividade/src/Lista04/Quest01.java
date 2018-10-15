package Lista04;

import java.util.Scanner;

public class Quest01 {

	public static void main(String[] args) {
		/*
		 * 1) ESCREVA UM ALGORITMO QUE PERMITA A LEITURA DOS NOMES DE 10 PESSOAS
		 * E ARMAZENE OS NOMES LIDOS EM UM VETOR. APÓS ISTO, O ALGORITMO DEVE
		 * PERMITIR A LEITURA DE MAIS 1 NOME QUALQUER DE PESSOA E DEPOIS
		 * ESCREVER A MENSAGEM ACHEI, SE O NOME ESTIVER ENTRE OS 10 NOMES LIDOS
		 * ANTERIORMENTE (GUARDADOS NO VETOR), OU NÃO ACHEI CASO CONTRÁRIO.
		 */

		String nomes[] = new String[4];
		boolean vef = false;
		
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < nomes.length; i++) {
			System.out.println("Digite o " + (i+1) +"º nome");
			nomes[i] = input.nextLine();
			input = new Scanner(System.in);
		}
		
		System.out.println("-------------------");
		System.out.println("Digite outro nome:");
		String outro = input.nextLine();
		
		for (int i = 0; i < nomes.length; i++) {
			if(nomes[i].equals(outro)){
				vef = true ;
				break;
			} 
			
		} if(vef) 
			System.out.println("Achei");
		else 
			System.out.println("Não encontrei");
	}

}
