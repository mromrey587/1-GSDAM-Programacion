
package daw.persona;


public class CuentaCorriente {
    private int numero;
    private double sueldo;
    
    public CuentaCorriente(){
        numero=(int)(0+(1000-0)*Math.random());
        sueldo=0;
    }
    public CuentaCorriente(int num){
        numero=num;
        sueldo=0;
    }
    public CuentaCorriente(int num, double su){
        numero=num;
        sueldo=su;
    }
    
    public void RetirarCantidad(double ca){
        if((ca<sueldo)&&(ca>0)){
            sueldo-=ca;
        } 
    }
    
    public void AñadirCantidad(double ca){
        if(ca>0){
            sueldo+=ca;
        }
    }
    public void CambiarNumero(int num){
        numero=num;
    }
    public int VerNumero(){
        return numero;
    }
    public double VerSueldo(){
        return sueldo;
    }
    
    
}
