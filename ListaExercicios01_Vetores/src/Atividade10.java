
import java.util.Random;

public class Atividade10 {

	public static void main(String[] args) {

		/**
		 *  10) Criar um vetor A com 10 elementos inteiros. Desenvolver um programa que verifique se "todos" os elementos do vetor A são pares. 
		 *  Se pelo menos um elemento do vetor não  for  par  o  processo  de  repetição  para  percorrer  os  elementos  do  vetor  deve  ser encerrado, 
		 *  como sugestão: utilize uma variável do tipo flag para atingir este propósito.
		 */
		
		int vetorA[] = new int[10];
		
		Random rand = new Random();
	
		System.out.println("Vetor A: ");
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = rand.nextInt(100);
		}
	
		System.out.println();
		
		// 1º Método de parada
		for (int i = 0; i < vetorA.length; i++) {
			if(vetorA[i] % 2 == 1) {
				System.out.println("Impar encontrado: " + vetorA[i]);
				break;
			}
		}
		
		
		// 2º Método para a parada
		boolean temPar = false;
		int i = 0;
		while (!temPar) {
			if(vetorA[i] % 2 == 1) {
				temPar = true;
				System.out.println("Impar encontrado: " + vetorA[i]);
			}
			i++;
		}



	}

}
