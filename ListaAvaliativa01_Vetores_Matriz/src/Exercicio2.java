import java.util.Arrays;

public class Exercicio2 {

	public static void main(String[] args) {
		/*
		 * 1) Criar dois vetores A e B
		 *  cada um com 10 elementos inteiros. Construir um vetor C, 
		 *  onde cada elemento de C é a soma dos respectivos elementos em A e B,
		 *   ou seja: C[i] = A[i] + B[i].
		 */
		
		int A[] = {2,44,61,86,15,59,49,21,20,68};
		int B[] = {86,2,71,73,13,12,54,61,3,17};
		int C[] = new int[10];
		
		for(int i=0; i < A.length; i++) {
			C[i] = A[i] + B[i];
		}
		
		System.out.println(Arrays.toString(C));
		
	}

}
