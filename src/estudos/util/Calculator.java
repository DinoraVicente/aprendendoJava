package estudos.util;

public class Calculator {
    /*
final: para dizer que é uma constante e não irá mudar.
Sempre com letra maiuscula (PI), e se tiver mais de uma palavra como: NET_SALARY,
deve-se colocar o "_".
 */
    public static final double PI = 3.14159;

    public static double circumference(double radius) {
        return 2.0 * PI * radius;
    }

    public static double volume(double radius) {
        return 4.0 * PI * radius * radius * radius / 3.0;
    }
}

