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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        imprimeResultado("ala");
        imprimeResultado("ana");
        imprimeResultado("top");
    }
    
    public static void imprimeResultado(String palavra){
        if (verificaPalindromo(palavra)) {
            System.out.println("É um palindromo!");
        } else {
            System.out.println("Não é um palindromo!");
        }
    }

    public static boolean verificaPalindromo(String palavra) {
        Pilha pilha = new Pilha();
        for (int i = 0; i < palavra.length(); i++) {
            pilha.insere(palavra.charAt(i));
        }

        String palavraInvertida = "";
        while (!pilha.vazia()) {
            palavraInvertida += pilha.remover();
        }

        return palavraInvertida.equalsIgnoreCase(palavra);
    }

}
