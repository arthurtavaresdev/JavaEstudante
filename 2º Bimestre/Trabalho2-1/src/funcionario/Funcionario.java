package funcionario;

import java.util.*;

public class Funcionario {
	private String nome;
	private String cpf;
	
	List<Funcionario> funcionario = new ArrayList();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	public void addFuncionario(Funcionario func) {
		this.funcionario.add(func);
	}
	
	public boolean pesquisarFuncionario(String cpf) {
		
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
