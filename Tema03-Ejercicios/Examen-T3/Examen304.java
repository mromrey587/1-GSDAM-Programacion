
package examen3.pkg04;

import java.util.*;


public class Examen304 {

    
    public static void main(String[] args) {
    int x;
    int sum=0;
    try{
    x=new Scanner(System.in).nextInt();
    ArrayList<Integer> li=new ArrayList();
    
    
        for(int n=0;n<x;n++){
            
            sum=n+1;
            li.add(sum);
            
            for(int z=0;z<li.size();z++){
                System.out.print(li.get(z));}
            
            System.out.println("");}

        while(x>0){
            for(int n=0;n<(x-1);n++){
                System.out.print(li.get(n));
            }
                x-=1;
                System.out.println("");
            }
        
    }catch(Exception e){
        System.out.println(e.getMessage());}
    }

}
