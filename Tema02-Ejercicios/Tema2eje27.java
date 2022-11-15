
package tema2eje27;
import java.util.*;
import java.net.*;

public class Tema2eje27 {

 
    public static void main(String[] args) {
        System.out.println("Escribe una direccion IP");
        String b=new Scanner(System.in).nextLine();
        try{
        InetAddress m=InetAddress.getByName(b);
            System.out.println(m.isReachable(10));}
        catch(Exception e){
            System.out.println("No se puede en ese tiempo");}
        
    }
    
}
