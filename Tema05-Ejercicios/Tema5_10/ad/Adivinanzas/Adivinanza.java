
package ad.Adivinanzas;
import java.util.*;
import java.time.*;
public class Adivinanza{
    private String enunciado;
    private String respuestaCorrecta;
    private Instant inicio;
    private final double tMax=30.0;

    public Adivinanza(String enun,String recor){
        this.enunciado=enun;
        this.respuestaCorrecta=recor;
        this.inicio=Instant.now();
    }
    
    public String getEnunciado;
    public void comprobar(String respuesta)throws AdivinanzaException{
       Instant Final=Instant.now();
       double tienmedio=Duration.between(Final, inicio).toSeconds();
       
       if(tienmedio>tMax){
           TiempoSuperadoException e=new TiempoSuperadoException();
           throw e;
       }
       else{
           if(respuesta.equals(this.respuestaCorrecta)){
                System.out.println("Enhorabuena esa es la respuesta");
           }
           
           else{
               AdivinanzaIncorrectaException e=new AdivinanzaIncorrectaException();
               throw e;
           }
       }
       
    }
}
