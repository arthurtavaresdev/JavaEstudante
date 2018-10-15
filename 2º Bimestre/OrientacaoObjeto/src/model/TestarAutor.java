package model;

public class TestarAutor {

	public static void main(String[] args) {
		
		Autor autor = new Autor();
		autor.nome = "Rodrigo";
		autor.email = "rodrigo@tes.com";
		autor.cpf = "123.456";
		
		Autor autor1 = new Autor();
		autor1.nome = "Renato";
		autor1.email = "rodrigo@tes.com";
		autor1.cpf = "123.456";
		
		if(autor.nome.equals(autor1.nome)){
			System.out.println("Iguais");
		}
		else{
			System.out.println("Diferentes");
		}

	}

}
