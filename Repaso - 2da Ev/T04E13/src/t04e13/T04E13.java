/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t04e13;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T04E13 {

    /**
     * @param args the command line arguments
     */
    public static int pedirN (){
        Scanner entrada = new Scanner(System.in);
        int n;
        n = entrada.nextInt(); 
        return n;      
    }
    
    public static boolean comprobarN(int n){
        boolean nMayorQue1; 
        
        if (n > 1){
            nMayorQue1 = true;
        }
        else {
            nMayorQue1 = false;
        }
        return nMayorQue1;
    }
    
    public static void resultado (int n){
        
        for (int i = 0; i < n; i++){
            System.out.println("" + (i+1));
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int n; 
        boolean comprobar;

        do{
            n = pedirN();
            comprobar = comprobarN(n);
        }while (comprobar == false);
        
        resultado(n);
        
        
        
        
        
    }
    
}
