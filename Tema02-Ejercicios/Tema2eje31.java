
package tema2eje31;
import bpc.daw.musica.*;
public class Tema2eje31 {


    public static void main(String[] args) {
    NotaMusical n1=new NotaMusical(1,1); 
    NotaMusical n2=new NotaMusical(2,1);
    NotaMusical n3=new NotaMusical(3,2);
    NotaMusical n4=new NotaMusical(5,1);
    NotaMusical n5=new NotaMusical(2,3);
    NotaMusical n6=new NotaMusical(0,1);
    
    Cancion moz=new Cancion("Mozart");
    moz.añadir(n4);
    moz.añadir(n1);
    moz.añadir(n2);
    moz.añadir(n3);
    moz.añadir(n5);
    moz.añadir(n6);
    moz.añadir(n2);
    moz.añadir(n6);
    
    
    
    Instrumento ins=new Piano();
    ins.reproducir(moz);
    Instrumento ins2=new Guitarra();
    ins2.reproducir(moz);
    
    }

}
