
package Eq.EquipoDeFutbol;


public class EmpleadoPrimable extends Empleado{
    private boolean primado;
    
    public EmpleadoPrimable(String nom,double su){
        super(nom,su);
        this.primado=false;
    }

    public void primar(){
        this.primado = true;
    }

    public boolean esPrimado() {
        return primado;
    }
}
