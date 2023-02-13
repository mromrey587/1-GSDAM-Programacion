
package tema4_15;

import Partido.*;
public class Tema4_15 {


    public static void main(String[] args) {
    Marcador_Baloncesto m=new Marcador_Baloncesto("loc","vis");
    
        System.out.println(m.getGanador());
        
        m.AñadirCanasta('l', 2);
        
        System.out.println(m.getGanador());
        
        m.AñadirCanasta('v', 3);
        
        System.out.println(m.getGanador());
    }

}
