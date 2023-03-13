
package tr.Trabajadores;


public class TrabajadorTecleante extends Trabajador{
    private int pulsacionesMinuto;
    protected Teclado teclado;
    /**
     * Constructor de la clase TrabajadorTecleante
     * @param nom= nombre
     * @param su= sueldo
     * @param nDNI= El numero del DNI
     * @param lDNI= La letra del DNI
     * @param ppm = PulsacionesMinuto
     */
    public TrabajadorTecleante(String nom, int su, int nDNI, char lDNI,int ppm){
    
        super(nom,su,nDNI,lDNI);
        this.pulsacionesMinuto=ppm;
    }
    /**
     * Cambia el teclado que teniamos
     * @param t= un teclado 
     */
    void setTeclado(Teclado t){
        this.teclado=t;
    }
    /**
     * 
     * @return  el teclado que tenemos en la clase
     */
    public Teclado getTeclado() {
        return teclado;
    }
    /**
     * 
     * @return las PulsacionesMinuto del trabajador 
     */
    public int getPulsacionesMinuto() {
        return pulsacionesMinuto;
    }
}
