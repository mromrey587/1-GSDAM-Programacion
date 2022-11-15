
package tema2eje10;

import bpc.daw.objetos.*;
public class Tema2eje10 {


    public static void main(String[] args) {
    Caja m=new Caja("Bienvenidos al Instituto");
    m.abrirCaja();
        System.out.println(m.getMensaje());
    m.cambiarMensaje("Fiumba... Cambiado");
        System.out.println(m.getMensaje());
    }
    
}
