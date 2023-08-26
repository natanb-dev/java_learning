package Learning_map;


import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/*
"Dado um texto, conte quantas vezes cada letra aparece nesse texto,
depois imprima cada letra que aparece no texto (alfabeticamente) ao lado
da quantidade de vezes em que apareceu!"
 */
public class exercicio_Teams {
    public static void main(String[] args) {
        String texto = "Como é bom torcer para o Sao Paulo";
        count_carac(texto);
    }

    public static void count_carac(String texto) {
        Map<Character, Integer> charcount = new HashMap<>();

        String lowercase = texto.toLowerCase();

        for(int i=0; i< lowercase.length(); i++) {
            char c = lowercase.charAt(i);

            if (Character.isLetter(c)) {
                charcount.put(c, charcount.getOrDefault(c, 0) +1);
            }
        }
        for(char c = 'a'; c <= 'z'; c++) {
            if(charcount.containsKey(c)) {
                System.out.println(c + ": " + charcount.get(c));
            }
        }
    }
}
