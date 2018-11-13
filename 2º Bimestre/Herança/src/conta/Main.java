package conta;

public class Main {

	public static void main(String[] args) {

		Conta conta = new Conta();
		ContaCorrente corrente = new ContaCorrente();
		ContaPoupanca poupanca = new ContaPoupanca();
		
		conta.depositar(1500);
		conta.sacar(500);
		conta.atualizar(0.10);
		System.out.println("Conta normal: " + conta.getSaldo());
		
		corrente.depositar(1500);
		corrente.sacar(500);
		corrente.atualizar(0.10);
		System.out.println("Conta corrente: " + corrente.getSaldo());
		
		poupanca.depositar(1500);
		poupanca.sacar(500);
		poupanca.atualizar(0.10);
		System.out.println("Conta poupanca: " + poupanca.getSaldo());
		
	}

}
