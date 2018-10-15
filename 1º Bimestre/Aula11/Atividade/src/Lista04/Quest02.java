package Lista04;

import java.util.Scanner;

public class Quest02 {

	public static void main(String[] args) {
		/*
		 * 2) FAÇA UM ALGORITMO PARA LER 10 NÚMEROS E ARMAZENAR EM UM VETOR. APÓS ISTO,
		 * O ALGORITMO DEVE ORDENAR OS NÚMEROS NO VETOR EM ORDEM CRESCENTE. ESCREVER O
		 * VETOR ORDENADO.
		 */

		int numDes[] = new int[10];
		Scanner input = new Scanner(System.in);

		for (int i = 0; i < numDes.length; i++) {
			System.out.println("Digite o " + i + "º Número");
			numDes[i] = input.nextInt();
		}

		int numOrd[] = new int[10];

		int aux = 0;
		
		for (int i = 0; i < numOrd.length; i++) {
			numOrd[i] = numDes[i];
		}
		

		for (int i = 0; i < numDes.length; i++) {
			
			
			for (int j = 0; j < (numOrd.length - 1); j++) {
				
				if (numOrd[j] > numOrd[j + 1]) {
					
					aux = numOrd[j];
					numOrd[j] = numOrd[j + 1];
					numOrd[j + 1] = aux;
					
				}
			}
		}

		System.out.println("Vetor organizado:");
		for (int i = 0; i < numDes.length; i++) {
			System.out.println(" " + numOrd[i]);
		}

	}

}
