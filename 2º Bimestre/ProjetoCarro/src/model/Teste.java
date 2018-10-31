package model;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {

		Fabricante fab = new Fabricante();
		Carro car = new Carro();

		System.out.println("--- DIGITAR AS INFORMAÇÕES SOBRE O CARRO ---");
		System.out.println("           Dados do fabricante:             ");

		System.out.print("Nome do fabricante: ");
		Scanner input = new Scanner(System.in);
		fab.setNome(input.nextLine());

		System.out.print("CNPJ do fabricante: ");
		input = new Scanner(System.in);
		fab.setCnpj(input.nextLine());

		car.setFabricante(fab);

		System.out.println("              Dados do Carro:              ");

		System.out.print("Cor do carro: ");
		input = new Scanner(System.in);
		car.setCor(input.nextLine());

		System.out.print("Modelo do carro: ");
		input = new Scanner(System.in);
		car.setModelo(input.nextLine());

		System.out.print("Velocidade atual do carro: ");
		input = new Scanner(System.in);
		car.setVelocidadeAtual(input.nextInt());
 
		while (true) {

			System.out.print("Velocidade máxima do carro: ");
			input = new Scanner(System.in);
			car.setVelocidadeMaxima(input.nextInt());

			if (car.getVelocidadeAtual() > car.getVelocidadeMaxima())
				System.out.println("Erro");
			else
				break;
		}

		System.out.print("Carro está ligado ? (true/false) ");
		input = new Scanner(System.in);
		car.setLigaDesliga(input.nextBoolean());

		while (true) {
			System.out.println("-=-=--=-=-=--=-=- MENU -=-=--=-=-=--=-=-");
			System.out.println("[1] Ligar/Desligar Carro");
			System.out.println("[2] Acelerar/Freiar Carro");
			System.out.println("[3] Verificar Marcha");
			System.out.println("[4] Mostrar todos os detalhes");
			System.out.println("[0] Sair");
			System.out.print("Digite uma opção: ");

			input = new Scanner(System.in);

			byte opcao = input.nextByte();

			if (opcao == 0) {
				break;

			}else if (!car.isLigaDesliga() && opcao != 1) {
				System.out.println("O carro está desligado");
				System.out.println("Não é possivel fazer as proximas ações");
			}else {
				switch (opcao) {
				case 1:
					System.out.println(car.ligaDesligar());
					break;
				case 2:
					System.out.print("Digite um valor positivo para acelerar ou negativo para freiar: ");
					input = new Scanner(System.in);
					car.acelerarFreiarCarro(input.nextInt());
					
					break;
				case 3:
					System.out.println(car.verificarMarcha(car.getVelocidadeAtual()));
					break;
				case 4:
					System.out.println("------------=-----------");
					car.mostrarDetalhes();
					break;

				default:
					System.out.println("Escolha uma opção valida");
					break;
				}
			}

		}
		
		Carro car1 = new Carro("vermelho","GOL",40,120,true,fab);
		Fabricante fab2 = new Fabricante();
		
		System.out.println("Dados do 2º Carro");
		
		fab2.setNome("Fiat");
		fab2.setCnpj("020.938.936-22");
		car1.setFabricante(fab2);
		
		car1.setCor("Prata");
		car1.setVelocidadeAtual(80);
		car1.setVelocidadeMaxima(100);
		car1.setLigaDesliga(false);
		car1.ligaDesligar();
		car1.acelerarFreiarCarro(20);
		car1.mostrarDetalhes();
	}
	
}
