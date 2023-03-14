
package Eq.EquipoDeFutbol;


public class Futbolista extends EmpleadoPrimable{
   private int dorsal;
   /**
     * Construye un objeto Futbolista que es hijo de EmpleadoPrimable
     * @param nom=nombre
     * @param su=sueldo
     * @param dor=dorsal
     */
   public Futbolista(String nom, double su, int dor){
       super(nom,su);
       this.dorsal=dor;
   }
}
