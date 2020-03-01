import java.util.Random;

public class Atividade4 {

	public static void main(String[] args) {
		/**
		 * 4)    Criar  dois  vetores  A  e  B  cada  um  com  10  elementos  inteiros.  
		 * Construir  um  vetor  C, onde cada elemento de C é a subtração dos respectivos elementos em A e B, 
		 * ou seja: C[i] = A[i] – B
		 */
		
		int vetorA[] = new int[10];
		int vetorB[] = new int[10];
		int vetorC[] = new int[10];
		
		Random rand = new Random();
		
		for(int i=0;i < vetorA.length ; i++) {
			vetorA[i] = rand.nextInt(100);		
			vetorB[i] = rand.nextInt(100);
			vetorC[i] = vetorA[i] - vetorB[i];
		}
		System.out.println("\n Vetor A:");
		for(int i=0;i < vetorA.length ; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println("\n Vetor B:");
		for(int i=0;i < vetorB.length ; i++) {
			System.out.print(vetorB[i] + " ");
		}
		
		System.out.println("\n Vetor C:");
		for(int i=0;i < vetorC.length ; i++) {
			System.out.print(vetorC[i] + " ");
		}

	}

}
