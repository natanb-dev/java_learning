package Exercices_while;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculadora_que_soma_em_loop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList<>();

        System.out.println("Digite números inteiros (0 para parar):");
         int nume;
         while((nume = scanner.nextInt()) !=0) {
             num.add(nume);
         }
         int soma = 0;
         for(int n : num) {
             soma += n;
         }

        System.out.println(("A soma dos número é: " + soma));

    }
}


