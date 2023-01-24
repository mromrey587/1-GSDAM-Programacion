
package examen3.pkg06;

import java.util.*;
public class Examen306 {

    
    public static void main(String[] args) {
    ArrayList<Integer> li=new ArrayList();
    int ce=0;
    int un=1;
    
    for(int x=0;x<5000;x++){
        li.add(ce);
    }
    
    for(int x=0;x<5000;x++){
        if((x%2)==0){
            }
        else{
            li.add(x, un);}
    }
    System.out.println(li);
    
    for(int x=0;x<5000;x++){
        System.out.println("En la posicion "+x+" Hay un "+li.get(x));
        }
    
    }

}
