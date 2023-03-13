
package tr.Trabajadores;
import java.util.*;

public class Programador extends TrabajadorTecleante{
    private Map<String,String> lenguajes; 
    
    /**
     * Constructor de la clase TrabajadorTecleante
     * @param nom= nombre
     * @param su= sueldo
     * @param nDNI= El numero del DNI
     * @param lDNI= La letra del DNI
     * @param ppm = PulsacionesMinuto
     */
    public Programador(String nom, int su, int nDNI, char lDNI,int ppm){
    
        super(nom,su,nDNI,lDNI,ppm);
        lenguajes=new HashMap<String,String>();
    }
    /**
     * Se recoge un lenguaje y el Hola Mundo en dicho lenguaje
     * @param lenguaje
     * @param holaMundo 
     */
    public void aprenderLenguaje(String lenguaje,String holaMundo){
        this.lenguajes.put(lenguaje, holaMundo);
    }
    /**
     * Si tenemos el lenguaje guardado se lanzara el hoola mundo en dicho 
     * lenguaje si no se lanza una excepción
     * @param lenguaje
     * @return 
     */
    public String programarHolaMundo(String lenguaje){
        TecladoJava t=new TecladoJava();
        if (lenguajes.containsKey(lenguaje)){
            return lenguajes.get(lenguaje);
        }
        else{
            IllegalStateException e=new IllegalStateException
        ("Ese lenguaje no esta en nuestra BD");
            throw e;
        }
    }
}
