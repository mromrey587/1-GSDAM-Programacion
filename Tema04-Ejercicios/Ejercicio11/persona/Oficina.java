
package daw.persona;
import java.util.*;
import java.time.*;
import daw.persona.*;
public class Oficina {
    private String nombre;
    private ArrayList<Persona> personas=new ArrayList();
    
    public Oficina(String nom){
    nombre=nom;
    }
    
    public Oficina(String nom, int num){
    nombre=nom;
    if(num==0||num>3){
        
    }
    else{
        switch(num){
            case 1:{
                LocalDate fe=LocalDate.of(2000,2,28);
                DNI d=new DNI(111111,'l');
                Persona p1=new Persona("Antonio Perez",d,900,fe);
                personas.add(p1);
            break;
            }
            case 2:{
                LocalDate fe=LocalDate.of(2000,2,28);
                DNI d=new DNI(111111,'l');
                Persona p1=new Persona("Antonio Perez",d,900,fe);
                personas.add(p1);
                
                fe=LocalDate.of(1995, 9, 10);
                d.CambiarNumero(22222222);
                d.CambiarLetra('J');
                Persona p2=new Persona("Luis Lopez",d,1000,fe);
                personas.add(p2);
                break;
            }
            
            case 3:{
                LocalDate fe=LocalDate.of(2000,2,28);
                DNI d=new DNI(111111,'l');
                Persona p1=new Persona("Antonio Perez",d,900,fe);
                personas.add(p1);
                
                fe=LocalDate.of(1995, 9, 10);
                d.CambiarNumero(22222222);
                d.CambiarLetra('J');
                Persona p2=new Persona("Luis Lopez",d,1000,fe);
                personas.add(p2);
                    
                fe=LocalDate.of(1985, 5, 21);
                d.CambiarNumero(33333333);
                d.CambiarLetra('P');
                Persona p3=new Persona("Ana Diaz",d,1200,fe);
                personas.add(p3);
                break;
            }
            default:{
                break;
            }
        }
    }
    
    }
    public Oficina(){
        nombre="Oficinas DAW";
        LocalDate fe=LocalDate.of(2000,2,28);
        DNI d=new DNI(111111,'l');
        Persona p1=new Persona("Antonio Perez",d,900,fe);
        personas.add(p1);

        fe=LocalDate.of(1995, 9, 10);
        d.CambiarNumero(22222222);
        d.CambiarLetra('J');
        Persona p2=new Persona("Luis Lopez",d,1000,fe);
        personas.add(p2);

        fe=LocalDate.of(1985, 5, 21);
        d.CambiarNumero(33333333);
        d.CambiarLetra('P');
        Persona p3=new Persona("Ana Diaz",d,1200,fe);
        personas.add(p3);
    }

    public String getNombre(int npersona){
        Persona p=personas.get(npersona);
        return p.VerNombre();
        
    }
    public String getFecha(int npersona){
        Persona p=personas.get(npersona);
        return p.VerFecha();
        
    }
    
    public String getDNI(int npersona){
        Persona p=personas.get(npersona);
        return p.VerDNI();
        
    }
    public Double getSueldo(int npersona){
        Persona p=personas.get(npersona);
        return p.VerSueldo();
        
    }
    
    public void VerPersona(int npersona){
        System.out.println(this.getDNI(npersona-1));
        System.out.println(this.getNombre(npersona-1));
        System.out.println(this.getFecha(npersona-1));
        System.out.println(this.getSueldo(npersona-1));
    }
    
    public void AñadirPersona(Persona p){
        personas.add(p);
    }
    
    public void AñadirPersona(String nom,DNI d, double sueldo,LocalDate fecha){
        Persona p=new Persona(nom,d,sueldo,fecha);
        personas.add(p);
    
    }
    
    
    
}
