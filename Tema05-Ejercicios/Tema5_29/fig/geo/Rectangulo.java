
package fig.geo;

import java.awt.*;
public class Rectangulo implements Centrable,Apoyable{
    protected Point esquinaSuperiorIzquierda;
    protected Point esquinaInferiorDerecha;
    private Color color;
    
    public Rectangulo(Point esi,Point eid,Color c){
        this.esquinaInferiorDerecha=eid;
        this.esquinaSuperiorIzquierda=esi;
        this.color=c;
    }
    
    public Point getCentro(){
        int eidX=this.esquinaInferiorDerecha.x;
        int eidY=this.esquinaInferiorDerecha.y;
        int esiX=this.esquinaSuperiorIzquierda.x;
        int esiY=this.esquinaSuperiorIzquierda.y;
        Point p1=new Point(((esiX+eidX)/2),((esiY+eidY)/2));
        
        return p1;
    }
    public int getLongitudBase(){
        int eidX=this.esquinaInferiorDerecha.x;
        int esiX=this.esquinaSuperiorIzquierda.x;

        return esiX-eidX;
        
    }
    public int getLongitudAltura(){
        int eidY=this.esquinaInferiorDerecha.y;
        int esiY=this.esquinaSuperiorIzquierda.y;
        
        return esiY-eidY;
    }
    
    
    public boolean esHorizontal(){
        if (this.getLongitudBase()>this.getLongitudAltura()){
            return true;
        }
        else{
            return false;
        }       
    }
    
    
    public boolean esVertical(){
        if (this.getLongitudBase()<this.getLongitudAltura()){
            return true;
        }
        else{
            return false;
        } 
    }
    
    public double getArea(){
        int ladoX=this.esquinaSuperiorIzquierda.x-this.esquinaInferiorDerecha.x;
        int ladoY=this.esquinaSuperiorIzquierda.y-this.esquinaInferiorDerecha.y;
        return ladoX*ladoY;
    }
    public int getPerimetro(){
        int ladoX=this.esquinaSuperiorIzquierda.x-this.esquinaInferiorDerecha.x;
        int ladoY=this.esquinaSuperiorIzquierda.y-this.esquinaInferiorDerecha.y;
        return (ladoX*2)+(ladoY*2);
    }
    public void dibujar(Graphics g){
        g.create();
    }
    public Color getColor(){
        return this.color;
    }
    public Cuadrado crearCuadradoIgualArea(Point esquinaSuperiorIzquierda){
        Cuadrado cr=new Cuadrado(esquinaSuperiorIzquierda,this.getArea(),this.getColor());
        return cr;
    };
}
