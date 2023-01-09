
package bucle.nombres;
import java.util.*;
public class BucleNombres {

    public static void main(String[] args) {
        String nom[]={"","","","",""};
        int x=nom.length;
        for(int y=0;x>4;){
            System.out.println("Escribe un nombre");
        String nom1=new Scanner(System.in).nextLine();
        if (nom1.isEmpty()){
            System.out.println("Ese nombre no vale está vacio");}
        else{System.out.println("Ese nombre es valido por los parametros del maestro");
            nom[y]=nom1;
            y++;
            }
        }System.out.println(nom);   
    }

}
