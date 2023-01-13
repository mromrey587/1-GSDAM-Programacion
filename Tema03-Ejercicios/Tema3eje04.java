package tema3eje4;

import java.util.*;

public class Tema3eje4 {

    public static void main(String[] args) {
        System.out.println("Eres mayor de edad?(SI)o(NO)");
        System.out.println("SOLO se admiten esas respuestas");

        String resp = new Scanner(System.in).nextLine();
        resp = resp.toLowerCase();

        boolean buena = (resp.equals("si"))||(resp.equals("no"));

        while (!buena) {
            System.out.println("Esa respuesta no es valida");

            resp = new Scanner(System.in).nextLine();
            resp = resp.toLowerCase();

            buena = (resp.equals("si")) || (resp.equals("no"));
        }

        if (resp.equals("si")) {
            System.out.println("Eres mayor de edad");
        } else {

            if (resp.equals("no")) {
                System.out.println("Eres menor de edad");
            }
        }
    }

}
