
package tema5_14;
import Contraseñas.*;
import java.util.*;
public class Tema5_14 {


    public static void main(String[] args) {
       GeneradorContraseñas gc=new GeneradorContraseñas();
       
        System.out.println(gc.generarContraseña());
        System.out.println(gc.generarContraseña(5));
    }

}
