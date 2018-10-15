package acao;

import java.util.Scanner;

public class Provinha {

	public static void main(String[] args) {

		int indice = 0;
		int numero = 0;
		int numerosPrimos = 1;
		int quantidadeNumerosPrimos = 1;

		while (indice == 0) {
			Scanner read = new Scanner(System.in);
			System.out.println("Digite um número");
			numero = read.nextInt();

			while (numerosPrimos < numero) {
				if (numero % numerosPrimos == 1) {
					quantidadeNumerosPrimos++;
				}

				numerosPrimos++;
			}

			System.out.println(quantidadeNumerosPrimos);
		}

	}

}
