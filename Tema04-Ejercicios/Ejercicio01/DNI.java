
package Tema4_01;


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
        return numero;};
    public char GetLetter(){
        return letra;};
}
