/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.newtonpaiva.estruturadedados.pilha;

/**
 *
 * @author arthur
 */
public class Pilha {

    // Tamanho da pilha.
    static final int MAX_TAM = 10;

    // Fila de clientes
    Character[] pilha = new Character[MAX_TAM];
    int topo = -1;

    public boolean vazia() {
        return topo == -1;
    }

    public int getTamaho() {
        return topo + 1;
    }
    
    public void insere(Character caracter){
        if(topo == MAX_TAM - 1){
            System.out.println("Não há espaço na pilha!");
            return;
        }
        
        this.pilha[++topo] = caracter;
    }
    
    public Character remover(){
        if(vazia()){
            System.out.println("Pilha vazia");
            return null;
        }
        
        return this.pilha[topo--];
    }

}
