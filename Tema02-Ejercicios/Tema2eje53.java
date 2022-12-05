
package tema2eje53;

import java.awt.Color;
import java.util.*;
import java.util.Scanner;


public class Tema2eje53 {


    public static void main(String[] args) {
    TreeMap<String,Color> matricula=new TreeMap<String,Color>();
    Color rojo=new Color(255,0,0);
    Color amarillo=new Color(255,253,0);
    Color verde=new Color(0,255,0);
    
    matricula.put("12535ABC" , rojo);
    matricula.put("98525KWX" , amarillo);
    matricula.put("17632MSE" , verde);
    matricula.put("85321ABC" , amarillo);
    
        System.out.println("Su tamanio es de:"+matricula.size());
        
        System.out.println("Llamo al metodo toString="+matricula.toString());
        
        System.out.println("Introduce una Matricula");
        String mat=new Scanner(System.in).nextLine();
        
        try{
            System.out.println(matricula.containsKey(mat));
            System.out.println(matricula.ceilingEntry(mat));
        }
        
        catch(Exception e){
            System.out.println("No esta en nuestra base de datos");}
        
        /*No noto nada no se por que*/
        
    }

}   
 
