package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Escola;

public class EscolaDao {
	
	private String insert = "INSERT INTO escola (nome) VALUES (?);";
	
	public void cadastrar(Escola escola) throws SQLException{
		Connection con = Conexao.obterConexao();
		PreparedStatement psmt = con.prepareStatement(insert);
		psmt.setString(1, escola.getNome());
		psmt.execute();
	}
	
}
