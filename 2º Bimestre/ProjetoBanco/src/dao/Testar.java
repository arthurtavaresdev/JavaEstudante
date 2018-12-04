package dao;

import java.sql.Connection;

public class Testar {

	public static void main(String[] args) {
		
		Connection con = Conexao.obterConexao();
		
		if(con != null){
			System.out.println(Conexao.status);
		}
		else{
			System.out.println("erro");
		}
		
		
		

	}

}
