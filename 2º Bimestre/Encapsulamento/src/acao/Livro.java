package acao;

public class Livro {

	private double valor;
	Autor autor;
	
	public void setAutor(Autor autor){
		this.autor = autor;
	}
	
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	void aplicarDesconto(double porcentagem){
		
		if(porcentagem < 0.3){
			this.valor = this.valor - (this.valor * porcentagem);
		}
		else{
			System.out.println("Desconto não pode ser maior que 30%");
		}
		
	}
	
}
