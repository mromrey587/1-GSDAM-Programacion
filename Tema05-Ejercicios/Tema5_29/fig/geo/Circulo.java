
package fig.geo;

import java.awt.*;
public class Circulo implements Centrable, FiguraGeometrica{
    private Point centro;
    private int radio;
    private Color color;
    
    public Circulo(Point cn,int rd,Color c){
        this.centro=cn;
        this.radio=rd;
        this.color=c;
    }
    
    public Point getCentro(){
        return this.centro;
    }
    
    public double getArea(){
        return Math.pow((3.14*this.radio),2);
    }
    public int getPerimetro(){
        return (int)((2*3.14)*this.radio);
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
