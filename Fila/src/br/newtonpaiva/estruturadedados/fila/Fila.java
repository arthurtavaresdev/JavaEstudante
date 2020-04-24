/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.newtonpaiva.estruturadedados.fila;

/**
 *
 * @author arthur
 */
public class Fila {

    // Tamanho da fila.
    static final int MAX_TAM = 10;

    // Fila de clientes
    Cliente[] fila = new Cliente[MAX_TAM];
    int fim = -1;
    int primeiro;

    public Fila() {
        this.fila = new Cliente[MAX_TAM];
        this.primeiro = 0;
    }

    public boolean vazia() {
        return fim == -1;
    }

    public int getTamaho() {
        return fim + 1;
    }
    
    public void insere(Cliente cliente){
        if(fim == MAX_TAM - 1){
            System.out.println("Não há espaço na fila!");
            return;
        }
        
        fila[++fim] = cliente;
    }
    
    public Cliente remover(){
        if(vazia()){
            System.out.println("Fila vazia");
            return null;
        }
        
        Cliente cliente = this.fila[this.primeiro];
        this.primeiro = (this.primeiro + 1) % this.fila.length;
        this.fim--;
        
        return cliente;
    }

}
