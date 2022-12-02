
package tema2eje48;

import bpc.daw.objetos.*;
public class Tema2eje48 {


    public static void main(String[] args) {
    final int loc= 697259;
    final int vis= 782507;
    final int p1= 266;
    final int p2= 522;
    final int p3= 778;
    
    MarcadorMejorado m=new MarcadorMejorado("Estudiantes","CBGranada");
    
    m.anotarCanasta(loc,  p2);
    m.anotarCanasta(loc,  p2);
    m.anotarCanasta(loc,  p1);
    m.anotarCanasta(loc,  p1);
    
    m.anotarCanasta(vis,   p3);
    m.anotarCanasta(vis,   p3);
    m.anotarCanasta(vis,   p2);
    m.anotarCanasta(vis,   p2);

    System.out.println("El local es:"+m.getNombreLocal()+
            " con "+m.getPuntosLocal()+" puntos");
    
    System.out.println("El visitante es:"+m.getNombreVisitante()+
            " con "+m.getPuntosVisitante()+" puntos");
    
    System.out.println("Va Ganando:"+m.getNombreEquipoGanador());
    
    System.out.println("Va perdiendo:"+m.getNombreEquipoPerdedor());
    
    System.out.println(m);
    
    
    }

}
