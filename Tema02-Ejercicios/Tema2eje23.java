
package tema2eje23;
import bpc.daw.objetos.*;

public class Tema2eje23 {


    public static void main(String[] args) {
    TarjetaCredito m=new TarjetaCredito(1000,2222);
    m.ingresarDinero(100);
    try{System.out.println("Tu saldo es de:"+m.getSaldo(2222));}
    catch(Exception a){System.out.println("No se puede");}
    
    try{m.sacarDinero(2800, 2222);
    System.out.println("Tu saldo despues de la operación es de:"+m.getSaldo(2000));}
    catch(Exception b){System.out.println("No se puede sacar esa cantidad de dinero");}
    
    
    }
    
}
