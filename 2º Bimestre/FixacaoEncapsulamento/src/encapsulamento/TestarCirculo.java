package encapsulamento;

import java.util.Scanner;

public class TestarCirculo {

	public static void main(String[] args) {
		
		System.out.println("---- DADOS DO CIRCULO 1 ----");
		Circulo c1 = new Circulo();

		System.out.println("Raio: " + c1.getRaio());
		System.out.println("Área: " + c1.getArea());
		
		System.out.println("---- DADOS DO CIRCULO 2 ----");
		Circulo c2 = new Circulo(3);

		System.out.println("Raio: " + c2.getRaio());
		System.out.println("Área: " + c2.getArea());
		
		System.out.println("---- DADOS DO CIRCULO 3 ----");
		Circulo c3 = new Circulo();
		
		Scanner input = new Scanner(System.in);
		System.out.print("Digite um valor para o raio: ");
		c3.setRaio(input.nextDouble());
		

		System.out.println("Raio: " + c3.getRaio());
		System.out.println("Área: " + c3.getArea());
		System.out.println(c3.getAllValues());
	}

}
