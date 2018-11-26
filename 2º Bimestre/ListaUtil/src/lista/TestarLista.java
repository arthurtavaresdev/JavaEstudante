package lista;

import java.util.*;

public class TestarLista {

	public static void main(String[] args) {
					
		List lista = new ArrayList();
		

		lista.add("Arthur");
		lista.add(123);
		lista.add(-23.42);
		lista.add(lista.size(),"Jose");
		
	
		System.out.println("Posição " + lista.indexOf(123));
		lista.remove(1);
		lista.remove("Jose");
		
		System.out.println("Quantidade: " + lista.size());
		System.out.println(lista);
		
		System.out.println("- - - - - - FOR EACH - - - - - -");
		
		for (Object object : lista) {
			System.out.println(object);
		}
		
		
		System.out.println("- - - - - - FOR NORMAL - - - - - -");
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		boolean x = lista.contains("Ederson");
		
		if(x){
			System.out.println("Encotrado");
		}else{
			System.out.println("Não encotrado");
		}
		
	
		
		
	}

}
