package estudos.util;

public class CurrencyCoverter {
    public final static double IOF = 6.0;

    public static double coverterReais(double dollar, double quantity){
        double result = dollar * quantity;
        return result += result * IOF/100;
    }
}
