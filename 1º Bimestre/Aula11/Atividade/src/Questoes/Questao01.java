package Questoes;

import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("1º Número: ");
		int num1 = input.nextInt();

		input = new Scanner(System.in);
		System.out.print("2º Número: ");
		int num2 = input.nextInt();

		input = new Scanner(System.in);
		System.out.println("1 - SOMAR");
		System.out.println("2 - SUBTRAIR");
		System.out.println("3 - MULTIPLICAR");
		System.out.println("4 - DIVIDIR");
		System.out.print("3º Número: ");
		int num3 = input.nextInt();

		if (num3 == 1) {
			System.out.println(num1 + num2);
		} else if (num3 == 2) {
			System.out.println(num1 - num2);
		} else if (num3 == 3) {
			System.out.println(num1 * num2);
		} else if (num3 == 4) {
			System.out.println(num1 / num2);
		}

	}

}
