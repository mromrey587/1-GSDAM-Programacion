
package tema2eje20;
import java.io.File;
import java.util.*;
public class Tema2eje20 {


    public static void main(String[] args) {
        System.out.println("Introduce una ruta de archivo del disco duro");
    String m=new Scanner(System.in).nextLine();
        File n=new File(m);
        if (n.isDirectory()){System.out.println("Es un directorio");}
        else{
        if (n.isFile()){
            System.out.println("Es un archivo de tamaño: "+n.length()+" Bytes; Deseas borrarlo?(si/no)");
            String s=new Scanner(System.in).nextLine();
            if (s.equals("si")){n.delete();System.out.println("El archivo sigue ahi?? "+n.exists());
            }else{
            if (s.equals("no")){System.out.println("El archivo sigue ahi?? "+n.exists());}
            else{System.out.println("Eso no es lo que se pedia");}}
        }}
        
       
    }
    
}
