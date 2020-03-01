import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {

		/**
		 *3.    Capture  do  teclado  valores  para  preenchimento  de  uma  matriz  M  3x3. 
		 * Após  a captura  imprima  a  matriz  criada  e  encontre  a  quantidade  de  números  pares, 
		 *  a quantidade de números ímpares.  
		 */

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		int vetorM[][] = new int[3][3];

		for (int i = 0; i < vetorM.length; i++) {
			for (int j = 0; j < vetorM.length; j++) {
				System.out.println("Digite o valor da " + i + "º Linha " + j + "º Coluna");
				vetorM[i][j] = input.nextInt();
			}
		}

		int pares = 0, impares = 0;
		
		for (int i = 0; i < vetorM.length; i++) {
			for (int j = 0; j < vetorM.length; j++) {
				System.out.print(vetorM[i][j] + " ");
				if(vetorM[i][j] % 2 == 0 ) {
					pares++;
				}else {
					impares++;
				}
			}

			System.out.println();
		}
		
		System.out.println("Há " + pares +" números pares e " + impares + " números impares" );

	}

}
