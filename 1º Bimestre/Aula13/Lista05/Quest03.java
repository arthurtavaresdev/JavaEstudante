package Lista05;

import java.util.Scanner;

public class Quest03 {

	public static void main(String[] args) {
		/*
		 * 3- FAZER UM ALGORITMO PARA VERIFICAR A QUANTIDADE DE NÚMEROS PRIMOS
		 * EM UMA MATRIZ 2X3
		 */
		int primo = 0;
		int vet[][] = new int[2][3];
		System.out.println("Digite 6 números");
		for (int i = 0; i < 2 ; i++) {
			for (int j = 0; j < 3; j++) {
				Scanner input = new Scanner(System.in);
				vet[i][j] = input.nextInt();
				int cont = 0;
				for (int k = 1; k < vet[i][j]; k++) {
					if(vet[i][j] % k == 0){
						cont++;
					}
				}
				
				if(cont < 2  && vet[i][j] != 1){
					primo++;
				}
			}
		}
		
		System.out.println("Existem " + primo + " primos na matriz");
	}

}
