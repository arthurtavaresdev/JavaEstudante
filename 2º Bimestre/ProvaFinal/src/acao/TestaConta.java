package acao;

public class TestaConta {

	public static void main(String[] args) {
			
		Atendente atendente = new Atendente();
			atendente.setCpf("022.314.513-11");
			atendente.setMatricula("277093");
			atendente.setNome("Marcela");
			System.out.println(" -- Atendente-- ");
			atendente.imprimirAtedente();
			atendente.imprimirDados(atendente);
		
		Cliente cliente = new Cliente();
			cliente.setCpf("020.323.414-12");
			cliente.setDataContratacao("10/12/2018");
			cliente.setNome("José");
			System.out.println(" -- Data do Contrato -- ");
			cliente.imprimeDataContrato();
			cliente.imprimirDados(cliente);
		
		Banco banco = new Banco();
			banco.setCnpj("84.792.489/0001-71");
			banco.setNomeBanco("EderMoney $$");
			banco.imprimirInformacoesBanco();
		
		Conta conta = new Conta(123,300);
			conta.setBanco(banco);
			conta.setCliente(cliente);
			conta.depositar(700);
			conta.sacar(100);
			
		Conta conta2 = new Conta(523,0);
			conta2.setBanco(banco);
			conta2.setCliente(cliente);
			conta.sacar(conta.getSaldo()); 
			
		double valor = 100;
		if(conta2.mostrarSaldoTotalDisponivel() >= 100){
			conta.transferir(conta2, conta, valor);
			System.out.println("Transferencia realizada com sucesso!");
		}else{
			System.out.println("Ocorreu um erro, não há saldo disponivel para efetuação da transferência");
		}
		conta.imprimirInformacoesConta();	
		
	}

}
