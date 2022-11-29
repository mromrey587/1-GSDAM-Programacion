
package tema2eje39;

import java.lang.*;
public class Tema2eje39 {


    public static void main(String[] args) {
        
        System.out.println("Información sobre tu ordenador:");   
        System.out.println("-Systema operativo:"
                +System.getProperty("os.name"));   
        System.out.println("-Version del sistema operativo:"
                +System.getProperty("os.version"));   
        System.out.println("-Arquitectura del sistema operativo:"
                +System.getProperty("os.arch"));   
        System.out.println("-Usuario Actual:"
                +System.getProperty("user.name")); 
        System.out.println("-Carpeta de Archivos temporales:"
                +System.getProperty("java.home"));
    }

}
