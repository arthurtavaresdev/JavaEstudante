import java.util.Arrays;
import java.util.Random;

public class Atividade7 {

	public static void main(String[] args) {
		
		/**
         * 7)    Criar um vetor A com 10 elementos inteiros. 
         * Implementar um programa que defina e escreva a soma de todos os elementos
		 * armazenados neste vetor.
		 */
		
		int vetorA[] = new int[10];
		
		Random rand = new Random();
	
		for(int i=0;i < vetorA.length ; i++) {
			vetorA[i] = rand.nextInt(100)+1;	
		}

		// Maneira esperadaCC
		int soma = 0;
		for(int i=0;i < vetorA.length ; i++) {
			soma += vetorA[i];
		}
		System.out.println(soma);
		
		
		// Maneira que eu faria de verdade.
		Arrays.stream(vetorA).reduce(Integer::sum).ifPresent(s -> System.out.println(s));
		
		
	}

}
