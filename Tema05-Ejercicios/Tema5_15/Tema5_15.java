
package tema5_15;

import Contraseñas.*;
public class Tema5_15 {


    public static void main(String[] args) {
        GenerarContraseñasUnicas gcu=new GenerarContraseñasUnicas();
        
        System.out.println(gcu.generarContraseña());
        System.out.println(gcu.generarContraseña(20));
    }

}
