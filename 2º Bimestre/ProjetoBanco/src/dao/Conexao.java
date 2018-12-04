package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
	public static String status = "";
	
	public static Connection obterConexao(){
		
		Connection con = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			
			String url = "jdbc:mysql://localhost/aulajava?user=root&password=";
			
			con = DriverManager.getConnection(url);
			
			status = "Conexão Aberta";
			
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	
}
