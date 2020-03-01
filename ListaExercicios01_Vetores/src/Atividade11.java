import java.util.Scanner;

public class Atividade11 {

	public static void main(String[] args) {
		
		/**
		 * 
         * 11) Ler um vetor A com 20 elementos. 
         * Construir dois vetores B e C, sendo que nos vetores B e C serão armazenados o valores pares e ímpares de A,
         *  respectivamente.
		 */
		
		int vetorA[] = new int[20];
		int vetorB[] = new int[20];
		int vetorC[] = new int[20];
		
	
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		int z = 0 ,j = 0;
		
		for(int i=0;i < vetorA.length ; i++) {
			System.out.println("Digite o " + (i+1) + "º número: ");
			vetorA[i] = input.nextInt();
			if(vetorA[i] %  2 == 0) {
				vetorB[j] = vetorA[i];
				j++;
			}else {
				vetorC[z] = vetorA[i];
				z++;
			}
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
