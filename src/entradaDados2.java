import java.util.Scanner;

public class entradaDados2 {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int x;
        String s1, s2, s3;
        // para ler a linha inteira precisa do "Line" senão lê apenas a 1° palavra
        x = sc.nextInt();
        // se colocar uma leitura diferente da "nextLine", uma quebra de linha fica pendente
        // Se fizer um "nextLine", a quebra de linha pendente será substituida pela próxima.
        sc.nextLine();
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("Informações:");
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        sc.close();
    }
}