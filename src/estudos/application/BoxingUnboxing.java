package estudos.application;

public class BoxingUnboxing {
    public static void main(String [] args) {
        /*
        Boxing: conversão de um objeto tipo valor p/ objeto tipo referência compatível.
         */
        int x = 20;
        Object obj = x;
        System.out.println(obj);
        /*
        Unboxing: conversão de um objeto tipo referência p/ objeto tipo valor compatível.
         */
        int y = (int) obj;
        System.out.println(y);
    }
}
