import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		/*
		 * 
		 * 2) Ler um vetor A com 10 elementos inteiros correspondentes as idades 
		 * de um grupo de pessoas. Escreva um programa que determine e 
		 * escreva a quantidade de pessoas que possuem idade superior a 35 anos.
		 */
		int A[] = new int[10];
		for(int i=0; i < A.length; i++) {
			Scanner input = new Scanner(System.in);
			System.out.printf("Digite a idade da %sº pessoa: \n", (i+1));
			A[i] = input.nextInt();
		}
		
		int qtyOver35 = 0;
		for (int i = 0; i < A.length; i++) {
			if(A[i] > 35) {				
				qtyOver35++;
			}
		}
		
		System.out.printf("Há %s pessoas, acima de 35 anos.", qtyOver35);
		
	}

}
