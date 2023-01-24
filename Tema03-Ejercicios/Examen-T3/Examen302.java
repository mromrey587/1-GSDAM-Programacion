
package examen3.pkg02;

import java.util.*;
public class Examen302 {

    public static void main(String[] args) {
    ArrayList<Integer> nums=new ArrayList();
    int sum=0;
    int num;
    int x=0;
    
    
    try{
    do{
        System.out.println("Introduce numeros hasta que la suma("+sum+
                ") no llegue a 10000");
        num=new Scanner(System.in).nextInt();
        
        if(num<0){
            System.out.println("Escribe numeros positivos por favor");
        }
        else{
            sum=sum+num;
            nums.add(num);
            }
    }
    while(sum<10000);
    
    for(int y=0;y<(nums.size());y++){
        x=x+(nums.get(y));
    }
    
    System.out.println("La suma es "+sum);
    System.out.println("Hay "+nums.size()+" numeros");
    System.out.println("Su media es de "+(x/(nums.size())));
    
    }catch(Exception e){
        System.out.println(e.getMessage());}
    }

}
