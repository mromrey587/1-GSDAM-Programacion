
package tema5_03;

import ge.Geometria.*;
public class Tema5_03 {


    public static void main(String[] args) {
       Rectangulo r=new Rectangulo(5,6);
       
        System.out.println(r.getBase());
        System.out.println(r.getAltura());
        System.out.println(r.getArea());
        
        r.setAltura(0);
        r.setBase(5);
        
        System.out.println(r.getBase());
        System.out.println(r.getAltura());
        System.out.println(r.getArea());
        
        System.out.println(r.toString());
    }

}
