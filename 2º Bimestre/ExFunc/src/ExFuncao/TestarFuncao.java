package ExFuncao;

import java.util.Scanner;

public class TestarFuncao {
	public static void main(String[] args) {
	ExFuncao func = new ExFuncao();

	Scanner input = new Scanner(System.in);

	System.out.println("Digite um número");
	int num = input.nextInt();
	System.out.println(func.ex8(num));
	
	}

}
