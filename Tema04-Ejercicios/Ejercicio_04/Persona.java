
package daw.persona;
import java.time.*;
import daw.persona.*;
public class Persona {
    private String nombre;
    private DNI dni;
    private double sueldo;
    private LocalDate FechaNacimiento;
    
    public Persona(String nom, DNI d, double su, LocalDate fn){
        nombre=nom;
        dni=d;
        sueldo=su;
        FechaNacimiento=fn;
    }
    public Persona(String nom, int num,char let, double su, LocalDate fn){
        nombre=nom;
        dni=new DNI(num,let);
        sueldo=su;
        FechaNacimiento=fn;
    }
    public Persona(String nom, DNI d){
        nombre=nom;
        dni=d;
        sueldo=900;
        
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
    public LocalDate VerFecha(){
        return FechaNacimiento;
    }
    public double VerSueldo(){
        return sueldo;
    }
    public String VerNombre(){
        return nombre;
    }
    
    
    
}
