
package tema4_07;
import daw.persona.*;

public class Tema4_07 {


    public static void main(String[] args) {
        CuentaCorriente b=new CuentaCorriente(111111,0.45);
        
        b.RetirarCantidad(5);
        
        System.out.println(b.VerSueldo());
    }

}
