
package tema3eje8;

import java.util.*;
public class Tema3eje8 {


    public static void main(String[] args) {
        System.out.println("Escribe una frase");
        
        String frase=new Scanner (System.in).nextLine();
        StringTokenizer fr=new StringTokenizer(frase);
        
        System.out.println("Tiene "+fr.countTokens()+" Palabras");
        
        boolean vasbien=fr.hasMoreElements();
        
        while(vasbien){
            System.out.println(fr.nextToken());
        
            vasbien=fr.hasMoreElements();}
        
    }

}
