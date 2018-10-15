package Lista02;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		byte i = 0;
		float soma = 0;
		short maior = 0;
		short menor = 0;

		while (true) {

			System.out.println("Digite o " + (i + 1) + "º Número");
			short num = input.nextShort();
			if (num == 0)
				break;
			soma += num;

			if (i == 0)
				menor = maior = num;

			if (num < menor)
				menor = num;
			if (num > maior)
				maior = num;

			i++;
		}

		float media = (float) soma / i;
		System.out.println("Foram digitados " + i + " Números");
		System.out.println("O menor número digitado foi: " + menor);
		System.out.println("O maior número digitado foi: " + maior);
		System.out.println("A media dos números digitados é " + media);

	}

}
