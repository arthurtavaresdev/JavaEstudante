create database escola;
use escola;
CREATE TABLE aluno (
  matricula_aluno INT NOT NULL AUTO_INCREMENT,
  nome_aluno VARCHAR(45) NOT NULL,
  endereco_aluno VARCHAR(45) NOT NULL,
  dt_nasc_aluno  VARCHAR (45),
  cpf_aluno  VARCHAR (15),
  rg_aluno  VARCHAR (15),
  nome_mae_aluno VARCHAR (45),
  telefone_aluno VARCHAR (12),
  PRIMARY KEY (matricula_aluno));
  
CREATE TABLE professor(
	cod_prof INT AUTO_INCREMENT PRIMARY KEY,
    nome_prof VARCHAR(45),
    materia_prof VARCHAR(45),
    end_prof VARCHAR(45),
    dt_nasc_prof VARCHAR(45),
    cpf_prof VARCHAR(15),
    rg_prof VARCHAR(50),
    email_prof VARCHAR(50),
    tel_prof VARCHAR(15)
);
