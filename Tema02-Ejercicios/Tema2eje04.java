
package tema2eje04;

import bpc.daw.mario.*;
public class Tema2eje04 {

   
    public static void main(String[] args) {
    Mario ma1=null; 
    Luigi lu1=null;
    
    lu1=new Luigi(500);{
    int a=lu1.getX();
    int b=lu1.getY();System.out.println("la de luigi es: X("+a+") Y("+b+")");}
    ma1=new Mario(lu1,50);{
    int c=ma1.getX();
    int d=ma1.getY();System.out.println("la de mario es: X("+c+") Y("+d+")");}
    
        
    
    
    
    }
    
}
