package estudos.application;

import estudos.entities.Vetor2;

import java.util.Locale;
import java.util.Scanner;

public class ProgramaVetor2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho da lista: ");
        int n = sc.nextInt();
        Vetor2[] vect = new Vetor2[n];

        for (int i = 0; i < vect.length; i++){
            System.out.print("Nome do produto: ");
            sc.nextLine();
            String nome = sc.nextLine();

            System.out.print("Preço: ");
            double price = sc.nextDouble();

            vect[i] = new Vetor2(nome, price);
        }

        double sum = 0.0;
        for(int i = 0; i < vect.length; i++){
            sum += vect[i].getPrice();
        }
        double avg = sum / vect.length;
        System.out.printf("Preço médio: %.2f%n", avg);

        sc.close();
    }
}
