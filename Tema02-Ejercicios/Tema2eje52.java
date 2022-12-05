
package tema2eje52;
import java.util.*;
import java.awt.*;
public class Tema2eje52 {


    public static void main(String[] args) {
    Map<String,Color> matricula=new HashMap();
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
        }
        
        catch(Exception e){
            System.out.println("No esta en nuestra base de datos");}
        
    }

}
