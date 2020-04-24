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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente c1 = new Cliente();
        c1.nome = "Ana";

        Cliente c2 = new Cliente();
        c2.nome = "Maria";

        Cliente c3 = new Cliente();
        c3.nome = "Mateus";

        Fila fila = new Fila();
        fila.insere(c1);
        fila.insere(c2);
        fila.insere(c3);

        while (!fila.vazia()) {
            Cliente clienteRemovido = fila.remover();
            System.out.println("Cliente Removido: " + clienteRemovido.nome);
        }
    }

}
