
package tema2eje00;

import bpc.daw.mario.*;


public class Tema2eje00 {


    public static void main(String[] args) {
        Mario m1 = null;
        Cañon a= null;
        Seta b=null;
        Luigi c=null;
        Planta d=null;
        
        
        
        m1= new Mario(100);{}
        m1= new Mario(640,320);{m1.girar();
        m1.saltar();}
        
        b= new Seta(100,0);{
    b.andarHacia(0, 0);}
        d= new Planta(400,500);{
        d.comer(true);}
        d= new Planta(450,500);{
        d.comer(true);}
        d= new Planta(500,500);{
        d.comer(true);}
        c= new Luigi(200);{}
        c= new Luigi(m1,50);{}
        a= new Cañon(100,320);{
        int anu=c.getX();
        int ane=c.getY();
    a.disparar(anu,ane);}
    }
    
}
