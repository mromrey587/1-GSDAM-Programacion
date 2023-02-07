
package tema4_11;
import java.time.*;
import daw.persona.*;

public class Tema4_11 {

    
    public static void main(String[] args) {
        DNI dni=new DNI(5555555,'l');
        LocalDate f=LocalDate.now();
        
        Persona per=new Persona("manu",dni,500,f);
        Oficina of=new Oficina();
        
        of.AñadirPersona(per);
        of.VerPersona(4);
        
        of.AñadirPersona("manu",dni,500,f);
        of.VerPersona(5);
    }

}
