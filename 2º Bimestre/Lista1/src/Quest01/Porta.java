package Quest01;

public class Porta {

	private boolean abertaFechado;
	private String cor;
	private float largura;
	private float altura;
	
	public Porta(){
		this.abertaFechado = false;
		this.cor = "Branco";
		this.largura = 2;
		this.altura = 2;
	}
	
	public boolean isAbertaFechado() {
		return abertaFechado;
	}

	public void setAbertaFechado(boolean abertaFechado) {
		this.abertaFechado = abertaFechado;
	}

	public float getLargura() {
		return largura;
	}

	public void setLargura(float largura) {
		this.largura = largura;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void abre(){
		
		this.abertaFechado = true;
		
	}
	
	public void fecha(){
		
		this.abertaFechado = false;
		
	}
	
	public void pinta(String cor){
		
		this.cor = cor;
		
	}
	
	public boolean estaAberta(){
		if(this.abertaFechado)
			return true;
		return false;
	}
	
	public void alteraDimensao(float larg, float alt){
		
		this.altura = alt;
		this.largura = larg;
		
	}
	
	public void imprimir(){
		
		if(this.isAbertaFechado())
			System.out.println("A porta está ABERTA" );
		else
			System.out.println("A porta está FECHADA");
		
		System.out.println("Altura " + this.getAltura());
		System.out.println("Largura " + this.getLargura());
		System.out.println("Cor " + this.getCor());
	}


}
