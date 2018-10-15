package Questoes;

import java.util.Scanner;

public class Questao04 {

	public static void main(String[] args) {
		
		int num = 0;
		
		while(num <= 50){
			Scanner input = new Scanner(System.in);
			System.out.println("Digite o número");
			num = input.nextInt();
		}
		
		int i = 0;
		int j = 0; 
		
		while(i <= num){
			i++;
			if(i%2 == 0){
				j++;
			}
		}
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite a posição");
		int num2 = input.nextInt();
		i = 0;

		
		
	}

}
