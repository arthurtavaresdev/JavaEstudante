package Quest01;

public class Porta {

	boolean abertaFechado;
	String cor;
	float largura;
	float altura;
	
	
	public Porta(){
		
		this.abertaFechado = false;
		this.cor = "Branco";
		this.largura = 2;
		this.altura = 2;
		
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
		
		if(abertaFechado)
			System.out.println("A porta está ABERTA" );
		else
			System.out.println("A porta está FECHADA");
		
		System.out.println("Cor " + this.cor);
		System.out.println("Largura " + this.largura);
		System.out.println("Altura " + this.altura);
		
	}
	
	

}
