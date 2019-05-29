
package dao;


import aluno.Alunos;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Aluno_dao {
    
    public void inserir(Alunos alunos)throws Exception {
        Conexao conn = new Conexao();
        String sql = "INSERT INTO aluno (matricula_aluno,nome_aluno,endereco_aluno,dt_nasc_aluno,"
                + "cpf_aluno,rg_aluno,nome_mae_aluno,telefone_aluno) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement ps = conn.getConexao().prepareStatement(sql);
        ps.setInt(1, alunos.getMatricula());
        ps.setString(2, alunos.getNomeAluno());
        ps.setString(3, alunos.getEnderecoAluno());
        ps.setString(4, alunos.getDataNascimento());
        ps.setString(5, alunos.getCpf());
        ps.setString(6, alunos.getRg());
        ps.setString(7, alunos.getNomeMae());
        ps.setString(8, alunos.getTelefone());
        
        ps.execute();
        conn.confirmar();
        
    }
    
    
    
     public int recuperarcodigo() throws Exception {
       Conexao conn = new Conexao();
        String sql = "SELECT max(matricula_aluno) as matricula FROM escola.aluno";
        PreparedStatement ps = conn.getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) { 
           return rs.getInt("matricula") + 1;
        }


        return 1;
    }
    
}
