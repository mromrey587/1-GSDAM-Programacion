
package tema2eje29;
import bpc.daw.objetos.*;
import java.util.*;
public class Tema2eje29 {


    public static void main(String[] args) {
    try{
        System.out.println("Escribe un numero");
    Double a=new Scanner(System.in).nextDouble();}
    catch(Exception e){
        System.out.println("Eso no es un numero");}
    /*No es ninguna de las 3 vistas, he puesto uno normal.*/
    Caja a=null;
    try{
       String b=a.getMensaje();
        System.out.println(b.length());
    }
    catch(NullPointerException e){System.out.println("La caja esta vacia, No se puede leer");
    }
    /*He usado el NullPointerException de cuando no defino un objeto*/
    
    
    } 
}
