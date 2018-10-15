package acao;

import java.util.Scanner;

public class ProvinhaExer1 {

	public static void main(String[] args) {
		/*
		 * FAÇA UM ALGORITMO O QUAL VOCÊ POSSA ENTRAR COM VÁRIOS NÚMEROS, O SEU
		 * ALGORITMO DEVERÁ MOSTRAR QUANTOS NÚMEROS PRIMOS EXISTEM DE 1 ATÉ O
		 * NÚMERO DIGITADO. OBS: O NÚMERO ZERO SERÁ UMA CONDIÇÃO DE SAÍDA. ASSIM
		 * QUANDO DIGITADO O NÚMERO ZERO O PROGRAMA DEVERÁ MOSTRAR A MSG "FIM".
		 */

		Scanner input = new Scanner(System.in); // SCANNER PARA LEITURA DOS DADOS.

		short i = 0; // DECLARAÇÃO DO CONTADOR PARA FORMATAÇÃO(APENAS ESTÉTICO)
		
		short cont = 0; // DECLARAÇÃO DO CONTADOR (IDENTIFICADOR DE PRIMOS);
		
		System.out.println("--- Números primos ---"); // FRASES INICIAIS
		System.out.println("Digite 0 para sair."); // FRASES INICIAIS
		
		while (true) {
			
			i++; // CONTADOR PARA FORMATAÇÃO(APENAS ESTÉTICO)
			
			short primo = 0; // VARIAVEL CONTADORA DE NÚMEROS PRIMO "GERAL";
			
			System.out.print("Digite o " + i + "º Número: ");
			int num = input.nextInt(); // LEITURA DOS NÚMEROS

			if (num == 0){ 
				System.out.println("FIM");
				break;
			} // CONDIÇÃO PARA O FIM DO PROGRAMA.
			
			for (int num2 = 1; num2 <= num; num2++) {

				for (short j = 2; j <= num2; j++) {
					if (num2 % j == 0)
						cont++;
				} // FIM DO LOOP PARA VERIFICAÇÃO DOS PRIMOS 
				
				if (cont == 1) {
					primo++;
				} // CONDIÇÃO IDENTIFICANDO QUE É PRIMO
				
				cont = 0; // RESET DO CONTADOR (IDENTIFICADOR DE PRIMOS);
				
			} // FIM DO LOOP PARA PECORRER O NÚMERO.
			
			System.out.println("Existem " + primo + " Números primos entre 1 e " + num); // PRINT DE SAÍDA
 
		} // FIM DO LOOP INFINITO

	}

}
