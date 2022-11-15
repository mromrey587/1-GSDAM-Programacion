
package tema2eje18;

import java.util.*;
public class Tema2eje18 {


    public static void main(String[] args) {
        System.out.println("Introduce tu correo electronico");
        String n=new Scanner(System.in).nextLine();
        int a=n.indexOf("@");
        if (a>0){System.out.println(n.substring(a+1));}
    
    }
    
}
