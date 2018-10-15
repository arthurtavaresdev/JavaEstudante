package ExFuncao;

public class ExFuncao {

	void ex1(int n) {
		int cont = 0;
		while (cont < n) {
			cont++;
			for (int i = 1; i <= cont; i++) {
				System.out.print(cont + " ");
			}
			System.out.println();
		}
	}

	void ex2(int n) {
		int cont = 0;
		while (cont < n) {
			cont++;
			for (int i = 1; i <= cont; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

	int ex3(int x, int y, int z) {

		int soma = x + y + z;

		return soma;

	}

	char ex4(int num) {
		if (num > 0)
			return 'P';
		return 'N';
	}

	float ex5(float custo, float taxaImposto) {

		float imposto = custo * (taxaImposto / 100);
		float somaImposto = custo + imposto;

		return somaImposto;
	}

	String ex6(int hora, int minutos) {

		String f = "";

		if (hora > 24 || minutos > 59)
			return "Invalido";

		if (hora >= 12) {
			hora -= 12;
			f = " P.M";
		} else {
			if (hora == 0) {
				hora += 12;
			}

			f = " A.M";
		}
		String formt = hora + ":" + minutos + f;

		return formt;

	}

	
	float ex7(float valor, float dias){
		
		return valor;
	}
	
	int ex8(int num){
		
		String dig = Integer.toString(num);
		int nDig = dig.length();
				
		return nDig;
	}
	
	
	

}
