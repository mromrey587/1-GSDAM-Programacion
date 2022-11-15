
package tema2eje16;

import java.util.*;
public class Tema2eje16 {


    public static void main(String[] args) {
        System.out.println("Introduce una frase y una palabra");
        String s1=new Scanner(System.in).nextLine();
        String p1=new Scanner(System.in).nextLine();
        String s2=s1.toLowerCase();
        String p2=p1.toLowerCase();
        if (s2.indexOf(p2)>0){System.out.println("Si aparece");}
        else{System.out.println("No aparece");}
    }
    
}
