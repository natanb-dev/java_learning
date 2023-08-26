package Exercices_while;

import java.util.ArrayList;
import java.util.Scanner;

public class Remover_elementos_do_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();

        System.out.println("Digite nomes (ou 'parar' para sair):");
        String nome;
        while (!(nome = scanner.nextLine()).equalsIgnoreCase("parar")) {
            nomes.add(nome);
        }

        System.out.println("Digite o nome a ser removido:");
        String nomeRemover = scanner.nextLine();
        nomes.remove(nomeRemover);

        System.out.println("Nomes restantes na lista:");
        for (String n : nomes) {
            System.out.println(n);
        }
    }
}
