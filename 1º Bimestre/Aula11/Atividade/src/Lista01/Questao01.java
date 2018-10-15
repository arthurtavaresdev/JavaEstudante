package Lista01;

import java.util.Scanner;

public class Questao01 {
	public static void main(String[] args) {

		 // 1 - ENTRE COM UM VALOR INTEIRO E IMPRIMA OS SEUS 10 PRÓXIMOS VALORES. (UTILIZAR LAÇO DE REPETIÇÃO)

		Scanner input = new Scanner(System.in);
		System.out.print("Digite um valor: ");
		int num = input.nextInt();
		
		for(int i = 0;i<10;i++){
			
			num += 1;
			System.out.println(num);
		}
		

	}
}
