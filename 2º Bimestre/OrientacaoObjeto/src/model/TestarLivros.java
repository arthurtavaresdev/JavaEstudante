package model;

import java.util.Scanner;

public class TestarLivros {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Livro livroUtramig = new Livro();
		
		livroUtramig.nome = "Java 8";
		livroUtramig.descricao = "Programação";
		livroUtramig.valor = 100;
		livroUtramig.isbn = "132246858";
		
		/*System.out.println("Digite o desconto");
		double valor = leia.nextDouble();*/
		
		//livroUtramig.aplicarDesconto(valor);
		
		Livro livroEscola = new Livro();
		
		livroEscola.nome = "Matemática";
		livroEscola.descricao = "Lógica";
		livroEscola.valor = 50;
		livroEscola.isbn = "45648979";
		
		//livroEscola.aplicarDesconto(valor);
		
		
		
		Autor autor = new Autor();
		autor.nome = "Ederson";
		autor.cpf = "066";
		autor.email = "tes@tes.com";
		
		livroEscola.autor = autor;
		livroUtramig.autor = autor;
		
		boolean possuiAutor = livroUtramig.temAutor();
		boolean possuiAutorEscola = livroEscola.temAutor();
		
		
		if(possuiAutorEscola){
			System.out.println("Possui Autor");
		}
		else{
			System.out.println("Não possui");
		}
		
		
		if(possuiAutor){
			System.out.println("Possui Autor");
		}
		else{
			System.out.println("Não possui");
		}
		
		boolean testarNome = false;
		
		if(autor != null){
			testarNome = autor.verificarNomePreenchido(autor.nome);
		}
		
		
		if(testarNome){
			System.out.println("Existe nome");
		}
		else{
			System.out.println("Vazio");
		}
		
		
		livroUtramig.mostrarInformacoesLivro();
		livroEscola.mostrarInformacoesLivro();
		
		

	}

}
