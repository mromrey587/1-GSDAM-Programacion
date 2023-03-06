
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
    public Rascacielos(String d, int np,int a){
        super(d,np);
        if(a>0){
            this.altura=a;
        }
        else{
            IllegalArgumentException e= new IllegalArgumentException
        ("La altura no puede ser negativa");
            throw e;
        }
    }

    public int getAltura() {
        return altura;
    }
    
}
