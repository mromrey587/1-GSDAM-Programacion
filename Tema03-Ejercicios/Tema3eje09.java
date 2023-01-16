package tema3eje09;

import java.util.*;
import java.lang.*;

public class Tema3eje09 {

    public static void main(String[] args) {

        System.out.println("Introduce un numero");
        double n = new Scanner(System.in).nextDouble();

        double a = 1;
        double s = 1;

        s = (0.5 * (a + (n / a)));

        double dif = s - a;

        dif = Math.abs(dif);

        boolean termine = dif < (0.000001);

        while (!termine) {
            a = s;

            s = (0.5 * (a + (n / a)));

            dif = s - a;

            dif = Math.abs(dif);

            termine = dif < (0.000001);
            
        }
        System.out.println("La raiz es "+s);

    }

}
