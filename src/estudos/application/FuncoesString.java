package estudos.application;

import java.util.Locale;

public class FuncoesString {
    public static void main(String[] args) {
        /*
        Formatar: toLowerCase(), toUpperCase(),
        trim() - remove os espaços
         */

        String original = "abcde FGHIJ ABC abc DEFG";
        String mudanca = original.toLowerCase(Locale.ROOT);
        System.out.println(original);
        System.out.println(mudanca);

        String mudanca2 = original.toUpperCase(Locale.ROOT);
        System.out.println(original);
        System.out.println(mudanca);

        String original2 = "             abcde FGHIJ ABC abc DEFG";
        String mudanca3 = original.trim();
        System.out.println(original);
        System.out.println(mudanca);

        /*
        Recortar: substring(inicio), substring(inicio, fim)
         */
        String s01 = original.substring(2);
        String s02 = original.substring(2, 4);

        System.out.println(original);
        System.out.println(s01);
        System.out.println(s02);

        /*
        Substituir: Replace(char, char), Replace(string, string)
         */
        String s06 = original.replace('b', '2');
        String s07 = original.replace("abc", "2");

        System.out.println(original);
        System.out.println(s06);
        System.out.println(s07);

        /*
        Buscar: IndexOf, LastIndexOf
        */

        int i = original.indexOf("bc");
        int j = original.lastIndexOf("bc");

        System.out.println(i);
        System.out.println(j);

        /*
        str.Split(" ")
         */

        String text = "Amanhã vai chover!";

        String[] vect = text.split(" ");
        String word1 = vect[0];
        String word2 = vect[1];
        String word3 = vect[2];

        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);

    }
}
