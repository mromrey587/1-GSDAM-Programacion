
package tema2eje12;
import bpc.daw.objetos.*;

public class Tema2eje12 {

    public static void main(String[] args) {
    
    String loc="Estudiantes";
    int x=0;
    String vis="CB Granada";
    int y=0;
    char L=76;
    char V=86;
    
    MarcadorBaloncesto m=new MarcadorBaloncesto(loc,vis);
    
    
    m.anotarCanasta(L, 2);
    m.anotarCanasta(V, 3);
    m.anotarCanasta(L, 2);
    m.anotarCanasta(V, 2);
    m.anotarCanasta(V, 3);
    m.anotarCanasta(L, 1);
    m.anotarCanasta(L, 1);
    m.anotarCanasta(V, 2);
    
    
        System.out.println(m.getNombreEquipoGanador()+" Va ganando");
        System.out.println(m.getNombreEquipoPerdedor()+" Va ganando");
    
    }
    
}
