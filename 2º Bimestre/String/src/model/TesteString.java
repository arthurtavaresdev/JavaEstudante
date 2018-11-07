package model;

import java.util.Scanner;

public class TesteString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Palavra plv = new Palavra();
		
		System.out.println("Digite outra palavra: ");
		plv.setPalavra(input.next());
		System.out.println("Palavra Original: "+ plv.getPalavra());
		System.out.println("Tudo Maisculo: " + plv.tudoMaisculo(plv.getPalavra()));
		System.out.println("Tudo Minisculo: " + plv.tudoMinusculo(plv.getPalavra()));
		System.out.println("Quantos caracteres: " + plv.quantidadeCaracter(plv.getPalavra()));
		System.out.println("Apareceu quantas vzs: " + plv.apareceuQuantasVezes(plv.getPalavra(), 'O'));
		
		System.out.println(plv.colocarHifen1(plv.getPalavra()));
		System.out.println(plv.colocarHifen2(plv.getPalavra()));
	}

}
