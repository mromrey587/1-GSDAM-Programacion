 
package tema2eje08;

import bpc.daw.objetos.*;
public class Tema2eje08 {

    public static void main(String[] args) {
    DepositoAgua m=new DepositoAgua(15,20);
    DepositoAgua n=new DepositoAgua(5,20);
    m.dibujar();
        System.out.println("");
    n.dibujar();
    
    m.añadirLitro();{}
    m.añadirLitro();{}
    m.añadirLitro();{}
    m.añadirLitro();{}
    m.añadirLitro();{}
    
    n.retirarLitro();
    n.retirarLitro();
    n.retirarLitro();
    n.retirarLitro();
    n.retirarLitro();
    
    m.dibujar();
        System.out.println("");
    n.dibujar();
    
    }
    
}
