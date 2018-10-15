package model;

public class Livro {
	
	String nome;
	String descricao;
	double valor;
	String isbn;
	Autor autor;
	
	void mostrarInformacoesLivro(){
		System.out.println(this.nome);
		System.out.println(this.descricao);
		System.out.println(this.valor);
		System.out.println(this.isbn);
		System.out.println(this.autor.nome);
		System.out.println("************");
	}
	
	void aplicarDesconto(double porcentagem){
		this.valor -= valor * porcentagem;
	}
	
	boolean temAutor(){
		if(this.autor != null){
			return true;
		}
		return false;
		
	}

}
