package escola;

public class Professor extends Funcionario {
	
	private String formacao;
	private int anosMagist;
	
	public String getFormacao() {
		return formacao;
	}
	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}
	public int getAnosMagist() {
		return anosMagist;
	}
	public void setAnosMagist(int anosMagist) {
		this.anosMagist = anosMagist;
	}
	
	@Override
	public void ImprimirFuncionario(){
		System.out.println("Matricula: " + this.getMatricula());
		System.out.println("Nome: " + this.getNome());
		System.out.println("Salario: " + this.getSalario());
		System.out.println("Formação: " + this.getFormacao());
		System.out.println("Anos de magistrado: " + this.anosMagist);
	}
	
}
