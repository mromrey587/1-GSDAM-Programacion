
package examen3.pkg03;

import java.util.*;
public class Examen303 {

    
    public static void main(String[] args) {
    String y="*";
    int x;
    try{
    x=new Scanner(System.in).nextInt();
    
    while(x>0){
        for(int n=x;n>0;n-=1){
            System.out.print(y);}
            x-=1;
            System.out.println("");
        }
    }catch(Exception e){
        System.out.println(e.getMessage());}
    }

}
