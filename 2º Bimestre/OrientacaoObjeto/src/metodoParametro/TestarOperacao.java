package metodoParametro;

import java.util.Scanner;

public class TestarOperacao {

	public static void main(String[] args) {
		
		Scanner input  = new Scanner(System.in);
		Operacao somar = new Operacao();
		
	/*	System.out.print("Digite o primeiro número: ");
		int num = input.nextInt();
		
		System.out.print("Digite o segundo número: ");
		int num2 = input.nextInt();
		
		System.out.println(somar.somarDoisNumeros(num,num2));
		somar.subtrairDoisNumeros(num, num2);
				*/
		
		System.out.println("Digite um nome: ");
		String nome = input.nextLine();
		
		System.out.println(somar.converterNomeMaisculo(nome));
		System.out.println(somar.converterNomeMinisculo(nome));
		
	}
}
