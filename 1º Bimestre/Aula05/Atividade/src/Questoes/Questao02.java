package Questoes;

import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Nome do produto: ");
		String name = input.nextLine();

		input = new Scanner(System.in);
		System.out.print("Quantidade de produto: ");
		int prod = input.nextInt();
		
		input = new Scanner(System.in);
		System.out.print("Preço do produto: ");
		double price = input.nextDouble();
		
		double total = prod * price;
		
		if (prod <= 5){
			 total =  total * 0.98;
		} else if (prod > 5 || prod <= 10){
			total =  total * 0.97;
		} else if(prod > 10){
			total =  total * 0.95;
		}

		System.out.println(name + " R$" + total);

	}

}
