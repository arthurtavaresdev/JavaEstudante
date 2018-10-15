package Lista05;

import java.util.Scanner;

public class Quest01 {

	public static void main(String[] args) {
		/*
		 * 1- FAZER UM ALGORITMO PARA VERIFICAR A QUANTIDADE DE NÚMEROS PARES E
		 * ÍMPARES DE UMA MATRIZ 3X2
		 */
		
		int vet[][] = new int[3][2];
		int somaPar = 0;
		int somaImpar = 0;
		System.out.println("Digite 6 números");
		for (int i = 0; i < vet.length; i++) {
			
			for (int j = 0; j < 2; j++) {
				Scanner input = new Scanner(System.in);
				vet[i][j] = input.nextInt();
				
				if(vet[i][j] % 2 == 0)
					somaPar++;
				else
					somaImpar++;
				
			}
		}
		
		System.out.println(somaPar + " Números são Pares");
		System.out.println(somaImpar + " Números são Impares");
		
		

	}

}
