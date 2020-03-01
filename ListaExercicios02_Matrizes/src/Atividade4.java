import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {

		/**
		 * 4.    Faça um programa para armazenar em uma matriz os compromissos de uma agenda pessoal.
		 *  Cada dia do mês deve conter 24 horas, 
		 *  onde para cada uma destas 24 horas podemos  
		 *  associar  uma  tarefa  específica  (compromisso  agendado). 
		 *   O  programa deve ter um menu onde o usuário indica o dia do mês que deseja alterar e
		 *    a hora, entrando  em  seguida  com  o  compromisso,  ou  então,  o  usuário
		 *      pode  também consultar   a   agenda,   fornecendo   o   dia   e   hora 
		 *        para   obter   o   compromisso armazenado.
		 */

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		String agenda[][] = new String[31][24];
		System.out.println(" Agendinha ");
		int opcao = 0;
		while(opcao != 3) {
			System.out.println("1- Inserir/Alterar compromisso");
			System.out.println("2- Consultar compromisso");
			System.out.println("3- Sair");
			System.out.println("Escolha uma opção: ");
			opcao = input.nextInt();
			
			switch (opcao) {
			case 1:
				System.out.println("Inserir/Alterar na Agenda");
				System.out.print(" Dia: ");
				int dia = input.nextInt();
				input = new Scanner(System.in);
				System.out.print(" Hora: ");
				int hora = input.nextInt();
				input = new Scanner(System.in);
				System.out.println("Nome do comprisso: ");
				agenda[dia][hora] = input.nextLine();
				
				break;
			
			case 2:
				System.out.println("Consultar Agenda");
				System.out.print(" Dia: ");
				int dia1 = input.nextInt();
				System.out.print(" Hora: ");
				int hora1 = input.nextInt();
				
				String resposta = agenda[dia1][hora1] != null ? agenda[dia1][hora1] : "Não há compromisso agendado para este dia";
				
				System.out.println("Compromisso:" + resposta);
				break;

			default:
				System.out.println("Até mais.");
				break;
			}
		}
		

		
	}

}
