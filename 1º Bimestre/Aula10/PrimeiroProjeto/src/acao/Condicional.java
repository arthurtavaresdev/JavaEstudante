package acao;

public class Condicional {

	public static void main(String[] args) {

		int soma = 10;

		if (soma > 5) {
			System.out.println("Maior que 5");
		} else if (soma == 5) {
			System.out.println("É igual a 5");
		} else {
			System.out.println("Menor que 5");
		}
		soma += 5;
		System.out.println(soma);
	}

}
