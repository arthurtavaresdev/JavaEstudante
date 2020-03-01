import java.util.Random;

public class Atividade5 {

	public static void main(String[] args) {
		
		/**
         * 6)    Criar um vetor A com 10 elementos inteiros.
         *  Implementar um programa que defina e escreva a quantidade de elementos
         *   armazenados neste vetor que são pares.
		 */
		
		int vetorA[] = new int[10];
		
		
		Random rand = new Random();
		
		int pares = 0;
		
		for(int i=0;i < vetorA.length ; i++) {
			vetorA[i] = rand.nextInt(100)+1;
			if(vetorA[i] % 2 == 0) {
				pares++;
			}
		}
		
		System.out.println("No vetor A há " + pares + " itens pares");
	
	
		
	}

}
