
package tema2eje26;
import java.util.*;

public class Tema2eje26 {
    public static void main(String[] args) {
        System.out.println("Escribe los milisegundos que quieres que se pause el programa");    
    Long a=new Scanner(System.in).nextLong();
    try{
    Thread.sleep(a);
        System.out.println("Se acabo el programa");}
    catch(InterruptedException e){System.out.println("Ese no vale");}
    }

    } 
