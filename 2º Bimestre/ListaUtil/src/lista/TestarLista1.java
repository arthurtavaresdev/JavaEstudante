package lista;

import java.util.*;

public class TestarLista1 {

	public static void main(String[] args) {
		
		Pessoa ser = new Pessoa();
		ser.setCpf("031.412.314-23");
		ser.setNome("José");
		
		Pessoa humano = new Pessoa();
		humano.setCpf("231.231.313-25");
		humano.setNome("Douglas");
		
		List <Pessoa> listaPessoa = new ArrayList<>();
		
		listaPessoa.add(ser);
		listaPessoa.add(humano);
		
		Scanner input = new Scanner(System.in);
		System.out.print("Digite um nome: ");
		String terceiro = input.nextLine();
		
		boolean encontrado = false;
		
		for (Pessoa pessoa : listaPessoa) {
			System.out.println("CPF :" + pessoa.getCpf());
			System.out.println("NOME: " +pessoa.getNome());
			System.out.println("=-=--=-=-=-=-=-=-=-=");
			
			if(pessoa.getNome().equalsIgnoreCase(terceiro))
				encontrado = true;
		}
		
		if(encontrado){
			System.out.println(terceiro + " foi encotrado.");
		}else{
			System.out.println(terceiro + " não foi encotrado.");
		}
		



		
		
		
	}

}
