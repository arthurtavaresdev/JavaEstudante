package Lista01;

import java.util.Scanner;

public class Questao07 {

	public static void main(String[] args) {
		// 7 - ENTRE COM UM NÚMERO E VERIFIQUE SE O MESMO É UM NÚMERO PRIMO OU
		// NÃO.

		Scanner input = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int num = input.nextInt();
		int j = 0;

		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				j++;
			}

		}

		if (j < 2 && num != 1 && num != -1) {
			System.out.println("Este número é primo");
		} else {
			System.out.println("Este número não é primo");
		}

	}

}
