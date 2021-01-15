package estudos.application;

import estudos.entities.Pensionato;

import java.util.Scanner;

public class ExercicioPensionato {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pensionato[] vect = new Pensionato[10];

        System.out.print("Quantos quartos vão ser alugados? ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            System.out.println();
            System.out.printf("Aluguel #%d: %n", i);
            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Quarto: ");
            int room = sc.nextInt();

            vect[room] = new Pensionato(name, email);
        }

        System.out.println();
        System.out.println("Quartos ocupados: ");
        for (int i=0; i < 10; i++){
            if (vect[i] != null){
                System.out.println(i + ": " + vect[i]);
            }
        }

        sc.close();
    }
}
