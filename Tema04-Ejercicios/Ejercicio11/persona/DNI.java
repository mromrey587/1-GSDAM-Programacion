
package daw.persona;


public class DNI {
    private int numero;
    private char letra;
    
    
    public DNI(int n,char l){
        numero=n;
        letra=l;
        
    };
    
    public DNI(String d){
        
        letra=d.charAt(8);
        numero=Integer.parseInt(d.substring(0, 8));
        };
    public int GetNumero(){
        return numero;
    }
    public char GetLetter(){
        return letra;
    }
    public String verDni(){
        String dninum=Integer.toString(numero);
        String dnilet=String.valueOf(letra);
        String dni1=dninum+""+dnilet;
        return dni1;
    }
    
    public void CambiarLetra(char l){
        letra=l;
    }
    public void CambiarNumero(int n){
        numero=n;
    }
}
