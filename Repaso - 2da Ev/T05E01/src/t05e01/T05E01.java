/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t05e01;

/**
 *
 * @author Ross
 */
public class T05E01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Coche miCoche = new Coche('x', 'm', 'a', 10);
        Coche cochePadre = new Coche('j', 'x', 'b', 5);
        
        miCoche.arrancarCoche();
        cochePadre.arrancarCoche();
        
        miCoche.acelerarCoche();
        miCoche.acelerarCoche();
        miCoche.acelerarCoche();
        miCoche.acelerarCoche();
        miCoche.acelerarCoche();
        
        miCoche.frenarCoche();
        miCoche.frenarCoche();
        
        cochePadre.acelerarCoche();
        cochePadre.acelerarCoche();
        cochePadre.acelerarCoche();
        
        cochePadre.apagarCoche();
        
        System.out.println(cochePadre.toString());
        System.out.println(miCoche.toString());
        
        
    }
    
}
