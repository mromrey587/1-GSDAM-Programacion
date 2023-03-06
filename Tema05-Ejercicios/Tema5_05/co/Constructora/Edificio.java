
package co.Constructora;


public class Edificio {
    private String direccion;
    private int numPlantas;
    /**
     * Este es el constructor de mi clase Padre
     * @param d
     * @param np 
     */
    public Edificio(String d, int np){
        this.direccion=d;
        this.numPlantas=np;
    }
    //Getters
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setNumPlantas(int numPlantas) {
        this.numPlantas = numPlantas;
    }
    
}
