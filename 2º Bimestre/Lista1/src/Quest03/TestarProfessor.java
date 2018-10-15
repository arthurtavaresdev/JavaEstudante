package Quest03;

import java.util.*;

public class TestarProfessor {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Data data = new Data();
		
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Digite os dados do " + (i + 1) + "º Professor");

			input = new Scanner(System.in);
			System.out.println("Digite o nome do professor: ");
			String prof = input.nextLine();

			input = new Scanner(System.in);
			System.out.println("Digite o nome da disciplina: ");
			String disc = input.nextLine();

			input = new Scanner(System.in);
			System.out.println("Digite o número de registro: ");
			int reg = input.nextInt();

			String dia = "";
			
			while (true) {
				input = new Scanner(System.in);
				System.out.println("Digite o dia da admissão: ");
				dia = input.next();
				data.getDadosSistema(dia);
				
				if (data.valData())
					break;
				System.out.println("Data invalida");
			}

			Professor prof2 = new Professor(prof, disc, reg, dia);

			prof2.imprimir();
		}
		
		System.out.println("<<< FIM DO PROGRAMA >>>");
	}

}
