CREATE DATABASE aulajava;
USE aulajava;

CREATE TABLE escola(
	idEscola INT(11) NOT NULL AUTO_INCREMENT, 
    nome VARCHAR(255) NOT NULL,
    PRIMARY KEY(idEscola)
);

DESC ESCOLA;

INSERT INTO escola (nome) VALUES ('Utramig');
SELECT * FROM escola;