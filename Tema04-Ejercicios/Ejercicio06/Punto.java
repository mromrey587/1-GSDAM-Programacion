
package Pointers;
import java.math.*;
import java.awt.*;
public class Punto {
    private int X;
    private int Y;
    private Point puntoMedio=null;
    public Punto(){
        X=0;
        Y=0;
    }
    public Punto(int x, int y){
        
        Toolkit a=Toolkit.getDefaultToolkit();
        Dimension b= a.getScreenSize();
        
        if(((x<=b.getWidth())&&(x>=0))&&((y<=b.getHeight())&&(y>=0))){
            X=x;
            Y=y;
        }
        else{
            x=(int)b.getWidth();
            y=(int)b.getHeight();
        }
    }
    
    public Punto(Point p){
        X=p.x;
        Y=p.y;
        
        puntoMedio=new Point(X/2,Y/2);
    }
    
    public Punto(double angulo,double Distancia){
        double b=Math.sin(angulo);
        b=b*Distancia;
        Y=(int)b;
        
        double c=Math.sin(90-angulo);
        c=c*Distancia;
        X=(int)c;
    }
    
    public Point GetPuntoMedio(){
        return puntoMedio;
    }
    public int GetY(){
        return Y;
    }
    public int GetX(){
        return X;
    }
    
}
