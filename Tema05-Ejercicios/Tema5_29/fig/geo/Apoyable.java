
package fig.geo;


public interface Apoyable extends FiguraGeometrica{
    public int getLongitudBase();
    public int getLongitudAltura();
    public default boolean esHorizontal(){
        if (this.getLongitudBase()>this.getLongitudAltura()){
            return true;
        }
        else{
            return false;
        }       
    }
    public default boolean esVertical(){
        if (this.getLongitudBase()<this.getLongitudAltura()){
            return true;
        }
        else{
            return false;
        } 
    }
}
