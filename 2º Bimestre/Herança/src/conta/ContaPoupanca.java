package conta;

public class ContaPoupanca extends Conta {
	
	@Override
	public void atualizar(double taxa){
		
		double saldo = this.getSaldo() ;
		saldo -= this.getSaldo() * (taxa * 3);
		this.setSaldo(saldo);
		
	}
	
	

}
