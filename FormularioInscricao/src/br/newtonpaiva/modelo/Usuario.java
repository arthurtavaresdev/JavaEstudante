/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.newtonpaiva.modelo;

import java.util.Objects;

/**
 *
 * @author arthur
 */
public class Usuario {

    private Integer id;
    private String nome;
    private String email;
    private char[] senha;
    private String biografia;

    public Usuario(String email, char[] senha) {
        this.email = email;
        this.senha = senha;
    }

    public Usuario(String nome, String email, char[] senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public Usuario(String nome, String email, char[] senha, String biografia) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.biografia = biografia;
    }

    public Usuario(Integer id, String nome, String email, char[] senha, String biografia) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.biografia = biografia;
    }
    
    
    public void salvar(){
        System.out.println("Executou o salvar()");
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.nome);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nome=" + nome + ", email=" + email + ", senha=" + senha + ", biografia=" + biografia + '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char[] getSenha() {
        return senha;
    }

    public void setSenha(char[] senha) {
        this.senha = senha;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }
    
}
