
package tema5_02;

import Mercadona.*;
public class Tema5_02 {


    public static void main(String[] args) {
       Compras com=new Compras(1.5);
       try{
       com.registrarCompra(1.2);
       com.registrarCompra(1.2);
       com.registrarCompra(1.2);
       com.registrarCompra(1.2);
       com.registrarCompra(1.2);
       com.registrarCompra(1.2);
       com.registrarCompra(10.2);
       
       }
       catch(Exception e){
           System.out.println(e.getMessage());
       }
    }

}
