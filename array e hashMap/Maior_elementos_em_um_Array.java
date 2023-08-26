package Exercices_while;

import java.util.ArrayList;
import java.util.Scanner;

public class Maior_elementos_em_um_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> numeros = new ArrayList<>();

        System.out.println("Digite números (0 para parar): ");
        double num;

        while((num = scanner.nextDouble()) != 0) {
            numeros.add(num);
        }
        double maior = numeros.get(0);
        for(double n : numeros) {
            if(n>maior) {
                maior = n;
            }
        }

        System.out.println("O maior número é: " + maior);


    }
}
