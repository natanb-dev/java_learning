package Exercices_complexos;

import java.util.ArrayList;
import java.util.Scanner;

public class Agenda_contatos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<String> numeros = new ArrayList<>();

        System.out.println("Bem vindo á agenda de contatos");
        char opcao;

        do {
            System.out.println("\n=================\n");
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Adicionar contato");
            System.out.println("2. Listar contatos");
            System.out.println("3. Sair");
            System.out.println("\nDigite: ");
            opcao = scanner.next().charAt(0);

            switch (opcao) {
                case '1':
                    System.out.print("Digite o nome: ");
                    scanner.nextLine();  // Limpar o buffer
                    String nome = scanner.nextLine();
                    System.out.print("Digite o número de telefone: ");
                    String numero = scanner.nextLine();
                    nomes.add(nome);
                    numeros.add(numero);
                    System.out.println("Contato adicionado!");
                    break;
                case '2':
                    System.out.println("Lista de Contatos:");
                    for (int i = 0; i < nomes.size(); i++) {
                        System.out.println(nomes.get(i) + ": " + numeros.get(i));
                    }
                    break;
                case '3':
                    System.out.println("Saindo da Agenda de Contatos.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != '3');
    }
}