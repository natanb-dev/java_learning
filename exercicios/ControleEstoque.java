package Exercices_complexos;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ControleEstoque {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> estoque = new HashMap<>();

        System.out.println("Bem-vindo ao controle de estoque");
        char opcao;
        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Adicionar produto");
            System.out.println("2. Atualizar quantidade");
            System.out.println("3. Consultar estoque");
            System.out.println("4. Sair");
            opcao = scanner.next().charAt(0);

            switch (opcao) {
                case '1':
                    System.out.print("Digite o nome do produto: ");
                    scanner.nextLine();  // Limpar o buffer
                    String produto = scanner.nextLine();
                    System.out.print("Digite o número de pacotes: ");
                    int quantidade = scanner.nextInt();
                    estoque.put(produto, quantidade);
                    System.out.println("Produto adicionado ao estoque!");
                    break;
                case '2':
                    System.out.print("Digite o nome do produto: ");
                    scanner.nextLine();  // Limpar o buffer
                    produto = scanner.nextLine();
                    if (estoque.containsKey(produto)) {
                        System.out.print("Atualize o número de pacotes: ");
                        quantidade = scanner.nextInt();
                        estoque.put(produto, quantidade);
                        System.out.println("Quantidade atualizada!");
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;
                case '3':
                    System.out.println("Estoque:");
                    for (Map.Entry<String, Integer> entry : estoque.entrySet()) {
                        System.out.println(entry.getKey() + ": " + entry.getValue());
                    }
                    break;
                case '4':
                    System.out.println("Saindo do Controle de Estoque.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != '4');
    }
}
