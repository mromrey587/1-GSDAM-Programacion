
package Mercadona;

import java.util.*;
public class Compras {
    private double presupuesto;
    private List<Double> precios;
    /**
     * Este es el constructor de nuestra clase
     * @param dinero 
     */
    public Compras(double dinero){
        this.presupuesto=dinero;
        
    }
    
    public void registrarCompra(double dinero)throws Exception{
        int tot=0;
        
        precios=new ArrayList();
        for(int x=0;x<precios.size();x++){
            tot+=precios.get(x);
        }
        
        if((tot+dinero)>this.presupuesto){
            Exception e=new Exception("No te da con tu presupuesto");
            throw e;
        }
        else{
            precios.add(dinero);
        }
    }
}
