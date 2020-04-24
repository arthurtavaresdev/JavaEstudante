/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.newtonpaiva.estruturadedados.fila;

import br.newtonpaiva.estruturadedados.fila.Cliente;

/**
 *
 * @author arthur
 */
public class FilaBanco {

    // Tamanho da fila do banco.
    static final int MAX_TAM = 10;
    
    // Tempo de espera na fila para cada cliente.
    static final int TEMPO = 15;
    
    // 1440 = Número de minutos em um dia.
    // Define quanto tempo é o maximo disponivel para a fila.
    static final int MAX_TEMPO = 1440 / TEMPO; 
            
    
    int filaTotal = 0;
    
    // Fila de clientes
    Cliente[] filaBanco = new Cliente[MAX_TAM];
    int fim = -1;
    int primeiro;

    public FilaBanco() {
        this.filaBanco = new Cliente[MAX_TAM];
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
            System.out.println("Não há espaço na filaBanco!");
            return;
        }
        
        filaTotal++;
        filaBanco[++fim] = cliente;
    }
    
    public int getTempoEspera(){
        return this.getTamaho() * TEMPO;
    }
    
    public int getMediaTempoDia(){
        int tempoEsperaTotal = this.filaTotal * 15;
        if(tempoEsperaTotal >= MAX_TEMPO){
            tempoEsperaTotal = 1440;
        }
        
        return tempoEsperaTotal/this.filaTotal;
    }
    
    public Cliente remover(){
        if(vazia()){
            System.out.println("Fila vazia");
            return null;
        }
        
        Cliente cliente = this.filaBanco[this.primeiro];
        this.primeiro = (this.primeiro + 1) % this.filaBanco.length;
        this.fim--;
        
        return cliente;
    }

}
