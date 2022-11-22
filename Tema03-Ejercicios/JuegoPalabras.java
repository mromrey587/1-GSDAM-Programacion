
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
    
    
        System.out.println("Empecemos; primero elige un nivel de dificultad poniendo el numero entero que lleva delante:\n1-facil(15 ACIERTOS)\n2-medio(30 ACIERTOS)\n3-dificil(59 ACIERTOS)\n"+red+"(AVISO SI NO PONES UN NUMERO ENTERO DEL 1 AL 3 SE TE PONDRA EN DIFICL COMO PREDETERMINADO"+black);
    
        
    String r=new Scanner(System.in).nextLine();
    try{int a=Integer.parseInt(r);
    int max;
    switch(a){
        case 1:
            max=15;
            System.out.println("Nivel Facil");
            break;
        case 2:
            max=30;
            System.out.println("Nivel Medio");
            break;
        case 3:
            max=59;
            System.out.println("Nivel Dificil");
            break;
        default:
            max=59;
            System.out.println("Nivel Dificil");
            break;
    }
    
    for(int punt=0;punt<max;){
        String pal=new Scanner(System.in).nextLine();   
    for(int x=0;x<(list.length);x++){
    
    if (pal.equals(list[x])){punt++;
        System.out.println(green+list[x]+" si vale"+black);
        list[x]="jiapsdj";
        int y=max-punt;
        System.out.println("Te quedan:"+y);
            if ((punt>(max-1))&&(punt<80)){System.out.println(green+"ENHORABUENA HAS GANADO");}}
            else{if (pal.equals("no puedo")){
            punt=80;
            System.out.println(red+"has fallado");}}
    
    }  
    }
    }catch(Exception e){System.out.println("No se puede con ese caracter");}
       
    }

}
