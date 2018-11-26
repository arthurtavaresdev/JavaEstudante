package funcionario;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Funcionario controle = new Funcionario();

		Scanner input = new Scanner(System.in);
		
		int opcao = 0;
				
		while(true) {
			Funcionario funcionario = new Funcionario();
			
			System.out.println("-----------  DEPARTAMENTO PESSOAL -----------");
			System.out.println("1 - Cadastro de funcionario");
			System.out.println("2 - Pesquisar funcionario");
			System.out.println("3 - Remover funcionario");
			System.out.println("4 - Imprimir todos os funcionario");
			System.out.println("0 - Sair");
			System.out.print("Escolha sua opção: ");
			opcao = input.nextInt();
			
			if(opcao == 0) {
				break;
			}
			
			switch (opcao) {
			case 1:
				System.out.println("Insira os dados do funcionario:");
				System.out.print("CPF: ");
				funcionario.setCpf(input.next());
				System.out.print("Nome: ");
				funcionario.setNome(input.next());
				
				controle.addFuncionario(funcionario);
			break;
			case 2:
				System.out.println("Insira o CPF do pesquisado");
				controle.pesquisarFuncionario(input.next());
				break;
			case 3:
				System.out.println("Digite o número de registro (Index) do funcionario: ");
				controle.removerFuncionario(input.nextInt());
				break;
			case 4:
				controle.imprimirFuncionarios();
				break;
			default:
				System.out.println("Digite uma opção válida entre 0 e 4.");
				break;
			}
		}

	}

}
