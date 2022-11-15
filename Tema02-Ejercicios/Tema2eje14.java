
package tema2eje14;
import java.util.*;

public class Tema2eje14 {


    public static void main(String[] args) {
    System.out.println("Escribe una frase");
    String nom=new Scanner(System.in).nextLine();
    int x=nom.length()/2;
        System.out.println("El caracter que esta justo en medio es:"+nom.charAt(x));
    }
    
}
