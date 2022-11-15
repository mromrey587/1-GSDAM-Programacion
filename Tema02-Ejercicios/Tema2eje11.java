
package tema2eje11;
import bpc.daw.objetos.*;

public class Tema2eje11 {


    public static void main(String[] args) {
    Caja m=new Caja("Bienvenidos al Instituto");
    
    Caja n=new Caja("Hola que tal");
    
    m.abrirCaja();
    n.abrirCaja();
    
    String x=m.getMensaje();
    String y=n.getMensaje();
    
    m.cambiarMensaje(y);
    n.cambiarMensaje(x);
       
        System.out.println(m.getMensaje());
        System.out.println(n.getMensaje());
    
    
    }
    
}
