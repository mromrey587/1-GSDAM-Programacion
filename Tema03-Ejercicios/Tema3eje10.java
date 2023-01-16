package tema3eje10;

import java.io.*;
import java.util.*;
public class Tema3eje10 {

    public static void main(String[] args) {
        String s1 =new Scanner(System.in).nextLine();
        int n = 2;
        char l;
        String letra;

        File a = new File(s1);
        try {
            FileReader b = new FileReader(a);

            while (n > 0) {

                n = b.read();
                l = (char) n;
                letra = Character.toString(l);
                System.out.print(letra);

            }

            b.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
