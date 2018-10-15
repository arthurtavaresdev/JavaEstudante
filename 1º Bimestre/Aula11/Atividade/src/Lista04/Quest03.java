package Lista04;

import java.util.Scanner;

public class Quest03 {

	public static void main(String[] args) {
		/*
		 * 3) FAÇA UM ALGORITMO PARA LER UM VETOR DE 10 NÚMEROS. APÓS ISTO, LER
		 * MAIS UM NÚMERO QUALQUER, CALCULAR E ESCREVER QUANTAS VEZES ESSE
		 * NÚMERO APARECE NO VETOR.
		 */
		
		Scanner input = new Scanner(System.in);
		byte cont = 0;
		int vet[] = new int[10];
		
		for (int i = 0; i < vet.length; i++) {
			System.out.print("Digite o "+ (i+1) + "º Número: ");
			vet[i] = input.nextInt();
		}
		
		System.out.println("-------------------------");
		System.out.println("Digite outro valor");
		int num = input.nextInt();
		
		for (int i = 0; i < vet.length; i++) {
			if(vet[i] == num) cont++;
		}
		
		System.out.println("O Número " + num + " Aparece " + cont + " Vezes.");
				
	}

}
