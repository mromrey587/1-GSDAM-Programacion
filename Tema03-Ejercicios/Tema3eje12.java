
package tema3eje12;
import java.util.*;
import java.io.*;
public class Tema3eje12 {

    public static void main(String[] args) {
        int n=0;
        int x;
        int num;
        int y=0;
        int nmax=0;
        int nmin=10;
        int nota=0;
        
        List<Integer> notas = new ArrayList<Integer>();
        try{
        while(n!=-1){
            System.out.println("Introduce notas de alumnos/Cuando pongas '-1'"
                    + "se acaba el programa");
            n=new Scanner(System.in).nextInt();
            
            if(n==-1){
                for(x=0;x<=(notas.size()-1);){   
                    num=notas.get(x);
                    nota=nota+num;
                    x++;}
                
                System.out.println("Su nota media es:"+nota/x);
                System.out.println("Su nota maxima es:"+nmax);
                System.out.println("Su nota minima es:"+nmin);}
            else{
            if(nmax<n){nmax=n;}//Nota mas grande
            if(nmin>n){nmin=n;}//Nota mas chica
            
            notas.add(n);
            y++;
            System.out.println(notas);}}}
        catch(Exception e){
            System.out.println(e.getMessage());}
            
         
    }

}
