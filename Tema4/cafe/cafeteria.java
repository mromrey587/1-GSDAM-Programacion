
package ejemplocafe;


public class cafeteria {
    private int capacidad_maxima;
    private int cantidad_actual;
    
    cafeteria(){
        capacidad_maxima=1000;
        cantidad_actual=0;
    };
    
    cafeteria(int cm){
        capacidad_maxima=cm;
        cantidad_actual=cm;};
        
    cafeteria(int ca, int cm){
        if(ca>cm){
            capacidad_maxima=cm;
            cantidad_actual=cm;}
        else{
            capacidad_maxima=cm;
            cantidad_actual=ca;}
    };
    
    public int GetCapacidadMax(){
        
        return capacidad_maxima;
    };
    
    public int GetCantidadAct(){
        
        return cantidad_actual;
    };
    
    public void SetCantidadAct(int ca){
        cantidad_actual=ca;
    };
    
    public void CambiarCapacidadMax(int cm){
        capacidad_maxima=cm;
    };
    
    public void LlenarCafetera(){
        cantidad_actual=capacidad_maxima;
    };
    
    public void ServirTaza(int st){
        if(st>cantidad_actual){
            cantidad_actual=0;}
        else{
        cantidad_actual=(cantidad_actual)-(st);}
    };
    
    public void VaciarTaza(){
        cantidad_actual=0;
    };
    
    public void AgregarCafe(int ac){    
        if((cantidad_actual+ac)>capacidad_maxima){
            cantidad_actual=capacidad_maxima;}
        else{
            cantidad_actual=cantidad_actual+ac;}};
}
