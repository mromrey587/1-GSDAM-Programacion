
package Juego;
import java.awt.*;
public class Bomba {
    private int PosicionX;
    private int PosicionY;
    
    public Bomba(int px, int py){
        PosicionX=px;
        PosicionY=py;
    }
    
    public int getPX(){
        return PosicionX;
    }
            
    public int getPY(){
        return PosicionY;
    }
    
}

