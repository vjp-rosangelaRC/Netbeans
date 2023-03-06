/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t03e28;

/**
 *
 * @author Ross
 */
public class T03E28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n; 
        n = (int) Math.floor(Math.random()*100) +1;
        System.out.println("El aleatorio es " + n);
        
        if (n % 2 == 0 ){
            System.out.println("Es par");
        }
        else{
            System.out.println("Es impar");
        }
    }
    
}
