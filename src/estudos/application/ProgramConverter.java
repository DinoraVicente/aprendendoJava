package estudos.application;

import estudos.util.CurrencyCoverter;

import java.util.Locale;
import java.util.Scanner;

public class ProgramConverter {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price?");
        double dollar = sc.nextDouble();

        System.out.print("How many dollars will be bought?");
        double quantity = sc.nextDouble();
        double result = CurrencyCoverter.coverterReais(dollar, quantity);

        System.out.printf("Amount to be paid in reais: %.2f", result);

        sc.close();
    }
}
