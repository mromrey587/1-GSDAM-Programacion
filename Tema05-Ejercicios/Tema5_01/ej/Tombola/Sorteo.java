
package ej.Tombola;


public class Sorteo {
    private double dineroCupon;
    private int pagosRealizados;
    private int pagosPendientes;
    private int totalParticipantes;
    private double dineroRecogido;
    
    /**
     * Este es el constructor a traves del cual se crea la clase 
     * con las propiedades dineroCupon y totalParticipantes
     * @param dinCupon
     * @param totPersonas
     */
    public Sorteo(double dinCupon, int totPersonas){
        
        this.dineroCupon=dinCupon;
        this.totalParticipantes=totPersonas;
        this.pagosRealizados=0;
        this.pagosPendientes=this.totalParticipantes;
        this.dineroRecogido=0;
    }
    /**
     * Con este metodo se registra a una persona como que ya ha pagado su cupon
     * por lo tanto sube el dinero recogido y bajan los pagosPendientes
     */
    public void registrarPago(){
        this.pagosRealizados++;
        this.dineroRecogido=this.pagosRealizados*this.dineroCupon;
        this.pagosPendientes--;
    }
    /**
     * Con este metodo se añade un nuevo Participante al sorteo por lo tanto, 
     * faltaria una perosna mas por pagar
     */
    public void apuntarNuevoParticipante(){
        this.totalParticipantes++;
        this.pagosPendientes++;
    }
    /**
     * Estoy sobreescribiendo es metodo toString para que me devuelva todas
     * las propiedades de la clase Sorteo
     */
    @Override
    public String toString() {
        return "Sorteo{" + "dineroCupon=" + dineroCupon + ", pagosRealizados=" + pagosRealizados + ", pagosPendientes=" + pagosPendientes + ", totalParticipantes=" + totalParticipantes + ", dineroRecogido=" + dineroRecogido + '}';
    }
    
    
}
