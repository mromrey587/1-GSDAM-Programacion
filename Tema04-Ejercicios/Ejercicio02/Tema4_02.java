
package tema4_02;
import almacen.Caja;

public class Tema4_02 {


    public static void main(String[] args) {
    Caja m=new Caja();
    m.setMensaje("ole ole los caracoles");
    
        System.out.println(m.LeerMensaje());
        
        m.abrirCaja();
        System.out.println(m.LeerMensaje());
    }

}
