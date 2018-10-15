package Lista05;

import java.util.Scanner;

public class Quest05 {

	public static void main(String[] args) {
		/*
		 * 5- FAÇA UM ALGORTIMO QUE LEIA UMA MATRIZ 3X3 GUARDE TODOS OS VALORES
		 * MAIORES OU IGUAIS A 10 EM UM VETOR A E OS NÚMEROS MENORES QUE 10 EM
		 * UM VETOR B. IMPRIMA OS DOIS VETORES(“CASO NÃO SEJA VAZIO”)
		 */

		int mat[][] = new int[3][3];
		int maiorDez = 0;
		int menorDez = 0;

		Scanner input = new Scanner(System.in);

		System.out.println("Digite 9 números");

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				input = new Scanner(System.in);
				mat[i][j] = input.nextInt();

				if (mat[i][j] >= 10) {
					maiorDez++;
				} else {
					menorDez++;
				}

			}
		}

		int vetA[] = new int[maiorDez];
		int vetB[] = new int[menorDez];
		int contA = 0;
		int contB = 0;

		 for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {

				if (mat[i][j] >= 10) {
					contA++;
					vetA[vetA.length - contA] = mat[i][j];
					
				}
				if (mat[i][j] < 10) {
					contB++;
					vetB[vetB.length  - contB] = mat[i][j];
					
				}

			}
		} 

		System.out.println("Maiores que 10:");
		for (int i = 0; i < vetA.length; i++) {
			System.out.print(" " + vetA[i]);
		}

		System.out.println("");

		System.out.println("Menores que 10");
		for (int i = 0; i < vetB.length; i++) {
			System.out.print(" " + vetB[i]);
		}

	} 
}
