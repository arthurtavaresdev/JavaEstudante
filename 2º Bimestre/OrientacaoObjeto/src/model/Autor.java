package model;

public class Autor {
	String nome;
	String cpf;
	String email;
	
	void mostrarInfAutor(){
		System.out.println(this.nome);
		System.out.println(this.cpf);
		System.out.println(this.email);
		System.out.println("***********");
	}

	public boolean verificarNomePreenchido(String nome) {
		
		if(nome.equals(" ")){
			return false;
		}
		
		return true;
		
	}
	
	
	
}
