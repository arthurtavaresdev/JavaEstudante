
import java.util.Scanner;

public class Atividade9 {

	public static void main(String[] args) {

		/**
		 *  Ler  as  duas  notas  bimestrais  para  um  conjunto  de  10  alunos. 
		 *   Armazenar  as  notas informadas em dois vetores “Nota1” e “Nota2” do tipo real. 
		 *   Escreva um programa que calcule a média aritmética simples das notas informadas armazenando o resultado em um  vetor  “Result”  de  mesmo  tipo  e  tamanho. 
		 *    Ao  mostrar  os  resultados  exibir  a situação de cada aluno. Se a média calculada for superior ou igual a 7 o aluno estará “aprovado”,
		 *     caso contrário, a situação do aluno será “reprovado”. 
		 */
		
		float Nota1[] = new float[10];
		float Nota2[] = new float[10];
		float Result[] = new float[10];
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		for(int i = 0; i< 10;i++) {
			System.out.println("Digite as notas do " + (i+1) + "º Aluno: ");
			System.out.print("\n Digite a 1º nota :");
			Nota1[i] = input.nextFloat();
			
			System.out.print("\n Digite a 2º nota :");
			Nota2[i] = input.nextFloat();
			
			Result[i] = (Nota1[i] + Nota2[i])/2;
			
		}
		
		for(int i = 0; i< 10;i++) {
		System.out.println("Situação do " + (i+1) + "º Aluno: " + (Result[i] >= 7 ? 	"Aprovado" : "Reprovado"));
		}


	}

}
