
package tema2eje22;
import bpc.daw.objetos.*;

public class Tema2eje22 {


    public static void main(String[] args) {
    TarjetaCredito m=new TarjetaCredito(5000,1111);
    
    try{System.out.println("Tu saldo es de:"+m.getSaldo(1111));}
    catch(Exception a){System.out.println("No se puede");}
    
    try{m.sacarDinero(2000, 1111);
    System.out.println("Tu saldo despues de la operación es de:"+m.getSaldo(1111));}
    catch(Exception b){System.out.println("No se puede");}
    
    }
    
}
