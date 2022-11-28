
package tema2eje32;

import java.io.File;
import bpc.daw.reproductor.*;

public class Tema2eje32 {


    public static void main(String[] args) {
    File dk=new File("C:/Users/manue/Desktop/PL.mp3");
    String PL=dk.toString();
    
    ArchivoMP3 m=new ArchivoMP3(PL);
    System.out.println(m.getAutor());
    Reproductor re=new Reproductor(m,false,true);
    re.play();
    
    
    
    }

}
