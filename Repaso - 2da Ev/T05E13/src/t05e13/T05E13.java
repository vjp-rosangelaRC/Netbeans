/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t05e13;

/**
 *
 * @author Ross
 */
public class T05E13 {

    /**
     * @param args the command line arguments
     */
    public static void mostrarSal (Saludo sal){
        for (int i = 0; i < 5; i++){
            System.out.println(sal.getFrase());
        }
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Saludo sal = new Saludo(); 
        
        mostrarSal(sal);
    }
    
}
