
package Contraseñas;
import java.util.*;

public class GeneradorContraseñas {
    private Random random;
    
    public GeneradorContraseñas(){
        this.random= new Random();
    }
    
    public GeneradorContraseñas(Random r){
        this.random=r;
    }
    /**
     * 
     * @param longitud de la contraseña
     * @return una contraseña(String) de la longitud indicada
     */
    public String generarContraseña(int longitud){
        StringBuilder contraseña=new StringBuilder();
        char let;
        
        for(int x=0;x<longitud;x++){
            //Este metodo coge un numero del 0 al 2 aleatoriamente
            switch (this.getFamiliaCaracteres()){
                    
                    case 0:
                        //Ese metodo coge un numero al azar
                        let=(char) this.getNumero();
                        contraseña.append(let);
                        break;
                        
                    case 1:
                        //Ese metodo se usa para coger una letra mayuscula
                        let=(char) this.getLetraMayuscula();
                        contraseña.append(let);
                        break;
                        
                    case 2:
                        //Ese metodo es para coger una letra minuscula
                        let=(char) this.getLetraMinuscula();
                        contraseña.append(let);
                        break;
                        
                    default:
                        break;
            }
        }
        return contraseña.toString();
    }
    /**
     * 
     * @return una contraseña(String) de 8 caracteres 
     */
    public String generarContraseña(){
        StringBuilder contraseña=new StringBuilder();
        char let;
        
        for(int x=0;x<8;x++){
            //Este metodo coge un numero del 0 al 2 aleatoriamente
            switch (this.getFamiliaCaracteres()){
                    
                    case 0:
                        //Ese metodo coge un numero al azar
                        let=(char) this.getNumero();
                        contraseña.append(let);
                        break;
                        
                    case 1:
                        //Ese metodo se usa para coger una letra mayuscula
                        let=(char) this.getLetraMayuscula();
                        contraseña.append(let);
                        break;
                        
                    case 2:
                        //Ese metodo es para coger una letra minuscula
                        let=(char) this.getLetraMinuscula();
                        contraseña.append(let);
                        break;
                        
                    default:
                        break;
            }
        }
        return contraseña.toString();
    }
    /**
     * A traves de este numero se elige la familia de caracteres
     * <ul>
     * <li>Si es 0 se genera un número</li>
     * <li>Si es 1 se genera una letra mayuscula</li>
     * <li>Si es 2 se genera una letra minuscula</li>
     * </ul>
     * @return un numero entero del 0 al 2
     */
    private int getFamiliaCaracteres(){
        return (int) (Math.random()*(2-0+1)+0);
    }
    /**
     * 
     * @return una letra minuscula del abecedario español aleatoria
     */
    private int getLetraMinuscula(){
        return (int) (Math.random()*(122-97+1)+97);
    }
    /**
     * 
     * @return una letra mayuscula del abecedario español aleatoria
     */
    private int getLetraMayuscula(){
        return (int) (Math.random()*(90-65+1)+65);
    }
    /**
     * 
     * @return un numero(int) random
     */
    private int getNumero(){
        return (int) (Math.random()*(57-48+1)+48);
    }
}
