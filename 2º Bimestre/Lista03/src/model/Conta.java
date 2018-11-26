package model;

public class Conta {
	private int numeroConta;
	private double saldo;
	private double limite;
	private Banco banco;
	private Cliente cliente;
	private Atendente atendente;
	private boolean emprestimo;
	
	public Conta(int numeroConta, double limite){
		this.numeroConta = numeroConta;
		this.limite = limite;
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
	public Atendente getAtendente() {
		return atendente;
	}
	public void setAtendente(Atendente atendente) {
		this.atendente = atendente;
	}
	public boolean isEmprestimo() {
		return emprestimo;
	}
	public void setEmprestimo(boolean emprestimo) {
		this.emprestimo = emprestimo;
	}
	
	public void imprimirInformacoes(){
		System.out.println("--------------- CONTA ---------------");
		System.out.println("Número da conta: " + this.numeroConta);
		System.out.println("Saldo: " + this.saldo);
		System.out.println("Limite:" + this.limite);
		System.out.println("Emprestimo: " + this.emprestimo);
	}
	
	public void sacar(double valor){
		if(this.saldo > 0){
			this.saldo -= valor;
			System.out.println("Saque realizado!");
		}else if(this.limite > 0){
			this.limite -= valor;
			this.saldo -= valor;
			System.out.println("Saque realizado!");
		}else{
			System.out.println("Saque recusado!");
		}
		
	}
	
	public void depositar(double valor){
		this.saldo += valor;
		System.out.println("Adicionado R$ " + valor + " a sua conta." );
	}
	
	public double mostrarSaldoTotalDisponivel(){
		return this.saldo + this.limite;
	}
	
	public boolean verificaSaldoTotalDisponivelPositivo(double saldo, double limite) {
		if(this.mostrarSaldoTotalDisponivel() > 0) return true;
		return false;
	}
	
	public boolean pegarEmprestimo(double valor){
		// valor deverá ser menor ou igual a 500 caso seja maior não haverá o empréstimo. Caso já exista um empréstimo não poderá haver um novo.
		if(this.emprestimo){
			return false;
		}else if(valor <= 500){
			this.depositar(valor);
			this.emprestimo = true;
			return true;
		}
		return false;
	}
	
	public String imprimirPegouEmprestimo(boolean emprestimo){
		if(emprestimo){
			return "Emprestimo já concedido anteriormente";
		}
		
		return "Emprestimo ainda não foi concedido";
	
	}
	
	public void transferir(Conta contaOrigem, Conta contaDestino, double valor){
		System.out.println("Transferência ocorrida com sucesso.");
		contaOrigem.setSaldo(valor * -1);
		contaDestino.depositar(valor);
	}
	
	
}
