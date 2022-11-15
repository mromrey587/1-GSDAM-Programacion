
package jtema2eje17;

import java.util.*;
public class JTema2eje17 {

  
    public static void main(String[] args) {
        System.out.println("Introduce tu nombre y despues tu dominio de correo que empezara con '@gmail.'");
        String nom=new Scanner(System.in).nextLine();
        String dom=new Scanner(System.in).nextLine();
        if (dom.endsWith("es")||dom.endsWith("com")){
            System.out.println("Tu direccion es:"+nom+dom);}
        else{System.out.println("Ese dominio no vale");}
    }
    
}
