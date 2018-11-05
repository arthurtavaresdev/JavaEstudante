package conta;

public class Conta {

	private static int totalDeContas;
	private String titular;

	public Conta() {
		
		Conta.totalDeContas = Conta.totalDeContas + 1;
	}

	public int getTotalDeContas() {

		return Conta.totalDeContas;

	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	

}
