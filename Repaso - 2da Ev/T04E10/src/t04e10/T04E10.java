/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t04e10;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T04E10 {

    /**
     * @param args the command line arguments
     */
    public static int pedirN(){
        Scanner entrada = new Scanner(System.in);
        int n; 
        n = entrada.nextInt(); 
        return n;
    }
    
    public static void mostrarTabla (int n){
        
        for (int i = 0; i <= 10; i++){
            System.out.println(n + " x " + i + " = " + (n*i));
        }
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        mostrarTabla( pedirN());
        
        
    }
    
}
