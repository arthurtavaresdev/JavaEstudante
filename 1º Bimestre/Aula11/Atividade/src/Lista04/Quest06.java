package Lista04;

import java.util.Scanner;

public class Quest06 {

	public static void main(String[] args) {
		/*
		 * 6) DESENVOLVER UM ALGORITMO PARA LER 10 ELEMENTOS DE UM VETOR A E CONSTRUIR
		 * UM VETOR B DE MESMA DIMENSÃO COM OS MESMOS ELEMENTOS DE A, SENDO QUE ESTES
		 * DEVERÃO ESTAR INVERTIDOS. OU SEJA, O PRIMEIRO ELEMENTO DE A PASSA A SER O
		 * ÚLTIMO ELEMENTO DE B. O SEGUNDO ELEMENTO DE A PASSA A SER O PENÚLTIMO DE B E
		 * ASSIM POR DIANTE.
		 */
		
		Scanner input = new Scanner(System.in);
		
		int vet[] = new int[10];
		
		System.out.println("Digite os valores do vetor");
		for (int i = 0; i < vet.length; i++) {
			
			System.out.print("Digite o " + (i + 1) + "º Número: ");
			vet[i] = input.nextInt();
			
		}
		
		int inv[] = new int[vet.length];
		int j = vet.length - 1;
		System.out.println("----- Invertido -----");
		for (int i = 0; i < inv.length; i++) {
			inv[i] = vet[j];
			j--;
			System.out.print(inv[i] +" ");
		}
		
	}

}
