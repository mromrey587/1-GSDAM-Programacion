package tema3eje11;

import java.util.*;
import java.io.*;

public class Tema3eje11 {

    public static void main(String[] args) {
        int m = 5;
        String dni="";
        String prudni;
        String nom;
        String dir;
        String tel;
        try {
            while (m != 3) {
                //Menu
                System.out.println("1.  Añadir nuevo alumno ");
                System.out.println("2.  Ver los datos de un alumno ");
                System.out.println("3.  Salir");
                m = new Scanner(System.in).nextInt();
                FileReader bu=new FileReader("Poner el dni.txt");
                PrintWriter b = new PrintWriter("Poner el dni.txt");
                BufferedReader buf=new BufferedReader(bu);
                
                switch(m){
                        //Añadir Alumno
                        case 1:
                            System.out.println("Introduce el dni:");
                            dni=new Scanner(System.in).nextLine();

                            System.out.println("Introduce el nombre:");
                            nom=new Scanner(System.in).nextLine();

                            System.out.println("Introduce la dirección:");
                            dir=new Scanner(System.in).nextLine();

                            System.out.println("Introduce el telefono:");
                            tel=new Scanner(System.in).nextLine();
                            //Clase PrintWriter  
                            b.println(tel);
                            b.println(nom);
                            b.println(dir);
                            b.close();
                            break;
                        //Ver alumno    
                        case 2:
                            System.out.println("Introduce el dni:");
                            prudni=new Scanner(System.in).nextLine();
                            
                            if(prudni.equals(dni)){
                                System.out.println( buf.readLine());}
                            else{
                                System.out.println("Ese no corresponde a "
                                        + "ningún alumno");}
                            break;
                        //Salir switch case
                        default:
                            break;}
                    
                
            }}catch (Exception e) { 
            System.out.println(e.getMessage());
        }
    }
}
