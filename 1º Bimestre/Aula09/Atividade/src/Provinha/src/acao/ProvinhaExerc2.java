package acao;

import java.util.Scanner;

public class ProvinhaExerc2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int num = 0;
		int i = 0;
		int primo = 0;
		boolean stop = true;
		int j = 0;
		int qtd = 0;

		while (stop) {
			primo = 0;
			qtd = 0;
			System.out.println("Digite um número");
			num = entrada.nextInt();

			if (num == 0) {
				System.out.println("FIM");
				break;
			}

			for (i = 1; i < num; i++) {
				primo = 0;

				for (j = 2; j < num; j++) {
					if (i % j == 0) {
						primo++;
					}

				}
				
				if (primo == 2) {
					qtd++;
				}

			}

			System.out.println("Existem " + qtd + " números primos de 1 até " + num);

		}

	}

}
