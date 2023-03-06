
package tema5_05;

import co.Constructora.*;
public class Tema5_05 {

    public static void main(String[] args) {
       Hotel h=new Hotel("holandia",6,8);
       
       try{
            h.añadirCliente("ramon");

            h.retirarCliente("r");
            
            
       }
       catch(Exception e){
           System.out.println(e.getMessage());
       }
    }

}
