package hash_map_dictionary;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Curso_de_java {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> dictionary = new HashMap<String, String>();
        dictionary.put("Brave", "ready to face and ensure danger or pain" );
        dictionary.put("Brilliant", "exceptionally clever");
        dictionary.put("Joy", "a feeling of great pleasure and happiness");

        for(Map.Entry<String, String> entry: dictionary.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
