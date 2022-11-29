
package tema2eje46;

import java.lang.*;
import java.time.*;
public class Tema2eje46 {


    public static void main(String[] args) {
    int a=(int)(Math.random()*(9+1-0))+0;
    try{
        Instant n1=Instant.now();
    Thread.sleep((a*1000));
        Instant n2=Instant.now();
        
    System.out.println(Duration.between(n1, n2));
    }
    catch(Exception e)
    {}
    }

}
