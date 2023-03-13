
package tr.Trabajadores;


public class Administrativo extends TrabajadorTecleante{
    /**
     * Constructor de la clase TrabajadorTecleante
     * @param nom= nombre
     * @param su= sueldo
     * @param nDNI= El numero del DNI
     * @param lDNI= La letra del DNI
     * @param ppm = PulsacionesMinuto
     */
    public Administrativo(String nom, int su, int nDNI, char lDNI,int ppm){
    
        super(nom,su,nDNI,lDNI,ppm);
    }
    /**
     * Escribe por TecladoJava el informe que le hemos pasaod
     * @param t 
     */
    public void escribirInforme(String t){
        TecladoJava m=new TecladoJava();
        m.escribirTexto(t);
        
    }
}
