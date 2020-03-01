import java.util.Random;

public class Atividade6 {

	public static void main(String[] args) {
		
		/**
         * 
         * 5)    Criar um vetor A com 10 elementos inteiros. 
         * Construir um vetor B de mesmo tipo e tamanho,  
         * sendo  que  cada  elemento  do  vetor  B  deverá  ser  
         * o  resto  da  divisão  do respectivo elemento de A por 2 (dois), ou seja: B[i] := A[i] % 2.
		 */
		
		int vetorA[] = new int[10];
		int vetorB[] = new int[10];
		
		Random rand = new Random();
		
		for(int i=0;i < vetorA.length ; i++) {
			vetorA[i] = rand.nextInt(100)+1;		
			vetorB[i] = vetorA[i] % 2;
		}
		System.out.println("\n Vetor A:");
		for(int i=0;i < vetorA.length ; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println("\n Vetor B:");
		for(int i=0;i < vetorB.length ; i++) {
			System.out.print(vetorB[i] + " ");
		}
		
	}

}
