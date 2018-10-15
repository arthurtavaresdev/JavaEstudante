package Questoes;

import java.util.Scanner;

public class Questao07 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Digite um número: ");
		short num = input.nextShort();

		for (short i = 0; i <= num; ++i) {

			System.out.println(i);

		}
	}
}
