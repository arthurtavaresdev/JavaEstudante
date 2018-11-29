package escola;

public class Funcionario {
	
	private int matricula;
	private String nome;
	private double salario;

	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	} 
	
	public void ImprimirFuncionario(){
		System.out.println("Matricula: " + this.getMatricula());
		System.out.println("Nome: " + this.getNome());
		System.out.println("Salario: " + this.getSalario());

	}
	
}
