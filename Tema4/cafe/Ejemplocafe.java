
package ejemplocafe;


public class Ejemplocafe {


    public static void main(String[] args) {
    cafeteria a=new cafeteria(10,100);
    cafeteria b=new cafeteria();
    cafeteria c=new cafeteria(500);
    
    System.out.println(a.GetCantidadAct()+" "+a.GetCapacidadMax());
    System.out.println(b.GetCantidadAct()+" "+b.GetCapacidadMax());
    System.out.println(c.GetCantidadAct()+" "+c.GetCapacidadMax());
    
    a.SetCantidadAct(50);
        System.out.println(a.GetCantidadAct());
        
    a.CambiarCapacidadMax(522);
        System.out.println(a.GetCapacidadMax());
        
    a.LlenarCafetera();
    
        System.out.println(a.GetCantidadAct());
        
    a.ServirTaza(600);
    
        System.out.println(a.GetCantidadAct());
        
    c.VaciarTaza();
        System.out.println(c.GetCantidadAct());
        
    a.AgregarCafe(1000);
    
        System.out.println(a.GetCantidadAct());
    
    
    }

}
