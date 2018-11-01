package model;

public class Carro {
	private String tipo;
	private String cor;
	private String placa;
	private int numPortas;
	
	
	
	public Carro(){
		this.tipo = "Popular";
		this.cor = "Vermelho";
		this.placa = "UWE-2314";
		this.numPortas = 4;
	}

	//Um construtor que possui como parâmetros a placa e o número de portas; 
	 
	public Carro(String placa,int numPortas){
		this.placa = placa;
		this.numPortas = numPortas;
	}
	
	// Outro que possui como parâmetros tipo, cor, placa e número de portas. 
	
	public Carro(String cor, String tipo, String placa, int numPortas){
		this.tipo = tipo;
		this.cor = cor;
		this.placa = placa;
		this.numPortas = numPortas;
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getNumPortas() {
		return numPortas;
	}
	public void setNumPortas(int numPortas) {
		this.numPortas = numPortas;
	}
	
	
	
}
