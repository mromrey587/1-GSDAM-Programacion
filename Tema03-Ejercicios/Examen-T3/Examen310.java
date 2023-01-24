
package examen3.pkg10;

import java.util.*;
public class Examen310 {

    
    public static void main(String[] args) {
    int rd=0;
    int nc=0;
    String lm;
    String un;
    String us;
    int nm=3;
    boolean correcto=false;
    boolean usarmay=true;
    boolean usarnumeros=true;
    boolean usarsimbolos=true;
    ArrayList<String> contraseña=new ArrayList();
    
    ArrayList<String> nums=new ArrayList();
    String num[]={"1","2","3","4","5","6","7","8","9"};
    for(int x=0;x<=8;x++){
        nums.add(num[x]);
        }
        
    ArrayList<String> letras=new ArrayList();
    String let[]={"a","b","c","d","e","f","g","h","i","j","k","l","m","n",
        "o","p","q","r","s","t","u","v","x","y","z"};
    for(int y=0;y<(let.length);y++){
        letras.add(let[y]);}
    
    ArrayList<String> simbol=new ArrayList();
    String sim[]={",",".","?","+","-","&"};
    for(int y=0;y<(sim.length);y++){
        simbol.add(sim[y]);}
       
    
    while(!correcto){
        System.out.println("De cuantos digitos quiere que sea su contraseña???"
            + "(de 8 a 16)");
        
        nc=new Scanner (System.in).nextInt();
    
        if((nc<8)||(nc>16)){
            correcto=false;}
        else{
            correcto=true;}
    }
    
    System.out.println("Quieres que use letras mayusculas??(si/no)");
    lm=new Scanner (System.in).nextLine();
    lm=lm.toLowerCase();
    if(lm.equals("si")){
        System.out.println("vale");}
    else{
        
        usarmay=false;}
    
    System.out.println("Quieres que use numeros??(si/no)");
    un=new Scanner (System.in).nextLine();
    un=un.toLowerCase();
    if(un.equals("si")){
        System.out.println("vale");}
    else{
        
        usarnumeros=false;}
    
    System.out.println("Quieres que use simbolos??(si/no)");
    us=new Scanner (System.in).nextLine();
    if(us.equals("si")){
        System.out.println("vale");}
    else{
        usarsimbolos=false;}
    
    System.out.println("Cuantas contraseñas quieres");
    int ncon=new Scanner(System.in).nextInt();
    for(int v=0;v<ncon;v++){
    
    
    for(int z=0;z<=nc;){
        rd=(int) (Math.random() * ((nm)+1-0))+0;
        if(rd==1){
            rd=(int) (Math.random() * ((((2-1)+1)-1)+1-0))+0;
            if((rd==1)&&(usarmay==true)){
                rd=(int) (Math.random() * ((((2-1)+1)-1)+1-0))+0;
                contraseña.add(let[rd].toUpperCase());}
            else{
                rd=(int) (Math.random() * ((((2-1)+1)-1)+1-0))+0;
                contraseña.add(let[rd]);}
            
            z++;}
        else{
            if((rd==2)&&(usarnumeros==true)){
                rd=(int) (Math.random() * ((((nums.size()-1)+1)-1)+1-0))+0;
                contraseña.add(nums.get(rd));
                z++;}
            else{
                    if((rd==3)&&(usarsimbolos==true)){
                        rd=(int) (Math.random() * (((simbol.size()+1)-1)+1-0))+0;
                        contraseña.add(simbol.get(rd));
                        z++;}
                    else{}}}}
    
        System.out.println(contraseña);
        contraseña.clear();
    }
    }

}
