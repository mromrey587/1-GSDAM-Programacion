
package tema2eje34;

import bpc.daw.reproductor.*;
public class Tema2eje34 {


    public static void main(String[] args) {
        try{
    PlayList pl1=new PlayList("C:/Users/manue/Desktop/chulo.txt");
    Reproductor re=new Reproductor(pl1,true,true);
    re.play();
    }
    catch(Exception e){System.out.println("No se encuentra");}  
    }

}
