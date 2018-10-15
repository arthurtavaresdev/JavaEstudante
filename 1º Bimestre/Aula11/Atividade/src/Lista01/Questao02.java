package Lista01;

import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		//  FAÇA UM PROGRAMA QUE ACEITE SOMENTE NÚMEROS ENTRE 1 E 10. UMA VEZ ACEITO O NÚMERO, IMPRIMA A TABUADA DE MULTIPLICAÇÃO DE 1 ATÉ 10.
		
		int num = 0;
		Scanner input = new Scanner(System.in);
		
		while(num <= 0 || num > 10){
			System.out.print("Digite um número entre 1 e 10: ");
			num = input.nextInt();
		}
		
		for(byte i = 1;i<=10;i++){
			System.out.println(num + " x " + i + " = " + (num*i) );
		}

	}

}
