
package co.Constructora;


public class Rascacielos extends Edificio{
    private int altura;
    /**
     * A traves de la clase padre Edificio creo esta clase Rascacielos
     * usando super para poner sus propiedades directamente en este rascacielos
     * @param d
     * @param np
     * @param a 
     */
    public Rascacielos(String d, int np){
        super(d,np);
            altura=this.setAltura(np);
        
            
    }

    public int getAltura() {
        return altura;
    }
    
    private int setAltura(int np){
        return 10*np;
    }
    
}
