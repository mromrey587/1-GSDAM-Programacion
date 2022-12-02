
package tema2eje50;

import java.util.*;
public class Tema2eje50 {


    public static void main(String[] args) {
    ArrayList mensajes= new ArrayList();
    
    mensajes.add("Hola");
    mensajes.add("que");
    mensajes.add("tal");
    mensajes.add("como");
    mensajes.add("estas.");
    
        System.out.println("Tiene "+mensajes.size()+" palabras");
        
        System.out.println("La palabra en la posicion 3 es: "+mensajes.get(2));
        
        System.out.println("Lo que pasa con un toString="+mensajes.toString());
        
        System.out.println("Elimino el primer metodo de la lista="+mensajes.remove(0));
        
        System.out.println("Tiene "+mensajes.size()+" palabras");
        
        System.out.println("La palabra en la posicion 3 es: "+mensajes.get(2));
        
        System.out.println("Lo que pasa con un toString="+mensajes.toString());
    }

}
