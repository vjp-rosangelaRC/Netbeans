/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t03e16;

/**
 *
 * @author Ross
 */
public class T03E16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 20, contador=0; 
        
        while (n <= 160){
            if (n%2 == 1){
                System.out.println(n);
                contador++;
            }
            n++; 
            
        }
        System.out.println("Los números impares "+ contador);
    }
    
}
