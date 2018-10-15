package Lista01;

import java.util.Scanner;

public class Questao08 {

	public static void main(String[] args) {
		// 8 - ENTRE COM UM VALOR E MOSTRE SEU FATORIAL.

		Scanner input = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int num = input.nextInt();
		int total = 1;
		
		for(int i = num; i > 0; i--){
			
			total *= i;
			
		}
		
		System.out.println("O fatorial de " + num + " é igual a " + total );
		
	}

}
