package encapsulamento;

public class Circulo {
	
	private double raio;
	String cor;
	
	
	public Circulo(){
		this.raio = 1.0;
		this.cor = "Vermelho";
	}
	
	public Circulo(double raio){
		this.raio = raio;
		this.cor = "Vermelho";
	}
	
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getArea(){
		return (this.raio*this.raio) * 3.14;
	}
	
	public String getAllValues(){
		return "Raio: " + this.raio + ", Área: " + this.getArea() + ", Cor: " + this.cor;
		 
	}
	
}
