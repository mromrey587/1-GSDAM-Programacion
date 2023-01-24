
package examen3.pkg08;

import java.util.*;


public class Examen308 {

    
    public static void main(String[] args) {
    ArrayList<String> li=new ArrayList();
    String pal;
    String let;
    
   
    
    for(int x=0;x<6;x++){
        
        System.out.println("Escribe una palabra");
        pal=new Scanner(System.in).nextLine();
        pal=pal.toLowerCase();
        
        li.add(pal);
    }
    for(int x=0;x<(li.size());x++){
        
        pal=li.get(x);
        
        for(int y=0;y<(pal.length());y++){
            let=pal.substring(y, (y+1));
            
            if(let.equals("a")){
                System.out.println("La palabra '"+pal+"' tiene una a en "
                        + "la posicion "+(y+1));}
        }
        
        
    }
    }

}
