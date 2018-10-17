package televisao;

import java.util.Scanner;

public class TestarCanal {

	public static void main(String[] args) {
		Televisao tv = new Televisao();
		
		while(true){
			
			System.out.println("----- TELEVISÃO -------");
			System.out.println("[1] LIGAR");
			System.out.println("[2] DESLIGAR");
			System.out.println("[3] AUMENTAR VOLUME");
			System.out.println("[4] DIMINUIR VOLUNE");
			System.out.println("[5] AUMENTAR CANAL");
			System.out.println("[6] DIMINUIR CANAL");
			System.out.println("[7] ESCOLHER UM CANAL");
			System.out.println("[8] MOSTAR VOLUME ATUAL");
			System.out.println("[9] MOSTAR CANAL ATUAL");
			System.out.println("[0] SAIR.");
			
			Scanner input = new Scanner(System.in);
			System.out.print("Digite uma opção: ");
			byte op = input.nextByte();
			
			if(op == 0) break;
			
			if(!tv.ligar && op != 1){
				System.out.println("Sua TV está desligada");
			}else{
				
				switch (op) {
				case 1:
					tv.ligar();
					break;
					
				case 2:
					tv.desligar();
					break;
					
				case 3:
					tv.aumentarVolume();
					break;
					
				case 4:
					tv.diminuirVolume();
					break;
					
				case 5:
					tv.aumentarCanal();
					break;

				case 6:
					tv.diminuirCanal();
					break;
				
				case 7:
					System.out.print("Escolha um canal: ");
					int canal = input.nextInt();
					tv.trocarCanal(canal);
					break;
					
				case 8:
					tv.mostrarVolumeAtual();
					break;

				case 9:
					tv.mostrarCanalAtual();
					break;

				}
				
			}
					
			
		}
		
	}

}
