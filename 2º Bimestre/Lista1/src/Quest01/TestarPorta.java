package Quest01;

public class TestarPorta {

	public static void main(String[] args) {

		/*
		 * CRIE UMA PORTA, ABRA E FECHE A MESMA, PINTE-A DE DIVERSAS CORES,
		 * ALTERE SUAS DIMENSÕES E USE O MÉTODO: ESTAABERTA PARA VERIFICAR SE
		 * ELA ESTÁ ABERTA OU NÃO.
		 */

		Porta porta = new Porta();

		porta.setCor("vermelho");
		porta.setAbertaFechado(true);
		porta.setAltura(3);
		porta.setLargura(2);
		
		/*
		 * System.out.println("Altura " + porta.getAltura());
		 * System.out.println("Cor " + porta.getCor()); System.out.println(
		 * "Largura " + porta.getLargura()); System.out.println("Aberta ? " +
		 * porta.isAbertaFechado());
		 */
		
		porta.imprimir();

		System.out.println("-----------------------");
		System.out.println("      ANTES/DEPOIS     ");
		System.out.println("-----------------------");

		porta.abre();
		porta.fecha();
		porta.alteraDimensao(4, 5);
		porta.estaAberta();

		porta.imprimir();

	}

}
