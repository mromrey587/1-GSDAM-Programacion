
package juego.palabras;

import java.util.Scanner;


public class JuegoPalabras {


    public static void main(String[] args) {
    String list[]={"boolean","byte","char","short","int","long","float","double","void","false","null",
    "true","abstract","final","native","private","protected","public","stactic","synchronized","transient","volatile","break",
    "case","catch","continue","default","do","else","finally","for","if","return","switch","throw",
    "try","while","class","extends","implements","interface","trhrows","import","package","instanceof","new","super",
    "this","byvalue","cast","const","future","generic","goto","inner","operator","outer","rest","var"};
    
    final String red = "\u001B[31m";
    final String green = "\u001B[32m";
    final String black = "\u001B[30m";
    
    
        System.out.println("Empecemos; escribe tu primera palabra(Son 59)"+red+"\n(AVISO: TE PUEDES RENDIR PONIENDO 'no puedo')"+black );
    
    for(int punt=0;punt<(list.length);){
        String pal=new Scanner(System.in).nextLine();   
    for(int x=0;x<(list.length);x++){
    
    if (pal.equals(list[x])){punt++;
        System.out.println(green+list[x]+" si vale"+black);
        int y=list.length-punt;
        System.out.println("Te quedan:"+y);
            if ((punt>58)&&(punt<80)){System.out.println(green+"ENHORABUENA HAS GANADO");}}
            else{if (pal.equals("no puedo")){
            punt=80;
            System.out.println(red+"has fallado");}}
    
    }  
    }
    
       
    }

}
