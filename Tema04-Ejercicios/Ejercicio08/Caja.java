
package almacen;


public class Caja {
    private boolean abierto;
    private String mensaje;
    private String sorry="La caja esta cerrada";
    
    public Caja(String men){
        mensaje=men;
        abierto=false;
    };
    
    public Caja(){
        mensaje="Viva el tema 7";
        abierto=false;};
    
    
    public Caja(String men, boolean ab){
        abierto=ab;
        mensaje=men;
    };
    
    public void abrirCaja(){
        abierto=true;
    };
    
    public void cerrarCaja(){
        abierto=false;
    };
    
    public String LeerMensaje(){
        if(abierto==true){
            return mensaje;}
        else{
            return sorry; }
    };
    
    public void PasarMayusculas(){
        mensaje=mensaje.toUpperCase();
    }
    
    public void setMensaje(String men){
        mensaje=men;
    };

}
