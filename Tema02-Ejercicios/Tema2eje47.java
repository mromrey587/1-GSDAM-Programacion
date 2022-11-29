
package tema2eje47;

import java.util.*;
import java.awt.*;
import java.io.*;
public class Tema2eje47 {


    public static void main(String[] args) {
        System.out.println("Introduce una ruta de un archivo");
    String a=new  Scanner(System.in).nextLine();
    File n1=new File(a);
    try{
    Desktop x=Desktop.getDesktop();
    x.open(n1);}
    catch(Exception e)
    {System.out.println("Error:"+e.getMessage());}
    }

}
