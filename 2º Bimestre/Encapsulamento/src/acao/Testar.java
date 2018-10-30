package acao;

public class Testar {

	public static void main(String[] args) {
		
		Livro livro = new Livro();
		
		//livro.valor = 10;
		
		livro.setValor(10);
		
		livro.aplicarDesconto(0.2);
		
		//System.out.println(livro.valor);
		
		System.out.println(livro.getValor());
		
		Autor autor = new Autor();
		
		autor.setCpf("020.938.936-22");
		autor.setEmail("arthurabreu00@gmail.com");
		autor.setIdade(18);
		autor.setNome("Arthur");
		
		livro.setAutor(autor);
		
	}

}
