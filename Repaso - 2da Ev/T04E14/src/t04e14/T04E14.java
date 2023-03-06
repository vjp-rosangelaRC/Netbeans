/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t04e14;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T04E14 {

    /**
     * @param args the command line arguments
     */
    public static int pedirN(){
        Scanner entrada = new Scanner(System.in);
        int n; 
        n = entrada.nextInt();
        return n;
    }
    
    public static boolean mayorqueCero (int n){
        boolean noCero;
        if (n > 0){
            noCero = true;
        }
        else {
            noCero = false;
        }
        return noCero;
    }
    
    public static void resultado (int n){
        for (int i = 0; i < n; i++){
            if (i%3 == 0){
                System.out.println(i);               
            }
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int n; 
        boolean noCero;
        
         do{
             System.out.println("N");
             n = pedirN(); 
             noCero = mayorqueCero(n);
         }while (noCero == false);
         
         resultado(n);
        
        
    }
    
}
