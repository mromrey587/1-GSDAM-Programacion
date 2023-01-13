package tema3eje05;

import java.util.*;

public class Tema3eje05 {

    public static void main(String[] args) {

        System.out.println("Introduce el número de piezas que se pueden"
                + " cazar hoy");

        int piezas = new Scanner(System.in).nextInt();
        int cazadas = 0;

        boolean legal = cazadas >= piezas;

        while (!legal) {
            System.out.println("Cuantas piezas has cazado ahora??");

            int caho = new Scanner(System.in).nextInt();

            cazadas = cazadas + caho;
            System.out.println("Te quedan "+(piezas-cazadas));
            
            legal = cazadas >= piezas;
        }
        System.out.println("Se termino el dia");
    }

}
