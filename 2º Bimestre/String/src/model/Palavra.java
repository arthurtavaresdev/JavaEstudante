package model;

import java.util.Scanner;

public class Palavra {
	
	private String palavra;
	Scanner input = new Scanner(System.in);
	
	
	public Palavra(){
		System.out.print("Digite uma palavra: ");
		this.palavra = input.nextLine();
	}
	
	public String getPalavra() {
		return palavra;
	}
	
	public void setPalavra(String palavra) {
		this.palavra = palavra;
	}
	
	public String tudoMinusculo(String algo){
		return algo.toLowerCase();
	}
	
	public String tudoMaisculo(String algo){
		return algo.toUpperCase();
	}
	
	public int quantidadeCaracter(String algo){
		return algo.length();
	}
	
	public int apareceuQuantasVezes(String frase, char letra){
		int cont = 0;
		
		for(int i = 0;i < frase.length();i++ ){
			if(frase.charAt(i) == letra)
				cont++;
		}
		
		return cont;
	}
	
	
	public String colocarHifen1(String algo){
		
		if(algo.length() <= 1){
			System.out.println("Palavra deve possuir mais de um carácter");
		}
		String pt1 = algo.substring(0, algo.length()-1);
		String pt2 = algo.substring(algo.length()-1);
		
		return pt1.concat("-").concat(pt2);
		
	} 
	
	
	public String colocarHifen2(String algo){
		
		if(algo.length() <= 1){
			System.out.println("Palavra deve possuir mais de um carácter");
		}
		
		char nova[] = new char[algo.length() + 1];
		int j = 0;
		
		for (int i = 0; i < nova.length; i++) {
			if(i == algo.length()-1){
				nova[i] = '-';
			}else{
				nova[i] = algo.charAt(j);
				j++;
			}
		}
		
		return String.copyValueOf(nova);
		
	} 
	
}
