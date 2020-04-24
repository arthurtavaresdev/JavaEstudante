package br.newtonpaiva.estruturadedados.fila;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int option = 0;
        FilaBanco fila = new FilaBanco();

        Scanner input = new Scanner(System.in);
        while (true) {

            System.out.println("MENU DE OPÇÕES - Fila do Banco: \n"
                    + "1 - Adicionar cliente \n"
                    + "2 - Remover cliente \n"
                    + "3 - Exibir quantidade de pessoas na fila \n"
                    + "4 - Exibir o tempo de espera atual \n"
                    + "5 - Exibir o médio de espera de todo o dia \n"
                    + "0 - SAIR \n"
                    + "Opção: "
            );

            option = input.nextInt();
            input = new Scanner(System.in);
            if (option == 0) {
                break;
            }

            switch (option) {
                // Inserir uma pessoa na fila
                case 1:
                    System.out.println("Adicionar cliente");
                    System.out.println("Digite o nome do cliente: ");
                    Cliente cliente = new Cliente();
                    cliente.nome = input.nextLine();
                    fila.insere(cliente);
                    break;

                // Remover uma pessoa da fila
                case 2:
                    System.out.println("Remover cliente");
                    fila.remover();
                    break;

                // Exibir a quantidade de pessoas na fila
                case 3:
                    System.out.println("Há " + fila.getTamaho() + " Pessoas na fila.");
                    break;
                // Exibir o tempo de espera atual
                case 4:
                    int tempoEspera = fila.getTempoEspera();
                    System.out.println("Atualmente estamos com " + tempoEspera + " minutos de espera");
                    break;
                
                // Exibir a média de espera de todo o dia
                case 5:
                    System.out.println("Tempo médio de espera de todo o dia " + fila.getMediaTempoDia() + " minutos de espera.");
                    break;

                default:
                    System.out.println("Digite uma opção válida.");
                    break;
            }

            System.out.println("-------------------------------------");

        }

    }

}
