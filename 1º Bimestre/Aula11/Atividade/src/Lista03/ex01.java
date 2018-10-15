package Lista03;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {

		/*
		 * 1) FAÇA UM ALGORITMO PARA LER: UM VETOR A DE 10 NÚMEROS. APÓS, LER
		 * MAIS UM NÚMERO E GUARDAR EM UMA VARIÁVEL X. ARMAZENAR EM UM VETOR M O
		 * RESULTADO DE CADA ELEMENTO DE A MULTIPLICADO PELO VALOR X. LOGO APÓS,
		 * IMPRIMIR O VETOR M.
		 */
		Scanner input = new Scanner(System.in);

		int a[] = new int[9];
		int m[] = new int[9];

		for (int i = 0; i < a.length; i++) {
			System.out.print("Digite o " + (i + 1) + "º número: ");
			a[i] = input.nextInt();
		}
		System.out.println("-----------------------------");
		System.out.print("Digite um multiplicador: ");
		int mul = input.nextInt();

		for (int i = 0; i < m.length; i++) {

			m[i] = a[i] * mul;

			System.out.println(a[i] + " x " + mul + " = " + m[i]);
		}

	}

}
