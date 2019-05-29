
package aluno;

public class Alunos {
    
    
        
    private int matricula;
    private String nomeAluno;
    private String enderecoAluno;
    private String dataNascimento;
    private String cpf;
    private String rg;
    private String nomeMae;
    private String telefone;

    
    public Alunos(){
    this.matricula = 0;
    this.nomeAluno = "";
    this.enderecoAluno = "";
    this.dataNascimento = "";
    this.cpf = "";
    this.rg = "";
    this.nomeMae = "Maria";
    this.telefone = "";
    }
   
    public int getMatricula() {
        return matricula;
    }


   
    public String getNomeAluno() {
        return nomeAluno;
    }

   
    
    public String getEnderecoAluno() {
        return enderecoAluno;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

   
    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }


    public String getNomeMae() {
        return nomeMae;
    }


    public String getTelefone() {
        return telefone;
    }

 
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }


    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }


    public void setEnderecoAluno(String enderecoAluno) {
        this.enderecoAluno = enderecoAluno;
    }


    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

  
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public void setRg(String rg) {
        this.rg = rg;
    }

  
    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

  
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    
    
    
}
