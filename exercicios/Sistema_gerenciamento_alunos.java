package Exercices_complexos;

import java.util.Scanner;

public class Sistema_gerenciamento_alunos {
    public static  void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos alunos deseja processar? ");
        int numAlunos = scanner.nextInt();

        String[] nomes = new String[numAlunos];
        double[] notas1 = new double[numAlunos];
        double[] notas2 = new double[numAlunos];

        for (int i = 0; i < numAlunos; i++) {
            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
            nomes[i] = scanner.next();

            System.out.print("Digite a primeira nota: ");
            notas1[i] = scanner.nextDouble();

            System.out.print("Digite a segunda nota: ");
            notas2[i] = scanner.nextDouble();
        }

        System.out.println("\nRelatório de Alunos:");
        System.out.println("Nome\tNota1\tNota2\tMédia");
        System.out.println("---------------------------------");
        for (int i = 0; i < numAlunos; i++) {
            double media = (notas1[i] + notas2[i]) / 2;
            System.out.printf("%s\t%.2f\t%.2f\t%.2f%n", nomes[i], notas1[i], notas2[i], media);
        }

        double mediaGeral = calcularMediaGeral(notas1, notas2);
        System.out.println("\nMédia Geral: " + mediaGeral);

        System.out.println("\nAlunos Acima da Média Geral:");
        for (int i = 0; i < numAlunos; i++) {
            double media = (notas1[i] + notas2[i]) / 2;
            if (media > mediaGeral) {
                System.out.println(nomes[i] + " (" + media + ")");
            }
        }
    }

    public static double calcularMediaGeral(double[] notas1, double[] notas2) {
        double soma = 0;
        for (int i = 0; i < notas1.length; i++) {
            soma += (notas1[i] + notas2[i]) / 2;
        }
        return soma / notas1.length;
    }
}
