
package Eq.EquipoDeFutbol;


public class Empleado {
    private String nombre;
    private double sueldo;
    private double dinero;
    /**
     * Es el constructor de la clase padre empleado
     * al que se le pasan dos paramentros
     * @param n=nombre
     * @param s=sueldo
     */
    public Empleado(String n,double s){
        this.nombre=n;
        this.sueldo=s;
    }
    /**
     * Getter de sueldo 
     * @return 
     */
    public double getSueldo(){
        return this.sueldo;
    }
    /**
     * Getter del dinero
     * @return 
     */
    public double getDinero(){
        return this.dinero;
    }
    /**
     * Este metodo cobra la cantidad que se le pasa como parametro y la añade 
     * a dinero pero si la cantidad que le hemos pasado es menor que el sueldo
     * se lanzaria la excepción personalizada que hemos hecho para simular un 
     * cabreo de dicho empleado
     * @param cantidad
     * @throws CabreoException 
     */
    public void cobrar(double cantidad)throws CabreoException{
        this.dinero=+cantidad;
        if(cantidad<this.getSueldo()){
            CabreoException e=new CabreoException(this.nombre,this.sueldo);
            throw e;
        }
    }
    /**
     * Getter de el nombre
     * @return 
     */
    public String getNombre() {
        return nombre;
    }
}
