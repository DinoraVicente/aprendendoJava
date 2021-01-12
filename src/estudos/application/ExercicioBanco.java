package estudos.application;

import estudos.entities.Banco;

import java.util.Scanner;

public class ExercicioBanco {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        Banco banco;

        System.out.print("Número da conta: ");
        int numeroConta = sc.nextInt();
        System.out.print("Titular da conta: ");
        sc.nextLine();
        String nome = sc.nextLine();

        System.out.print("Há algum depósito inicial? (s/n)");
        char resposta = sc.nextLine().charAt(0);


        if(resposta == 's'){
            System.out.print("Valor do depósito inicial: ");
            double depositoInicial = sc.nextDouble();
            banco = new Banco(numeroConta, nome, depositoInicial);
        } else {
            banco = new Banco(numeroConta, nome);
        }

        System.out.println();
        System.out.println("Dados da conta: ");
        System.out.println(banco);

        System.out.println();
        System.out.print("Valor de deposito: ");
        double valorDeposito = sc.nextDouble();
        banco.deposito(valorDeposito);
        System.out.println("Dados da conta atualizados: ");
        System.out.println(banco);

        System.out.println();
        System.out.println("Valor do saque: ");
        double valorSaque = sc.nextDouble();
        banco.saque(valorSaque);
        System.out.println("Dados da conta atualizados: ");
        System.out.println(banco);

        sc.close();
    }
}
