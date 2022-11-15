
package tema2eje05;

import bpc.daw.mario.*;
public class Tema2eje05 {


    public static void main(String[] args) {
    Cañon c1=null;
    Cañon c2=null;
    
    c1=new Cañon(200,200);{
    c1.disparar(250, 200);
    c1.disparar(270, 200);
    c1.disparar(300, 200);
    int nu1=c1.getTotalDisparosRealizados();
        System.out.println("El cañon 1 Ha realizado "+nu1+" disparos");}
    
    c2=new Cañon(200,300);{
        c2.disparar(270, 300);
        c2.disparar(300, 300);
        int nu1=c2.getTotalDisparosRealizados();
        System.out.println("El cañon 2 Ha realizado "+nu1+" disparos");
    }
    
    
    
    }
    
}
