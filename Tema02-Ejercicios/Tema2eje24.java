
package tema2eje24;
import java.io.*;
import java.util.*;
public class Tema2eje24 {


    public static void main(String[] args) {
        System.out.println("Introduce dos frases");
        String s=new Scanner(System.in).nextLine();
        String a=new Scanner(System.in).nextLine();
        try{
        PrintWriter m=new PrintWriter("hola.txt");
        m.println(s);
        m.println(a);
        m.close();
        }catch(FileNotFoundException e){System.out.println("Esta ruta no vale");}}
    
}
