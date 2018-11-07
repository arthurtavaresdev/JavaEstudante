package model;

import java.util.Scanner;

public class TesteString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Palavra plv = new Palavra();
		/* System.out.println("Digite outra palavra: ");
		plv.setPalavra(input.next());
		System.out.println("Palavra Original: "+ plv.getPalavra());
		System.out.println();
		*/
		System.out.println(plv.colocarHifen("155414141515616161667"));
		
	}

}
