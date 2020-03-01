import java.util.Random;

public class Atividade2 {

	public static void main(String[] args) {
		
		/**
		 * 2) Criar um vetor A com 15 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho, 
		 * sendo que cada elemento do vetor B deverá ser o quadrado do respectivo elemento de A, 
		 * ou seja: B[i] = A[i] * A[I].
		 */
		
		int vetorA[] = new int[15];
		int vetorB[] = new int[15];
		
		Random rand = new Random();
		
		for(int i=0;i < vetorA.length ; i++) {
			vetorA[i] = rand.nextInt(100);		
			vetorB[i] = vetorA[i] * vetorA[i];
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
