
package examen3.pkg05;


public class Examen305 {

    
    public static void main(String[] args) {
    int rd=0;
    boolean fin=false;
    
    while(!fin){
        
        rd=(int) (Math.random() * ((11-1)+1-0))+0;
        System.out.println(rd);
        
        if(rd==10){
            fin=true;
        }
    }System.out.println("Se acabo el programa");
        
    }

}
