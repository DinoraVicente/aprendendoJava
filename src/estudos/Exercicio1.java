package estudos;

import java.util.Locale;

public class Exercicio1 {
    public static void main(String[] args) {
        String produto1 = "Computador";
        String produto2 = "Mesa de escritório";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double preco1 = 2100.0;
        double preco2 = 650.50;
        double medida = 53.234567;

        System.out.println("Produtos:");
        System.out.printf("%s, o qual o preço é R$%.2f%n", produto1, preco1);
        System.out.printf("%s, o qual o preço é R$%.2f%n", produto2, preco2);
        System.out.println();
        System.out.printf("Registro: %d anos de idade, código: %d, gênero: %c%n", age, code, gender);
        System.out.println();
        System.out.printf("Medidas com 8 casas decimais: %.8f%n", medida);
        System.out.printf("Aredondado (3 casas decimais): %.3f%n", medida);
        Locale.setDefault(Locale.US);
        System.out.printf("Ponto decimal US: %.3f%n", medida);
    }
}
