package conta;

public class Conta {
	
	protected double saldo;
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void depositar(double valor){
		this.saldo += valor;
	}
	
	public void sacar(double valor){
		this.saldo -= valor;
	}
	
	public void atualizar(double taxa){
		this.saldo -= this.saldo * taxa;
	}
	
	

}
