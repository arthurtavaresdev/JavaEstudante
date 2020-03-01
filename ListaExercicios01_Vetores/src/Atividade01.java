import java.util.Random;

public class Atividade01 {

	public static void main(String[] args) {
		
		/**
		 * 1)    Criar  um  vetor  A  com  8  elementos  inteiros.  
		 * Construir  um  vetor  B  de  mesmo  tipo  
		 * e tamanho e com os elementos do vetor A multiplicados por 2, 
		 * ou seja: B[i] = A[i] * 2.
		 * 
		 */
		
		int vetorA[] = new int[8];
		int vetorB[] = new int[8];
		
		Random rand = new Random();
		
		for(int i=0;i < vetorA.length ; i++) {
			vetorA[i] = rand.nextInt(100);		
			vetorB[i] = vetorA[i] * 2;
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
