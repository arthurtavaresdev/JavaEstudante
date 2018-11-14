package model;

public class Main {

	public static void main(String[] args) {

		Banco banco = new Banco();
		banco.setNomeBanco("Itau");
		banco.setCnpj("60.746.948/0001-12 ");
		
		Data data = new Data();
		data.setDia(14);
		data.setMes(11);
		data.setAno(2018);
		
		Pessoa pessoa = new Pessoa();
		pessoa.setCpf("020.938.936-22");
		pessoa.setData(data);
		pessoa.setNome("Arthur");
		
		Cliente cliente = new Cliente();
		cliente.setNumeroContrato(3131);
		
		Atendente atendente = new Atendente();
		atendente.setMatricula(277093);
		
		Conta conta = new Conta(0,300);
		conta.setAtendente(atendente);
		conta.setBanco(banco);
		conta.setCliente(cliente);
		conta.setEmprestimo(false);
		conta.setLimite(300);
		conta.setNumeroConta(0);
		conta.setSaldo(1000);
		
		System.out.println("-=--=-=-=-=-=-=-=-=-=-=- INFORMAÇÕES PRÉ-OPERAÇÕES -=--=-=-=-=-=-=-=-=-=-=-");
		banco.imprimirInformacoes();
		data.imprimirInformacoes();
		pessoa.imprimirInformacoes();
		System.out.println("Saldo disponivel: " + conta.mostrarSaldoTotalDisponivel());
		
		System.out.println("-=--=-=-=-=-=-=-=-=-=-=- INFORMAÇÕES DAS PERAÇÕES -=--=-=-=-=-=-=-=-=-=-=-");
		System.out.println("Sacado R$ 1000.00"); conta.sacar(1400);
		System.out.println("Depositado R$ 50.00"); conta.depositar(50);
		System.out.println("Saldo disponível: " + conta.mostrarSaldoTotalDisponivel());
		System.out.println("Saldo limite positivo ? " + conta.verificaSaldoTotalDisponivelPositivo(conta.getSaldo(),conta.getLimite()));
		System.out.println("Pegou emprestimo ?" + conta.imprimirPegouEmprestimo(conta.isEmprestimo()));
		System.out.println("Posso pegar um emprestimo ? " + conta.pegarEmprestimo(400));

		
		Conta conta2 = new Conta(1,300);
		conta2.setAtendente(atendente);
		conta2.setBanco(banco);
		conta2.setCliente(cliente);
		conta2.setEmprestimo(true);
		conta2.setLimite(300);
		conta2.setNumeroConta(1);
		conta2.setSaldo(1400);
		
		conta.transferir(conta2, conta, 100);
		
		System.out.println("-=--=-=-=-=-=-=-=-=-=-=- INFORMAÇÕES PÓS-OPERAÇÕES -=--=-=-=-=-=-=-=-=-=-=-");
		banco.imprimirInformacoes();
		data.imprimirInformacoes();
		pessoa.imprimirInformacoes();
		System.out.println("Saldo disponivel: " + conta.mostrarSaldoTotalDisponivel());
	}

}
