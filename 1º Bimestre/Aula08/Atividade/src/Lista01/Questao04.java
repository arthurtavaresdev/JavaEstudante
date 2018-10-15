package Lista01;

import java.util.Scanner;

public class Questao04 {

	public static void main(String[] args) {
		/*
		 * 4 - FAÇA UM PROGRAMA QUE ACEITE VÁRIOS NÚMEROS. VOCÊ PODERÁ DIGITAR
		 * QUANTOS NÚMEROS QUISER, PORÉM CASO VOCÊ DIGITE 6 NÚMEROS NO INTERVALO
		 * ENTRE 10 E 20. O PROGRAMA FINALIZA.
		 */

		Scanner input = new Scanner(System.in);
		byte i = 0;

		while (true) {
			System.out.println("Número: ");
			int num = input.nextInt();

			if (num >= 10 && num <= 20)
				i++;

			if (i == 6)
				break;
		}
		System.out.println("Fim de programa...");

	}

}
