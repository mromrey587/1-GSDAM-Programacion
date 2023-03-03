
package tema5_01;
import ej.Tombola.*;

public class Tema5_01 {


    public static void main(String[] args) {
        Sorteo s=new Sorteo(6.8,30);
        System.out.println(s.toString());
        
        s.registrarPago();
        s.registrarPago();
        System.out.println(s.toString());
        
        s.apuntarNuevoParticipante();
        System.out.println(s.toString());
    }

}
