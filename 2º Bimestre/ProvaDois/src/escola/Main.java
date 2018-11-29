package escola;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		List<Funcionario> lista = new ArrayList<Funcionario>();
		Funcionario func = new Professor();
		ControleEscola controle = new ControleEscola();
		

		// Vai imprimir NULL.
		lista.add(func);
		
		System.out.println("=--=-=-=-=-=-=-=-=- REGISTRO DOS PROFESSORES -=-=-=-=-=-");
	
		
		while(true){
			Professor prof = new Professor();
			System.out.println("Digite os dados do professor:");
			System.out.print("Nome: "); 
			prof.setNome(input.next());
			
			System.out.print("Salário: "); 
			prof.setSalario(input.nextDouble());
			
			System.out.print("Matricula: "); 
			prof.setMatricula(input.nextInt());
		
			System.out.println("Formacao: ");
			prof.setFormacao(input.next());
			
			System.out.println("Anos de Magisterio: ");
			prof.setAnosMagist(input.nextInt());
			
			System.out.println("Deseja continuar [S/N]? ");
			char continuar = input.next().toUpperCase().charAt(0);
			
			
			controle.addFuncionario(prof);
			lista.add(prof);
			
			if(continuar == 'N'){
				break;
			}
			
		
			
		}
		
		System.out.println("Finalizando o programa...");
		System.out.println("Demostrando todos os funcionarios registrados");
		System.out.println("Funcionarios que comecam com a letra A: ");
		System.out.println(controle.ImprimirFuncionariosQueComecemComA());
		System.out.println("Quantidade funcionarios: " + controle.quantidadeDeFuncionarios());
		
		for (Funcionario funcionario : lista) {
			System.out.println("---------------");
			funcionario.ImprimirFuncionario();
		}
		
		
		
		
	}


	

}
