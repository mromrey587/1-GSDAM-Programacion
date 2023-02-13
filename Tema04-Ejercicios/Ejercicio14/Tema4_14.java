
package tema4_14;

import daw.persona.*;
public class Tema4_14 {

    
    public static void main(String[] args) {
        Oficina of=new Oficina();
        System.out.println(of.trabaja("Ana Diaz"));
    
        System.out.println(of.getMilEuristas());
        
        of.pagarEmpleados();
        
        Persona p=of.getPersona(1);
        
        System.out.println(p.verStracto());
    }

}
