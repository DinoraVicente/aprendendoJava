package estudos.application;

import estudos.entities.Employee2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioLists {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();
        List<Employee2> list = new ArrayList<>();

        for (int i=0; i<n; i++){
            System.out.println();
            System.out.println("Employee #" + (i+1));
            System.out.print("Id: ");
            int id = sc.nextInt();

            while (hasId(list, id)){
                System.out.println("ID already taken! Try again: ");
                id = sc.nextInt();
            }

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            Employee2 emp = new Employee2(id, name, salary);
            list.add(emp);
        }

        System.out.println();
        System.out.println("Enter the employee id that will have salary increase: ");
        int idSalary = sc.nextInt();

        Integer pos = idPosition(list, idSalary);

        if(pos == null){
            System.out.println("This ID does not exist!");
        } else {
            System.out.println("Enter the percentage: ");
            double percentage = sc.nextDouble();
            list.get(pos).increseSalary(percentage);
        }

        System.out.println();
        System.out.println("List of employees: ");
        for(Employee2 lista : list){
            System.out.println(lista);
        }

        sc.close();
    }

    public static Integer idPosition(List<Employee2> list, int id){
        for(int i=0;i<list.size(); i++){
            if(list.get(i).getId() == id){
                return i;
            }
        }
        return null;
    }
    public static boolean hasId(List<Employee2> list, int id){
        Employee2 emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}
