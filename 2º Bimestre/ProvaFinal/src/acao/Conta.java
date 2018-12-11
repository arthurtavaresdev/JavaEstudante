package acao;

public class Conta{

	private int numeroConta;
	private double saldo;
	private double limite;
	private Banco banco;
	private Cliente cliente;
	
	void imprimirInformacoesConta(){
		System.out.println(" -- Conta -- ");
		System.out.println("Numero da conta: " + this.numeroConta);
		System.out.println("Saldo: " + this.saldo);
		System.out.println("Limite: " + this.limite);
		System.out.println(" -- Banco -- ");
		banco.imprimirInformacoesBanco();
		System.out.println(" -- Dados -- ");
		cliente.imprimirDados(cliente);
		System.out.println(" -- Contrato -- ");
		cliente.imprimeDataContrato();
	}
	
	void sacar(double valor){
		this.saldo -= valor;
	}
	void depositar(double valor){
		this.saldo += valor;
	}
	double mostrarSaldoTotalDisponivel(){
		return saldo + limite;
	}
	
	public Conta(int numeroConta, double limite){
		this.numeroConta = numeroConta;
		this.limite = limite;
	}
	
	boolean verificaSaldoTotalDisponivelPositivo(double saldo,double limite){
			
		double saldoDisp = saldo + limite;
		
		if(saldoDisp > 0){
			return true;
		} return false;
	}
	
	void transferir(Conta contaOrigem, Conta contaDestino, double valor){
		contaOrigem.sacar(valor);
		contaDestino.depositar(valor);
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
}
