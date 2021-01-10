package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class ProgramStudent {
    public static void main(String [] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        System.out.println("Name: ");
        student.name = sc.nextLine();
        System.out.println("First grade: ");
        student.nota1 = sc.nextDouble();
        System.out.println("Second grade: ");
        student.nota2 = sc.nextDouble();
        System.out.println("Third grade: ");
        student.nota3 = sc.nextDouble();

        System.out.printf("Final Grade: %.2f%n", student.calculoNotas());

        if(student.calculoNotas() < 60.0){
            System.out.println("You failed...");
            System.out.printf("Missing %.2f points%n", student.missingPoints());
        }else{
            System.out.println("You pass!!");
        }

        sc.close();
    }
}
