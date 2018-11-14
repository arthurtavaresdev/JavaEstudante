package model;

public class Pessoa {

	private String nome;
	private String cpf;
	private Data data;
	
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
	public Data getData() {
		return data;
	}
	public void setData(Data data) {
		this.data = data;
	}
	
	public void imprimirInformacoes(){
		System.out.println("--------------- PESSOA ---------------");
		System.out.println("Nome: " + this.nome);
		System.out.println("CPF: "  + this.cpf);
	}
	
	public int verificarIdade(Pessoa pessoa,int anoAtual){
		return pessoa.data.getAno() - anoAtual;
	}
	
	
	
}
