
package tema2eje09;
import bpc.daw.objetos.*;

public class Tema2eje09 {


    public static void main(String[] args) {
    Caja m=new Caja("Bienvenidos al Instituto");
    m.cerrarCaja();
        System.out.println( m.getMensaje());
    m.abrirCaja();
        System.out.println(m.getMensaje());
    
    }
    
}
