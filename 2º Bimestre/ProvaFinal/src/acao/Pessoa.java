package acao;

public class Pessoa {
	
	private String nome;
	private String cpf;
	
	void imprimirDados(Pessoa p){
		System.out.println("Nome: " + p.nome);
		System.out.println("CPF: " + p.cpf);
	}

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

}
