
package Eq.EquipoDeFutbol;

public class CabreoException extends Exception{
    
    public CabreoException(String nom,double su){
        super("Al empleado "+nom+" no se le ha pagado todo"
                + " el sueldo:"+su);
    }
}
