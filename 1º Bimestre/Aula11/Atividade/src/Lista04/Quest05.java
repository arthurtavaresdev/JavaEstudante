package Lista04;

import java.util.Scanner;

public class Quest05 {

	public static void main(String[] args) {
		/*
		 * 5) DESENVOLVER UM ALGORITMO PARA LER DOIS VETORES A E B COM 10 ELEMENTOS.
		 * CONSTRUIR UM VETOR C, ONDE CADA ELEMENTO DE C É A SUBTRAÇÃO DO ELEMENTO
		 * CORRESPONDENTE DE A COM B.
		 */
		
		Scanner input = new Scanner(System.in);
		int a[] = new int[10];
		int b[] = new int[10];
		
		System.out.println("--------- VETOR A --------- ");
		for (int i = 0; i < a.length; i++) {
			System.out.print("Digite o " + (i+1) + "º Número: ");
			a[i] = input.nextInt();
						
		}
		
		System.out.println("--------- VETOR B --------- ");
		
		for (int i = 0; i < b.length; i++) {
			System.out.print("Digite o " + (i+1) + "º Número: ");
			b[i] = input.nextInt();
						
		}
			
		int c[] = new int[a.length];
		System.out.println("--------- VETOR C --------- ");
		for (int i = 0; i < b.length; i++) {
			
			c[i] = a[i] - b[i];
			System.out.print(c[i] + " ");
		}
		
	}

}
