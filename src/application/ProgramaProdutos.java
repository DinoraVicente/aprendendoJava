package application;

import entities.Produtos;

import java.util.Scanner;

public class ProgramaProdutos {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre os dados do produto: ");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Preço: ");
        double preco = sc.nextDouble();

        Produtos produto = new Produtos(nome, preco);

        System.out.println();
        System.out.printf("Dados do produto: %s%n", produto);

        System.out.println();
        System.out.print("Entre o número de produtos a serem adicionados no estoque: ");
        int quantidade = sc.nextInt();
        produto.addProdutos(quantidade);

        System.out.println();
        System.out.printf("Dados atualizados: %s%n", produto);

        System.out.println();
        System.out.print("Entre o número de produtos a serem removidos do estoque: ");
        quantidade = sc.nextInt();
        produto.removerProdutos(quantidade);

        System.out.println();
        System.out.printf("Dados atualizados: %s%n", produto);

        sc.close();
    }
}