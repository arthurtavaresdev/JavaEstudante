package Lista01;

import java.util.Scanner;

public class Questao03 {

	public static void main(String[] args) {
		/*
		 * 3 - FAÇA UM ALGORITMO QUE VOCÊ ENTRE COM 5 NÚMEROS, NO FINAL IMPRIMA
		 * A QUANTIDADE DE NÚMEROS QUE FORAM MENOR QUE 0.
		 */
		
		byte j = 0;
		Scanner input = new Scanner(System.in);
		
		for (byte i = 0; i < 5; i++) {

			System.out.print("Digite o " + (i+1) + "º número: ");
			int num = input.nextInt();
			
			if(num < 0) j++;
		}

		System.out.println(j + " Números são menores que 0.");
	}

}
