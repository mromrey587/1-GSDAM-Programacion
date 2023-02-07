
package daw.persona;
import java.time.*;
import daw.persona.*;
public class Persona {
    private String nombre;
    private DNI dni;
    private double sueldo;
    private LocalDate FechaNacimiento;
    private CuentaCorriente cuenta;
    
    public Persona(String nom, DNI d, double su, LocalDate fn){
        nombre=nom;
        dni=d;
        sueldo=su;
        FechaNacimiento=fn;
        cuenta=new CuentaCorriente();
    }
  
    public Persona(String nom, int num,char let, double su, LocalDate fn){
        nombre=nom;
        dni=new DNI(num,let);
        sueldo=su;
        FechaNacimiento=fn;
        cuenta=new CuentaCorriente();
    }
    public Persona(String nom, DNI d){
        nombre=nom;
        dni=d;
        sueldo=900;
        cuenta=new CuentaCorriente();
        
        LocalDate hoy=LocalDate.now();
        Month mo=hoy.getMonth();
        int di=hoy.getDayOfMonth();
        int ye=hoy.getYear();
        
        FechaNacimiento=LocalDate.of(ye-20, mo, di);
    }
    public Persona(String nom, int num,char let){
        nombre=nom;
        dni=new DNI(num,let);
        sueldo=900;
        cuenta=new CuentaCorriente();
        
        LocalDate hoy=LocalDate.now();
        Month mo=hoy.getMonth();
        int di=hoy.getDayOfMonth();
        int ye=hoy.getYear();
        
        FechaNacimiento=LocalDate.of(ye-20, mo, di);
    }
    
    public void cambiarNombre(String nom){
        nombre=nom;
    }
    
    public void cambiarSueldo(int su){
        sueldo=su;
    }
    
    public String VerFecha(){
        return FechaNacimiento.toString();
    }
    
    public String VerDNI(){
        return dni.verDni();
    }
    
    public double VerSueldo(){
        return sueldo;
    }
    
    public String VerNombre(){
        return nombre;
    }
    
    public void aumentarSueldo(int porcentaje){
        double a=(sueldo*porcentaje)/100;
        sueldo+=a;    
    }
    
    public void cobrarSueldo(){
        cuenta.AñadirCantidad(sueldo);
        sueldo=0;
    }
    
    public double  verStracto(){
        return cuenta.VerSueldo();
    }
    
}
