package Exercices_complexos;

import java.util.Scanner;

public class Simulador_conta_bancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = 1000.0;

        while (true) {
            System.out.println("Seu saldo atual é: " + saldo);
            System.out.print("Digite o valor a ser depositado/retirado (0 para sair): ");
            double valor = scanner.nextDouble();

            if (valor == 0) {
                break;
            }

            System.out.print("Digite 'D' para depositar ou 'R' para retirar: ");
            char operacao = scanner.next().charAt(0);

            if (operacao == 'D' || operacao == 'd') {
                saldo += valor;
            } else if (operacao == 'R' || operacao == 'r') {
                if (valor <= saldo) {
                    saldo -= valor;
                } else {
                    System.out.println("Saldo insuficiente.");
                }
            } else {
                System.out.println("Operação inválida.");
            }
        }

        System.out.println("Saldo final: " + saldo);
    }
}
