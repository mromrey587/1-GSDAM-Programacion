
package tema4_09;
import Partido.*;
public class Tema4_09 {


    public static void main(String[] args) {
       Marcador_Baloncesto b=new Marcador_Baloncesto("a","b");
       
       b.AñadirCanasta('l', 3);
        System.out.println(b.getPuntosLocal());
        
        b.Reset();
        
        System.out.println(b.getPuntosLocal());
    }

}
