package televisao;

public class Televisao {
	
	boolean ligar;
	int volume;
	int canal;
	
	public Televisao(){
		this.ligar = false;
		this.volume = 20;
		this.canal = 12;
	}
	
	void ligar(){
		
		this.ligar = true;
		System.out.println("A TV está ligada");
	}
	
	void desligar(){
		
		this.ligar = false;
		System.out.println("A TV está Desligada");
		
	}
	
	void aumentarVolume(){
		
		this.volume++;
		
	}
	
	void diminuirVolume(){
		this.volume--;
	}
	
	void aumentarCanal(){
		
		this.canal++;
		
	}
	
	void diminuirCanal(){
		this.canal--;
	}
	
	void trocarCanal(int canal){
		
		this.canal = canal;
		
	}
	
	void mostrarVolumeAtual(){
		
		System.out.println("O volume atual da TV é :" + this.volume);
		
	}
	
	void mostrarCanalAtual(){
		
		System.out.println("O Canal atual da TV é :" + this.canal);
		
	}
	
	
}
