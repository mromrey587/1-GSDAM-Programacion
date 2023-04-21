
package fig.geo;

import java.awt.*;
public interface FiguraGeometrica extends Coloreable{
    public double getArea();
    public int getPerimetro();
    public void dibujar(Graphics g);
    public default Cuadrado crearCuadradoIgualArea(Point esquinaSuperiorIzquierda){
        Cuadrado cr=new Cuadrado(esquinaSuperiorIzquierda,this.getArea(),this.getColor());
        return cr;
    };
}
