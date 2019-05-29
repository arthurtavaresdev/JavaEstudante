/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import professor.Professores;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author 277093
 */
public class Professor_dao {
    private Conexao conn;
    
    public Professor_dao() throws Exception{
        this.conn = new Conexao();
    }
    
    public void inserir(Professores professor) throws Exception {
  
        String sql = "INSERT INTO professor (nome_prof,materia_prof,end_prof,dt_nasc_prof,"
                + "cpf_prof,rg_prof,email_prof,tel_prof) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement ps = this.conn.getConexao().prepareStatement(sql);
        ps.setString(1, professor.getNome());
        ps.setString(2, professor.getMateria());
        ps.setString(3, professor.getEndereco());
        ps.setString(4, professor.getDataNascimento());
        ps.setString(5, professor.getCpf());
        ps.setString(6, professor.getRg());
        ps.setString(7, professor.getEmail());
        ps.setString(8, professor.getTelefone());
        
        ps.execute();
        
       
           this.conn.confirmar();
        
    }
    
     public int recuperarCodigo() throws Exception {
       
        String sql = "SELECT cod_prof as 'codigo' from professor  order by 'codigo' desc limit 1;";
        PreparedStatement ps = this.conn.getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) { 
           return rs.getInt("codigo")+1;
        }
        
        return 1;
        
        
     }
    
    
}
