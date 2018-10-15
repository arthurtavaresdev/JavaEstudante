package acao;

import java.util.Scanner;

public class ParesExistentes {

	public static void main(String[] args) {
		int num = 0;

		while (num <= 50) {
			Scanner leia = new Scanner(System.in);
			System.out.println("Digite um número maior ou igual a 50.");
			num = leia.nextInt();

			if (num < 50) {
				System.out.println("Erro! Número inferior a 50.");
			}
		}

		int i = 0;
		while (i <= num) {
			i++;
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

			Scanner leia = new Scanner(System.in);
			System.out.println("Digite a posição que deseja imprimir.");
			int posic = leia.nextInt();
			int j = 0;
			int k =0 ;
			
			while (posic != k) {
				j++;
				
				if(j % 2 == 0){
					k++;
				}
								
			}
			System.out.println(j);
			
		}
}
