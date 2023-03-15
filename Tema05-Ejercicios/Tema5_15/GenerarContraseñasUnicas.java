
package Contraseñas;

import java.util.*;
public class GenerarContraseñasUnicas extends GeneradorContraseñas{
    private Set<String> contraseñasGeneradas;
    
    public GenerarContraseñasUnicas(){
        contraseñasGeneradas=new HashSet();
        this.numeroCaracteres=12;
    }
    
    public GenerarContraseñasUnicas(Random ran){
        super(ran);
        contraseñasGeneradas=new HashSet();
        this.numeroCaracteres=12;
    }
    
    @Override
    public String generarContraseña(int longitud){
        String nuevaContrasenia="";
        int repetida=0;
        
        while(repetida==0){
            repetida++;
            nuevaContrasenia=super.generarContraseña(longitud);
            
            for(String contrasenia : contraseñasGeneradas){
                
                if(contrasenia.equals(nuevaContrasenia)){
                    repetida--;
                }
            }
            
        }
        return nuevaContrasenia;
    }
    
    @Override
    public String generarContraseña(){
        String nuevaContrasenia="";
        int repetida=0;
        
        while(repetida==0){
            repetida++;
            nuevaContrasenia=super.generarContraseña();
            
            for(String contrasenia : contraseñasGeneradas){
                
                if(contrasenia.equals(nuevaContrasenia)){
                    repetida--;
                }
            }
            
        }
        return nuevaContrasenia;
    }
}
