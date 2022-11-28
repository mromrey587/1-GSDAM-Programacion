
package tema2eje35;

import bpc.daw.reproductor.*;
public class Tema2eje35 {


    public static void main(String[] args) {
    ArchivoMP3 a1=new ArchivoMP3("C:/Users/manue/Desktop/Instituto/Programación/librerias/Reproductor MP3/PL.mp3");
    ArchivoMP3 a2=new ArchivoMP3("C:/Users/manue/Desktop/Instituto/Programación/librerias/Reproductor MP3/PL.mp3");
    Reproductor r1=new Reproductor(a1,true,true);
    boolean tf=(a1==a2);
    boolean tf1=(a1.equals(a2));
        System.out.println(tf+" ");
        System.out.println(tf1+" ");
        System.out.println(a1.hashCode()+"  "+a2.hashCode());
        
        System.out.println(r1.toString());
        
        System.out.println(a1.toString());/*No tiene nada que ver y no se a que se debe*/
    
    }

}
