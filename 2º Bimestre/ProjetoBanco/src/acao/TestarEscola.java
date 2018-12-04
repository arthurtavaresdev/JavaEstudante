package acao;

import java.sql.SQLException;
import java.util.Scanner;

import dao.EscolaDao;
import model.Escola;

public class TestarEscola {

	public static void main(String[] args)  {
		
		Escola escola = new Escola();
		EscolaDao dao = new EscolaDao();
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o nome da escola: ");
		escola.setNome(leia.nextLine());
		
		try {
			dao.cadastrar(escola);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
