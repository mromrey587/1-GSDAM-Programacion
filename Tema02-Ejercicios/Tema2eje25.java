
package tema2eje25;
import java.io.*;
import java.util.*;
public class Tema2eje25 {


    public static void main(String[] args) {
    File n=new File("hola.txt");
    try{
    Scanner m=new Scanner(n);
        System.out.println(m);
    }catch(FileNotFoundException e){System.out.println("No se ha encontrado el archivo");}}
    
}
