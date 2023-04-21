
package fig.geo;

import java.awt.*;
public class Cuadrado extends Rectangulo{
    private int longitudLado;
    public Cuadrado(Point esI,int lL,Color c){
        super(esI,new Point(esI.x+lL,esI.y-lL),c);
        this.longitudLado=lL;
    }
    
    public Cuadrado(Point esI,double a,Color c){
        super(esI,new Point((int)(esI.x+(a/2)),(int)(esI.y-(a/2))),c);
        this.longitudLado=(int)(a/2);
    }
}
