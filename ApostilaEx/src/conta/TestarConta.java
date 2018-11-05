package conta;

import java.util.Scanner;

public class TestarConta {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		
		System.out.println("Titular - Antes: " + conta.getTitular());
		
		System.out.print("Digite o nome do titular: ");
		Scanner input = new Scanner(System.in);
		String titular = input.next();
		
		conta.setTitular(titular);
		System.out.println("Titular - Depois: " + conta.getTitular());

	}

}
