package Learning;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class Learning_arrays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        list.add("Maria");
        list.add("Josefina");
        list.add("João");
        list.add("Jonias");

        System.out.println(list.size());

        System.out.println("\n===================\n");

        for(String x : list) {
            System.out.println(x);
        }
        System.out.println("\n===================\n");
        /*list.removeIf(x -> x.charAt(0) == 'J');
        for(String x : list) {
            System.out.println(x);
        }
        */

        System.out.println("\n===================\n");
        System.out.println("Index of Jonias: " + list.indexOf("JONIAS"));
        System.out.println("\n===================\n");

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'M').collect(Collectors.toList());
        for (String x : result) {
            System.out.println(x);

    }
        System.out.println("\n===================\n");
        String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(name);
    }


/* adaptar este código ao de cima

Scanner scanner = new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<>();

        System.out.print("Quantos nomes você deseja adicionar ao ArrayList? ");
        int numNames = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha pendente

        for (int i = 0; i < numNames; i++) {
            System.out.print("Digite o nome " + (i + 1) + ": ");
            String name = scanner.nextLine();
            arrayList.add(name);
        }

        System.out.println("Nomes inseridos no ArrayList:");
        for (String name : arrayList) {
            System.out.println(name);
        }

        // Não se esqueça de fechar o Scanner quando não for mais necessário.
        scanner.close();

    */

}
