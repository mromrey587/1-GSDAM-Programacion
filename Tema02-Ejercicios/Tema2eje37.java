
package tema2eje37;
import java.util.*;

public class Tema2eje37 {


    public static void main(String[] args) {
        System.out.println("Escribe un numero entero");
        try{
        int a=new Scanner (System.in).nextInt();
        
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toHexString(a));
        
        }catch(Exception e){System.out.println("Eso no es numero entero");}
    }

}
