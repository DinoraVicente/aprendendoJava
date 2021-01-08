import java.util.Scanner;

public class entradaDados {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        String x;
        x = sc.next();
        System.out.println("Nome: " + x);

        int y;
        y = sc.nextInt();
        System.out.println("Idade: " + y);

        double z;
        z = sc.nextDouble();
        System.out.printf("Altura: %.2f%n", z);

        char c;
        c = sc.next().charAt(0);
        System.out.println("Sexo: " + c);

        sc.close();
    }
}