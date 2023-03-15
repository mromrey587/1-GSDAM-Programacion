
package Eq.EquipoDeFutbol;

import java.util.*;
public class EquipoFutbol {
    private String nombre;
    private List<Empleado> empleados;
    private double presupuesto;
    
    public EquipoFutbol(String nom,double pres){
        this.nombre=nom;
        this.presupuesto=pres;
        empleados=new ArrayList();
    }
    //Devuelve el nombre y el rol de los empleados
    public String getEmpleados() {
        for(Empleado empleado: this.empleados){
            if(empleado instanceof Entrenador){
                System.out.println("Entrenador: "+ empleado.getNombre());
            }
            else{
                if(empleado instanceof Futbolista){
                    System.out.println("Futbolista: "+empleado.getNombre());
                }
            }
        }
        return "";
    }

    public double getPresupuesto() {
        return presupuesto;
    }
    //Se añade un empleado si se puede, si no se lanza una 
    //IllegalArgumentException
    public void addEmpleado(Empleado e){
        int nemp=0;
        /**
         * Se comprueba si el jugador es un Entrenador ya que si lo es hay 
         * una restricción que dice que no puede haber mas de 1 Entrenador
         * en la plantilla
         */
        if(e instanceof Entrenador){
            for(Empleado empleado : this.empleados){
                
                if(empleado instanceof Entrenador){
                    nemp++;
                }
            }
            
            if(nemp>=1){
                IllegalArgumentException exc=new IllegalArgumentException
                    ("Este equipo ya tiene un Entrenador");
            }
            else{
                empleados.add(e);
            }
        }
        else{
            /**
             * Se comprueba si el jugador es un futbolista ya que si lo es hay 
             * una restricción que dice que no puede haber mas de 25 juagdores 
             * en la plantilla
             */
            if(e instanceof Futbolista){
                for(Empleado empleado : this.empleados){
                
                    if(empleado instanceof Futbolista){
                    nemp++;
                    }
                }
                if(nemp>=25){
                IllegalArgumentException exc=new IllegalArgumentException
                    ("Este equipo ya tiene 25 jugadores");
                }
                else{
                    empleados.add(e);
                }
            }
            /*Se añade el empleado raso ya que aqui no hay restricciones ya
            */
            else{
                empleados.add(e);
            }
        }
    } 
    /**
     * En este metodo se pagan a todos los empleados pero hay una serie de 
     * pautas que hay que seguir:
     * <ul>
            <li>En este metodo primero se separan los empleados primables
                y los no primables ya que si el trabajador es primables
                lo que tiene que cobrar es su sueldo mas un 10% por 
                la prima
            </li>
            <li>
                Despues se comprueba que a ese jugador se le peuede pagar 
                el sueldo establecido 
            </li>
            <li>
                Si no se le puede pagar el sueldo el jugador cobrara el 
                presupuesto entre las personas que quedan por pagar y 
                como eso es menor que su sueldo se lanzará la 
                CabreoException
            </li>
        </ul>
     */
    public void pagarEmpleados(){
        
        int empPagados=0;
        
        for(Empleado empleado: this.empleados){
            if(empleado instanceof EmpleadoPrimable){
                if(this.getSueldoPrima(empleado)<=this.presupuesto){
                    this.presupuesto=-this.getSueldoPrima(empleado);
                    try{
                        empleado.cobrar(this.getSueldoPrima(empleado));
                    }
                    catch(Exception e){
                        System.out.println(e.getMessage());
                    }
                    empPagados++;
                }
                else{
                    this.presupuesto=-this.presupuesto/
                            (this.empleados.size()-empPagados);
                    try{
                        empleado.cobrar(this.presupuesto/
                            (this.empleados.size()-empPagados));
                    }
                    catch(Exception e){
                        System.out.println(e.getMessage());
                    }
                }
            }
            
            
            else{
                if(empleado.getSueldo()<=this.presupuesto){
                     presupuesto=-empleado.getSueldo();
                     try{
                         empleado.cobrar(empleado.getSueldo());
                     }
                     catch(Exception e){
                         System.out.println(e.getMessage());
                     }
                    empPagados++;
                }
                else{
                    this.presupuesto=-this.presupuesto/
                            (this.empleados.size()-empPagados);
                    try{
                        empleado.cobrar(this.presupuesto/
                            (this.empleados.size()-empPagados));
                    }
                    catch(Exception e){
                        System.out.println(e.getMessage());
                    }
                }
            }
        }
    }
    private double getSueldoPrima(Empleado e){
        return e.getSueldo()+(e.getSueldo()*0.1);
    }
}
