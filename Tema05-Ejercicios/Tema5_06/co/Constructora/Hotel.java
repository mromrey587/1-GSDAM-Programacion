
package co.Constructora;
import java.util.*;

public class Hotel extends Edificio{
    private List<String> clientes;
    private int maximo;
    
    public Hotel(String d, int np, int max){
        super(d,np);
        this.maximo=max;
        clientes=new ArrayList();
    }
    
    public void añadirCliente(String c){
        if(clientes.size()>=maximo){
            IllegalArgumentException e= new IllegalArgumentException
        ("HAS ALCANZADO EL MAXIMO DE"
                    + " PERSONAS");
            throw e;
        }
        else{
            clientes.add(c);
        }
    }
    
    public void retirarCliente(String c)throws Exception{
        if(clientes.size()>0){
            if(clientes.contains(c)){
                clientes.remove(c);
            }
            else{
                NoSuchElementException e= new NoSuchElementException 
        ("ESA PERSONA NO ESTA REGISTRADA");
                throw e;
            }
        }
        else{
            IllegalArgumentException e= new IllegalArgumentException
        ("NO HAY NADIE EN EL HOTEL");
                throw e;
        }
    }
    
    
}
