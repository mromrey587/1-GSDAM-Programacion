
package tema2eje28;
import java.util.*;
import java.net.*;

public class Tema2eje28 {


    public static void main(String[] args) {
    System.out.println("Escribe una nombre de un equipo");
        String b=new Scanner(System.in).nextLine();
        try{
        InetAddress m=InetAddress.getByName(b);
            System.out.println(m.toString());}
        catch(Exception e){
            System.out.println("No se puede");}
    }
    
}
