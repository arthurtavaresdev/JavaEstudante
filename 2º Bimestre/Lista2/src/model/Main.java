package model;

public class Main {

	public static void main(String[] args) {
		
		Carro ferrari = new Carro();
		Carro bugatti = new Carro();
		Carro lamborghini = new Carro();
		
		ferrari.setTipo("Esportivo");
		ferrari.setCor("Vermelho");
		ferrari.setNumPortas(4);
		ferrari.setPlaca("HLK-9823");
		
		System.out.println("------------------------");
		System.out.println("Valores informados");
		System.out.println("Ferrari: ");
		System.out.println("Cor: " + ferrari.getCor());
		System.out.println("Tipo: " + ferrari.getTipo());
		System.out.println("Número de portas: " + ferrari.getNumPortas());
		System.out.println("Placa: " + ferrari.getPlaca());
		
		
		bugatti.setTipo("Super");
		bugatti.setCor("Preto");
		bugatti.setNumPortas(2);
		bugatti.setPlaca("HLK-9233");
		
		System.out.println("------------------------");
		System.out.println("Valores informados");
		System.out.println("Bugatti: ");
		System.out.println("Cor: " + bugatti.getCor());
		System.out.println("Tipo: " + bugatti.getTipo());
		System.out.println("Número de portas: " + bugatti.getNumPortas());
		System.out.println("Placa: " + bugatti.getPlaca());
		
		lamborghini.setTipo("Super");
		lamborghini.setCor("Amarelo");
		lamborghini.setNumPortas(2);
		lamborghini.setPlaca("HLK-1227");
		
		System.out.println("------------------------");
		System.out.println("Valores informados");
		System.out.println("Ferrari: ");
		System.out.println("Cor: " + lamborghini.getCor());
		System.out.println("Tipo: " + lamborghini.getTipo());
		System.out.println("Número de portas: " + lamborghini.getNumPortas());
		System.out.println("Placa: " + lamborghini.getPlaca());
		
		Carro fusca = new Carro("OUW-3214",4);
		Carro gol = new Carro("Vermelho","Esportivo","ZKE-2319",4);
		
		fusca.setTipo("Popular");
		fusca.setCor("Azul");
		fusca.setNumPortas(2);
		fusca.setPlaca("HLK-9233");
		
		System.out.println("------------------------");
		System.out.println("Valores informados");
		System.out.println("Fusca: ");
		System.out.println("Cor: " + fusca.getCor());
		System.out.println("Tipo: " + fusca.getTipo());
		System.out.println("Número de portas: " + fusca.getNumPortas());
		System.out.println("Placa: " + fusca.getPlaca());
		
		gol.setTipo("Popular");
		gol.setCor("Preto");
		gol.setNumPortas(4);
		gol.setPlaca("OLE-1227");
		
		System.out.println("------------------------");
		System.out.println("Valores informados");
		System.out.println("Gol: ");
		System.out.println("Cor: " + gol.getCor());
		System.out.println("Tipo: " + gol.getTipo());
		System.out.println("Número de portas: " + gol.getNumPortas());
		System.out.println("Placa: " + gol.getPlaca());
		
		
	}

}
