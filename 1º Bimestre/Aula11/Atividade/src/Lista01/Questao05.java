package Lista01;

public class Questao05 {

	public static void main(String[] args) {
		/*
		 * 5 - UTILIZANDO COMANDOS DE REPETIÇÃO IMPRIMA AS SEQUÊNCIAS, COMO O
		 * EXEMPLO ABAIXO: 1.12345678910 2.12345678910 3.12345678910 ATÉ
		 * 10.12345678910
		 */

		for (int i = 1; i <= 10; i++) {
			System.out.print(i + ".");
			for (int j = 1; j <= 10; j++) {
				System.out.print(j);
			}
			System.out.println("");
		}

	}

}
