package herança;

public class Gerente extends Funcionario {
	protected int senha;
	protected int numeroFuncionarios;
	
	public Gerente(){
		super.getNome();
	}
	
	@Override
	public double getBonificacao(){
		return this.salario * 1.10;
	}
	
	
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
	public int getNumeroFuncionarios() {
		return numeroFuncionarios;
	}
	public void setNumeroFuncionarios(int numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}
	
}
