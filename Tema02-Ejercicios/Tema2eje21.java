
package tema2eje21ç;
import java.io.File;
import java.util.*;
public class Tema2eje21ç {

    public static void main(String[] args) {
        System.out.println("Introduce un directorio");
        String s=new Scanner(System.in).nextLine();
        File a=new File(s);
        if (a.isDirectory()){System.out.println("Tiene:"+a.listFiles());}
    }
    
}
