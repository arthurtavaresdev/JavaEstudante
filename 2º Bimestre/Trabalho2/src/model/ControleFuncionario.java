package model;

import java.util.*;

public class ControleFuncionario extends Funcionario {
	
	List<Funcionario> funcionario = new ArrayList();
	
	public void addFuncionario(Funcionario func) {
		this.funcionario.add(func);
		System.out.println();
	}
	
	public boolean pesquisarFuncionario(String cpf) {
		
		// Declarei como boolean apenas para utilziação do return e parar a função para execução da mensagem
		

		for (Funcionario funcionario2 : funcionario) {
			if(funcionario2.getCpf().equals(cpf)) {
				System.out.println("CPF: " + funcionario2.getCpf());
				System.out.println("Nome: " + funcionario2.getNome());
				return true;
			}
		}
		System.out.println("Funcionario(a) não foi encontrado");
		return false;	
	}
	

	
	
	
	public void removerFuncionario(int index){
		System.out.println("Funcionario(a) " + funcionario.get(index).getNome() + 
				" foi removido(a) com sucesso.");
		this.funcionario.remove(index);

	}
	
	public void imprimirFuncionarios() {
		
		System.out.println("Segue a lista de todos os funcionarios(as):");
		int cont = 0;
		for (Funcionario funcionario2 : funcionario) {
			
			System.out.println("Index: " + cont);
			System.out.println("CPF: " + funcionario2.getCpf());
			System.out.println("Nome: " + funcionario2.getNome());
			cont++;
		}
	}
	
	
}
