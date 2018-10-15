package Lista04;

import java.util.Scanner;

public class Quest04 {

	public static void main(String[] args) {

		/*
		 * 4) DESENVOLVER UM PROGRAMA QUE EFETUE A LEITURA DE 10 ELEMENTOS E ARMAZENE EM
		 * UM VETOR A. CONSTRUIR UM VETOR B, OBSERVANDO A SEGUINTE LEI DE FORMAÇÃO: SE O
		 * VALOR DO ÍNDICE FOR PAR, O VALOR DEVERÁ SER MULTIPLICADO POR 5, SENDO ÍMPAR
		 * DEVERÁ SER SOMADO POR 5. AO FINAL MOSTRAR OS CONTEÚDOS DOS DOIS VETORES.
		 */

		Scanner input = new Scanner(System.in);

		int vetA[] = new int[10];

		for (byte i = 0; i < vetA.length; i++) {

			System.out.print((i + 1) + "º Número: ");
			vetA[i] = input.nextInt();

		}

		int vetB[] = new int[vetA.length];
		System.out.println("------------------------");
		System.out.print("Vetor A: ");
		for (byte i = 0; i < vetB.length; i++) {
			System.out.print(vetA[i] + " ");

			if (vetA[i] % 2 == 0)
				vetB[i] = vetA[i] * 5;
			else
				vetB[i] = vetA[i] + 5;

		}
		
		System.out.println();
		System.out.println("------------------------");
		System.out.print("Vetor B:");
		
		for (int i = 0; i < vetB.length; i++) {
			System.out.print(" " + vetB[i]) ;
		}
	}

}
