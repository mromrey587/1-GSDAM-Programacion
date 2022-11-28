
package tema2eje33;

import java.io.File;
import bpc.daw.reproductor.*;
public class Tema2eje33 {

    
    public static void main(String[] args) {
    File pl=new File("C://Users//manue//Desktop//Reproductor MP3//PL.mp3/");
    String PL=pl.toString();
    File dk=new File("C://Users//manue//Desktop//Reproductor MP3//DK.mp3/");
    String DK=dk.toString();
    File sfdk=new File("C://Users//manue//Desktop//Reproductor MP3//SFDK.mp3/");
    String SFDK=sfdk.toString();
    
    
    ArchivoMP3 m1=new ArchivoMP3(PL);
    
    ArchivoMP3 m2=new ArchivoMP3(DK);
    
    ArchivoMP3 m3=new ArchivoMP3(SFDK);
    
    
    PlayList chu=new PlayList();
    chu.añadir(m3);
    chu.añadir(m2);
    chu.añadir(m1);
    chu.setTitulo("Lista de Canciones");
    try{
    chu.guardar("C:/Users/manue/Desktop/Reproductor MP3");}
    catch( Exception e){System.out.println("No se puede guardar");}
    
    Reproductor chulaco=new Reproductor(chu,true,true);
    chulaco.play();

    }

}
