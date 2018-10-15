package Questoes;

import java.util.Scanner;

public class Loop {
	public static void main(String[] args) {

		boolean teste = true;

		do {

			Scanner input = new Scanner(System.in);
			System.out.println("1 - ADIÇÃO");
			System.out.println("2 - SUBTRAÇÃO");
			System.out.println("3 - DIVISÃO");
			System.out.println("4 - MULTIPLICAÇÃO");
			System.out.println("5 - SAIR");
			System.out.print("Digite a opção: ");
			int caso = input.nextInt();
			if (caso == 5)
				break;
			if (caso > 5 || caso <= 0)
				System.out.println("Digite um número válido");
			else {

				input = new Scanner(System.in);
				System.out.print("Digite um número: ");
				int num = input.nextInt();

				System.out.println("----------------------------------");

				switch (caso) {
				case 1:
					for (int i = 1; i <= 10; i++) {
						System.out.println(num + " + " + i + " = " + (num + i));
					}
					break;

				case 2:
					for (int i = 1; i <= 10; i++) {
						System.out.println(i + " - " + num + " = " + (i - num));
					}
					break;

				case 3:
					for (float i = 1; i <= 10; i++) {
						System.out.println(num + " / " + i + " = " + (num / i));
					}
					break;

				case 4:
					for (int i = 1; i <= 10; i++) {
						System.out.println(num + " X " + i + " = " + (num * i));
					}
					break;

				case 5:
					teste = false;
					System.out.println("Finalizando o programa...");

					break;
				}

			}

			System.out.println("----------------------------------");

		} while (teste == true);

	}
}
