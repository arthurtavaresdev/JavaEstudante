package Quest04;

import Quest03.Data;

public class EntradaDeCinema {


	
	String dataDofilme;
	int sala;
	int idadeCli;
	float valor;  
	Data data = new Data();
	
	public EntradaDeCinema(String date, String horario, int sala, float valor) {
		
		this.dataDofilme = date;
		this.sala = sala;
		this.valor = valor;
		data.getDadosSistema(date, horario);
		
	}



	float calculaDesconto(String nasc) {

		if (data.idade(nasc,this.dataDofilme) <= 12) {
			System.out.println("Aplicado desconto de 50%");
			System.out.println("Motivo: Menor ou igual a 12 anos");
			this.valor *= 0.5;
		}

		return this.valor;

	}



	float calculaDescontoEstudante(String nasc, int cart) {
		if (cart != 0) {
			
			System.out.println("Estudante");
			
			int idade = data.idade(nasc,this.dataDofilme);
			
			if (idade > 12 && idade <= 15) {
				System.out.println("Aplicado desconto de 40%");
				System.out.println("Motivo: Entre 12 e 15 anos");
				this.valor *= 0.4;

			}

			else if (idade >= 16 && idade <= 20) {
				System.out.println("Aplicado desconto de 30%");
				System.out.println("Motivo: Entre 16 e 20 anos");
				this.valor *= 0.3;

			}

			else if (idade > 20) {
				System.out.println("Aplicado desconto de 20%");
				System.out.println("Motivo: Maior que 20 anos");
				this.valor *= 0.2;

			}
			
			System.out.println("-------------------------");
			
		}
		
		return this.valor;
	}
	


	float calculaDescontoHorario(String nasc, int cart) {

		this.calculaDesconto(nasc);
		this.calculaDescontoEstudante(nasc, cart);
		
		// ACIMA GARANTO QUE O METODO calculaDescontoHorario() SERA O ULTIMO A
		// SER EXECUTADO.

		if (data.getHora() < 16)
		
			System.out.println("Aplicado desconto de 10%");
			System.out.println("Motivo: Filme antes das 16 horas");
			System.out.println("-------------------------");
			this.valor *= 0.1;

		return this.valor;
	}

	void imprimaString(String nasc){

		System.out.println("Data do Filme: " + this.dataDofilme);
		System.out.println("Horario: " + data.horario);
		System.out.println("Idade do cliente: " + data.idade(nasc,this.dataDofilme));
		System.out.println("Sala: " + this.sala);
		System.out.println("Valor: R$" + this.valor);

	}

}
