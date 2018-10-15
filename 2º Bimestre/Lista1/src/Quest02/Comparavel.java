package Quest02;

public class Comparavel {

	/*
	 * 1. ESCREVA UMA CLASSE CHAMADA “COMPARAVEL” QUE TEM COMO ATRIBUTO UM VALOR
	 * INTEIRO, UM CONSTRUTOR PARA INICIALIZAR O ATRIBUTO E OS MÉTODOS
	 * EHMAIOROUIGUAL, EHMENOROUIGUAL E EHDIFERENTEDE QUE RECEBEM UM VALOR DO TIPO
	 * INT COMO PARÂMETRO E RETORNAM TRUE SE O VALOR ENCAPSULADO FOR,
	 * RESPECTIVAMENTE, MAIOR OU IGUAL, MENOR OU IGUAL OU DIFERENTE DO PASSADO COMO
	 * PARÂMETRO. FAÇA UMA CLASSE TESTACOMPARAVEL QUE VOCÊ POSSA DIGITAR UM NÚMERO E
	 * UTILIZAR OS MÉTODOS.
	 */

	int valor;

	public Comparavel(int x) {

		this.valor = x;

	}

	public boolean ehMaiorOuIgual(int x) {

		if (this.valor >= x) {
			System.out.println(x + " é maior ou igual a " + this.valor);
			return true;
		}
		return false;

	}

	boolean ehMenorOuIgual(int x) {

		if (this.valor <= x) {
			System.out.println(x + " é menor ou igual a " + this.valor);
			return true;
		}
		return false;

	}

	boolean ehDiferente(int x) {

		if (this.valor != x) {
			System.out.println(x + " é diferente a " + this.valor);
			return true;
		}
		return false;

	}

}
