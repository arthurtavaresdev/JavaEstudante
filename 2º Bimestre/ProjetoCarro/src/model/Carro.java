package model;

public class Carro {
	private String cor;
	private String modelo;
	private int velocidadeAtual;
	private int velocidadeMaxima;
	private boolean ligaDesliga;
	private Fabricante fabricante;
	
	public Carro(){
		this.cor = "Preto";
		this.modelo = "Carro";
		this.velocidadeMaxima = 100;
	}
	
	public Carro(String cor,
	 String modelo,
	 int velocidadeAtual,
	 int velocidadeMaxima,
	 boolean ligaDesliga,
	 Fabricante fabricante){
		
		 this.modelo = modelo;
		 this.velocidadeAtual = velocidadeAtual;
		 this.velocidadeMaxima = velocidadeMaxima;
		 this.ligaDesliga = ligaDesliga;
		 this.fabricante = fabricante;
		
	}
	
	public String ligaDesligar(){
		if(this.ligaDesliga){
			this.ligaDesliga = false;
			return ("Carro ligado");
		}else{
			this.ligaDesliga = true;
			return("Carro Desligado");
		}
	}
	
	public void acelerarFreiarCarro(int carro){
		int soma = this.velocidadeAtual + carro;
		
		if(soma >= this.velocidadeMaxima){
			this.velocidadeAtual = this.velocidadeMaxima;
		}else if(soma <= 0){
			this.velocidadeAtual = 0;
		}else{
			this.velocidadeAtual = soma;
		}
	
	}
	
	public String verificarMarcha(int velocidadeAtual){
		if(velocidadeAtual >= 5 && velocidadeAtual < 25){
			return "Primeira";
		}else if(velocidadeAtual >= 25 && velocidadeAtual < 55){
			return "Primeira";
		}else if(velocidadeAtual >= 55 && velocidadeAtual < 85){
			return "Primeira";
		}else{
			return "Quarta";
		}
	}
	
	public boolean isLigaDesliga() {
		return ligaDesliga;
	}

	public void setLigaDesliga(boolean ligaDesliga) {
		this.ligaDesliga = ligaDesliga;
	}

	public void mostrarDetalhes(){
		System.out.println("Modelo: " + modelo);
		System.out.println("Velocidade Atual: " + this.velocidadeAtual );
		if(this.ligaDesliga){
			System.out.println("Carro está ligado");
		}else{
			System.out.println("Carro desligado");
		}
		System.out.println("Velocidade máxima: " + this.velocidadeMaxima);
		System.out.println("Nome do fabricante: " + fabricante.getNome());
		System.out.println("CNPJ do fabricante: " + fabricante.getCnpj());
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getVelocidadeAtual() {
		return velocidadeAtual;
	}

	public void setVelocidadeAtual(int velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}

	public int getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(int velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
	
}
