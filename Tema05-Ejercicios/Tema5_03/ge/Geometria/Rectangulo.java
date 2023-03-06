
package ge.Geometria;


public class Rectangulo {
    private int base;
    private int altura;
    private int area;
    /**
     * Este es el constructor de mi clase que crea un rectangulo 
     * a partir de la base y de la altura 
     * @param ba
     * @param height 
     */
    public Rectangulo(int ba,int height){
        this.base=ba;
        this.altura=height;
        this.area=this.setArea();
    }
    /**
     * Se Establece el area de un rectangulo
     * (Es un metodo privado)
     * @return 
     */
    private int setArea(){
        int res=(this.base*this.altura)/2;
        return res;
    }
    /**
     * Se devuelve la base de el rectangulo
     * @return 
     */
    public int getBase() {
        return base;
    }
    /**
     * Se devuelve la altura del rectangulo
     * @return 
     */
    public int getAltura() {
        return altura;
    }
    /**
     * Se devuelve el area del rectangulo
     * @return 
     */
    public int getArea() {
        return this.setArea();
    }
    /**
     * Se establece la base del rectangulo a traves de otra variable
     * @param base 
     */
    public void setBase(int base) {
        this.base = base;
    }
    /**
     * Se establece la altura del rectangulo a traves de otra variable
     * @param altura 
     */
    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + ", area=" + area + '}';
    }
    
    
}
