
package tema2eje43;

import java.text.*;
import java.util.Locale;
public class Tema2eje43 {


    public static void main(String[] args) {
    double pi=4*Math.atan(1);
    System.out.println();
    NumberFormat a=NumberFormat.getInstance();
    a.setMaximumFractionDigits(4);
        System.out.println(a.format(pi));
    }

}
