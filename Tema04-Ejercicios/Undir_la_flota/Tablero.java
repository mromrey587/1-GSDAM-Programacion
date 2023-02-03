
package Juego;

import java.awt.*;
import Juego.*;
import java.util.*;

public class Tablero {
    private int ejeX;
    private int ejeY;
    private int tablero0[][];
    private char tableroVacio[][];
    private String fin="\n Se acabo el proceso";
    private Barco ba;
    private int nBarcos=0;
    private int randomX;
    private int randomY;
    private int CoordenadaComodin;
    private int randomComun;
    private boolean tocado;
    private boolean Exito=false;
    
    
    //Crear el tablero en si
    public Tablero(int x,int y){
        ejeX=x;
        ejeY=y;
        tablero0=new int[x][y];
        tableroVacio=new char[x][y];
        
        for(int z=0;z<x;z++){
            for(int u=0;u<y;u++){
                tablero0[z][u]=0;
            }
        }
        for(int z=0;z<ejeX;z++){
            for(int u=0;u<ejeY;u++){
                tableroVacio[z][u]='*';
            }
        }
        
    }
    //Te dice el valor de la posicon que le digas  del tablero
    public int getValorEnPosiciones(int x, int y){
        
        return tablero0[x][y]; 
    }
    //prueba
    public void IntroduceBarco(Barco c){
        ba=c;
        Exito=false;
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //Se añade un barco
    public void addBarco(){
        while(Exito==false){
            randomX=(int)(0+((ejeX-1)-0)*Math.random());
            randomY=(int)(0+((ejeY-1)-0)*Math.random());
            
            randomComun=(int)(1+(2-0)*Math.random());
            
            /**
             * Aqui seria izquierda o derecha
             */
            
            if(randomComun==1){
                randomComun=(int)(1+(2-0)*Math.random());
                CoordenadaComodin=randomX;
                //Para la derecha
                if(randomComun==1){
                    for(int x=0;x<ba.getvalor();x++){

                        if((randomX<=(ejeX-1))&&(tablero0[randomX][randomY]==0)){
                            tablero0[randomX][randomY]=ba.getvalor();
                            randomX++;
                        }
                        else{
                            if(((CoordenadaComodin-1)>=0)&&(tablero0[CoordenadaComodin-1][randomY]==0)){
                                CoordenadaComodin--;
                                tablero0[CoordenadaComodin][randomY]=ba.getvalor();
                            }
                            else{
                                continue;
                            } 
                        }   
                        Exito=true;
                    }
                }
                //Se va para la izquierda
                else{
                    for(int x=0;x<ba.getvalor();x++){

                        if((randomX>=(ejeX-1))&&(tablero0[randomX][randomY]==0)){
                            tablero0[randomX][randomY]=ba.getvalor();
                            randomX--;
                        }
                        else{
                            if(((CoordenadaComodin+1)<=0)&&(tablero0[CoordenadaComodin+1][randomY]==0)){
                                CoordenadaComodin++;
                                tablero0[CoordenadaComodin][randomY]=ba.getvalor();
                            }
                            else{
                                continue;
                            } 
                        }
                        Exito=true;
                    }
                }
                
            }
            /**
             * Aqui seria arriba o abajo
             */
            else{
                randomComun=(int)(1+(2-0)*Math.random());
                CoordenadaComodin=randomY;
                //Para abajo
                if(randomComun==1){
                    for(int x=0;x<ba.getvalor();){
                        
                        if((randomY<=(ejeY-1))&&(tablero0[randomX][randomY]==0)){
                            tablero0[randomX][randomY]=ba.getvalor();
                            randomY++;
                            x++;
                        }
                        else{
                            if(((CoordenadaComodin-1)>=0)&&(tablero0[randomX][CoordenadaComodin-1]==0)){
                                CoordenadaComodin--;
                                tablero0[randomX][CoordenadaComodin]=ba.getvalor();
                                x++;
                            }
                            else{
                                continue;
                            } 
                        }
                        Exito=true;    
                    }
                }
                //Se va para arriba
                else{
                    for(int x=0;x<ba.getvalor();x++){

                        if((randomY>=(ejeY-1))&&(tablero0[randomX][randomY]==0)){
                            tablero0[randomX][randomY]=ba.getvalor();
                            randomY--;
                        }
                        else{
                            if(((CoordenadaComodin+1)<=0)&&(tablero0[randomX][CoordenadaComodin+1]==0)){
                                CoordenadaComodin++;
                                tablero0[randomX][CoordenadaComodin]=ba.getvalor();
                            }
                            else{
                                continue;
                            } 
                        }
                        Exito=true;
                    }
                }   
            }
        
        }
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    //Te muestra el mapa de los barcos(No lo deberias ver)
    public String WallHack(){
        for(int z=0;z<ejeX;z++){
            System.out.println("");
            for(int u=0;u<ejeY;u++){
                System.out.print(tablero0[z][u]);
            }
        }
        return fin;
    }
    //Mira si queda espacio(Esta en desarrollo)
    
    
    //Ve si le ha dado a algo
    public boolean hit(Bomba di){
        if(tablero0[di.getPY()][di.getPX()]!=0){
            tocado=true;
            if(tablero0[di.getPY()][di.getPX()]==2){
                tableroVacio[di.getPY()][di.getPX()]='2';
                
            }
            if(tablero0[di.getPY()][di.getPX()]==3){
                tableroVacio[di.getPY()][di.getPX()]='3';
                
            }
            if(tablero0[di.getPY()][di.getPX()]==4){
                tableroVacio[di.getPY()][di.getPX()]='4';
                
            }
            if(tablero0[di.getPY()][di.getPX()]==5){
                tableroVacio[di.getPY()][di.getPX()]='5';
                
            }
            tablero0[di.getPY()][di.getPX()]=0;
            return tocado;
            
        }
        else{
            tocado=false;
            tableroVacio[di.getPY()][di.getPX()]='0';
            return tocado;
        }
    }
    
    //Saber cuantos barcos quedan
    public int BarcosRestantes(){
        return nBarcos;
    }
    
    //Ver Historial
    public String MostrarHistorial(){
        for(int z=0;z<ejeX;z++){
            System.out.println("");
            for(int u=0;u<ejeY;u++){
                System.out.print(tableroVacio[z][u]);
            }
        }
        return fin;
    }
    
    
    
}
