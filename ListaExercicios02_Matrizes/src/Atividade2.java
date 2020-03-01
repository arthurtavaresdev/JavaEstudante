import java.util.Random;

public class Atividade2 {

	public static void main(String[] args) {
		
		/**
		 * 2.    Gere  e  imprima  uma  matriz  M  10x10  com  valores  aleatórios  entre  0-9.  
		 * Após  isso indique qual é o maior e o menor valor da linha 5 e qual é o maior e o menor valor da coluna 7. 
		 */
		
		Random rand = new Random();
		
		int vetorM[][] = new int[10][10];
		
		for (int i = 0; i < vetorM.length; i++) {
			for (int j = 0; j < vetorM.length; j++) {
				vetorM[i][j] = rand.nextInt(9);
			}
		}
		
		
		@SuppressWarnings("unused")
		int maiorLinha5 = 0;
		int menorLinha5 = 0;
		
		int maiorColuna7 = 0;
		int menorColuna7 = 0;
		
		
		for (int i = 0; i < vetorM.length; i++) {
			for (int j = 0; j < vetorM.length; j++) {
				System.out.print( vetorM[i][j] + " ");
			
				if(i == 5) {
					if(j == 0) {
						maiorLinha5 = menorLinha5 = vetorM[i][j];
					}
					
					if(vetorM[i][j] > maiorLinha5) {
						maiorLinha5 = vetorM[i][j];
					}
				
					if(vetorM[i][j] < menorLinha5) {
						menorLinha5 = vetorM[i][j];
					}
					
				}else if(j == 7) {
					if(i == 0) {
						maiorColuna7 = menorColuna7 = vetorM[i][j];
					}
					
					if(vetorM[i][j] > maiorColuna7) {
						maiorColuna7 = vetorM[i][j];
					}
				
					if(vetorM[i][j] < menorColuna7) {
						menorColuna7 = vetorM[i][j];
					}
				}
				
			}
			System.out.println();
		}
		
		System.out.println("O Maior número da linha 5 é " + maiorLinha5 );
		System.out.println("O Menor número da linha 5 é " + menorLinha5 );
		
		System.out.println("O Maior número da coluna 7 é " + maiorColuna7 );
		System.out.println("O Menor número da coluna 7 é " + menorColuna7 );
		
	}

}
