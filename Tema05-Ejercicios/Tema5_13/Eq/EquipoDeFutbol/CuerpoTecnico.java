
package Eq.EquipoDeFutbol;


public class CuerpoTecnico extends Empleado{
    private String puesto;
    /**
     * Constructor de la clase Cuerpo Tecnico
     * @param nom= nombre (se encuentra en la calse padre)
     * @param su= sueldo (se encuentra en la calse padre)
     * @param pu= puesto
     */
    public CuerpoTecnico(String nom,double su,String pu){
        super(nom,su);
        this.puesto=pu;
    }
    /**
     * Getter de la variable puesto
     * @return 
     */
    public String getPuesto() {
        return puesto;
    }
    
    
}
