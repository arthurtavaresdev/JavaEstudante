package herança;

public class Main {

	public static void main(String[] args) {
		
		ControleBonificacoes controle = new ControleBonificacoes();
		
		Gerente gerente = new Gerente();
		Funcionario  funcionario = new Funcionario();
		
		funcionario.setNome("Joaquim");
		funcionario.setCpf("020.938.020");
		funcionario.setSalario(3000);
		
		
		gerente.setNome("João");
		gerente.setCpf("020.938.020");
		gerente.setSalario(10000);
		
		controle.registra(funcionario);
		System.out.println("Funcionario: " + funcionario.getBonificacao());
		
		controle.registra(gerente);
		
		System.out.println("Gerente: " + gerente.getBonificacao());
		System.out.println("Controle: " + controle.getTotalDeBonificacoes());
		
	}

}
