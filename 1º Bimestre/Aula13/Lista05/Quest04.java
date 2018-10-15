package Lista05;

import java.util.Scanner;

public class Quest04 {

	public static void main(String[] args) {
		/*
		 * 4- FAÇA UM ALGORTIMO UTILIZANDO UMA MATRIZ QUADRADA ONDE DEVERÁ
		 * SEGUIR A SEGUINTE REGRA: TODOS OS VALORES DA DIAGONAL PRINCIPAL QUE
		 * SÃO PARES DEVERÃO SER MULTIPLICADOS POR 2 E TODOS OS VALORES DA
		 * DIAGONAL SECUNDÁRIA QUE SÃO ÍMPARES DEVERÃO SER MULTIPLOCADOS POR 3.
		 */

		int vet[][] = new int[3][3];
		System.out.println("Digite diversos valores: ");
		for (int i = 0; i < vet.length; i++) {
			for (int j = 0; j < vet.length; j++) {
				Scanner input = new Scanner(System.in);
				vet[i][j] = input.nextInt();
				
				if (i == j) {
					if (vet[i][j] % 2 == 0) {
						vet[i][j] *= 2;
					}
				}

				if (i + j == vet.length - 1) {
					if (vet[i][j] % 2 == 1) {
						vet[i][j] *= 3;
					}
				}
			}
		}

		for (int i = 0; i < vet.length; i++) {
			for (int j = 0; j < vet.length; j++) {
				System.out.print(vet[i][j] + " ");
			}
			System.out.println();
		}
		

	}

}
