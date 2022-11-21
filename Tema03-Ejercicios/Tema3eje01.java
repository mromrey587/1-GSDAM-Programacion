
package tema3eje01;

import java.util.*;
public class Tema3eje01 {

  
    public static void main(String[] args) {
    String a="Duki / She don't give a f*ck";
    String b="Paulo Londra / Adan y eva";
    String c="SFDK / Un pobre con dinero";
    String d="Ayax / La Gondola";
    String e="Kaze / Modo Turbio";
        System.out.println("Escribe el numero de la canción a reproducir:\n1-"+a+"\n2-"+b+"\n3-"+c+"\n4-"+d+"\n5-"+e);
        int n1=new Scanner(System.in).nextInt();
        switch(n1){
            case 1:
                System.out.println("Reproduciendo: "+a);
                break;
        case 2:
                System.out.println("Reproduciendo: "+b);
                break;
        case 3:
                System.out.println("Reproduciendo: "+c);
                break;
        case 4:
                System.out.println("Reproduciendo: "+d);
                break;
        case 5:
                System.out.println("Reproduciendo: "+e);
                break;
        default:
                System.out.println("Esa no era una opcion");}
        
        
    }

}
