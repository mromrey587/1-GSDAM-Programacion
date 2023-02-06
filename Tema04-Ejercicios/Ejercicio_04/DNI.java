
package daw.persona;


public class DNI {
    private int numero;
    private char letra;
    
    public DNI(int n,char l){
        numero=n;
        letra=l;
    };
    
    public DNI(String dni){
        letra=dni.charAt(8);
        numero=Integer.parseInt(dni.substring(0, 8));
        };
    public int GetNumero(){
        return numero;
    }
    public char GetLetter(){
        return letra;
    }
    
    public void CambiarLetra(char l){
        letra=l;
    }
    public void CambiarNumero(int n){
        numero=n;
    }
}
