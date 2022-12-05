
package tema2eje54;

import java.util.*;


public class Tema2eje54 {

    public static void main(String[] args) {
    ArrayList mensajes= new ArrayList();
    
        System.out.println(mensajes.toString());
    
    mensajes.add("hola");
    mensajes.add("que");
    mensajes.add("tal");
    mensajes.add("como");
    mensajes.add("estas.");
    mensajes.add("Espania");
    mensajes.add("corona");
    mensajes.add("el");
    mensajes.add("mundial");
    mensajes.add("papa");
    
    System.out.println(mensajes.toString());
    
    Collections.sort(mensajes);
        System.out.println(mensajes.toString());
        
    }

}
