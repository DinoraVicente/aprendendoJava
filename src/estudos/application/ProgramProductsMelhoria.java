package estudos.application;

import estudos.entities.ProductMelhoria;

import java.util.Locale;
import java.util.Scanner;

public class ProgramProductsMelhoria {
    public static void main(String [] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        int quantity = sc.nextInt();

        ProductMelhoria product = new ProductMelhoria(name, price, quantity);

        System.out.println();
        System.out.printf("Product data: %s%n", product);

        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.printf("Updated data: %s%n", product);

        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.printf("Updated data: %s%n", product);

        sc.close();
    }
}
