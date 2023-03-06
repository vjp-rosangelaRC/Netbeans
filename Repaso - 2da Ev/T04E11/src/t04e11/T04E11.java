/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t04e11;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T04E11 {

    /**
     * @param args the command line arguments
     */
    public static int pedirN (){
        Scanner entrada = new Scanner(System.in);
        int n; 
        n = entrada.nextInt(); 
        return n;
    }
    
    public static double raiz(int n){
        double raiz; 
        raiz = Math.floor(Math.sqrt(n));
        return raiz;
    }
    
    public static void mostrar (double raiz){
        System.out.println("" + raiz);
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        mostrar(raiz(pedirN()));
    }
    
}
