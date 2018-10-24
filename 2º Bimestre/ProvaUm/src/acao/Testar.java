package acao;

import java.util.Scanner;

public class Testar {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("---- DADOS DO FABRICANTE ---");
		
		System.out.print("Nome do fabricante: ");
		String nome = input.nextLine();
		
		input = new Scanner(System.in);
		
		System.out.print("CNPJ do fabricante: ");
		String cnpj = input.nextLine();
		
		input = new Scanner(System.in);
		
		Fabricante fab = new Fabricante(cnpj,nome);
		
		System.out.println("---- DADOS DO CARRO ---");
		
		System.out.print("Nome: ");
		String nomeCar = input.nextLine();
		
		input = new Scanner(System.in);
		
		System.out.print("Ano: ");
		int ano = input.nextInt();
		
		input = new Scanner(System.in);
		
		System.out.print("Valor: ");
		float valor = input.nextFloat();
		
		Carro car = new Carro(nomeCar,fab,ano,valor);
		
		car.descontarValor(ano);
		car.verificarFabricante();
		car.imprimirCarro();
		

	}

}
