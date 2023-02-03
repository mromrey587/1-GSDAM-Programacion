
package undirme;

import Juego.*;
import java.awt.*;
public class Undirme {


    public static void main(String[] args) {
    Barco barc=new Barco(4);
    Barco barc2=new Barco(5);
    
    Tablero tabl=new Tablero(5,5);
    
    tabl.IntroduceBarco(barc);
    
    tabl.addBarco();
    
        System.out.println(tabl.WallHack());
    
    tabl.IntroduceBarco(barc2);
    
    tabl.addBarco();
    
        System.out.println(tabl.WallHack());

    
    }
}
    
    
    
    