package Questoes;

import java.util.Scanner;

public class ChaveSeletora {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String diaDaSemana = input.nextLine();
		
		switch(diaDaSemana){
		
		case "Domingo":
			System.out.println("Você informou o 1º Dia");
		break;
		
		case "Segunda":
			System.out.println("Você informou o 2º Dia");
		break;
		
		case "Terça":
			System.out.println("Você informou o 3º Dia");
		break;
		
		case "Quarta":
			System.out.println("Você informou o 4º Dia");
		break;
		
		case "Quinta":
			System.out.println("Você informou o 5º Dia");
		break;
		
		case "Sexta":
			System.out.println("Você informou o 6º Dia");
		break;
		
		case "Sabado":
			System.out.println("Você informou o 7º Dia");
		break;
		
		default:
			System.out.println("Digite um dia válido");
			break;
		
		}

	}
}
