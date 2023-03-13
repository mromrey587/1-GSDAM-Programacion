
package tr.Trabajadores;


public class Trabajador {
    private String dni;
    private String nombre;
    protected int sueldo;
    /**
     * Constructor de la clase Trabajador
     * @param nom=nombre
     * @param suel=sueldo
     * @param numDNI=numero del DNI
     * @param letDNI = letra del DNI
     */
    public Trabajador(String nom, int suel, int numDNI, char letDNI){
        this.dni=String.valueOf(numDNI)+String.valueOf(letDNI);
        this.nombre=nom;
        this.sueldo=suel;
    }
    /**
     * 
     * @return el DNI entero 
     */
    public String getDni() {
        return dni;
    }
    /**
     * 
     * @return el mobre del trabajador
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * 
     * @return el sueldo del trabajador
     */
    public int getSueldo() {
        return sueldo;
    }
    /**
     * Sobreescribe el metodo .toString
     * @return 
     */
    @Override
    public String toString() {
        return "Trabajador{" + "dni=" + dni + ", nombre=" + nombre + 
               ", sueldo=" + sueldo + '}';
    }
    
    
}
