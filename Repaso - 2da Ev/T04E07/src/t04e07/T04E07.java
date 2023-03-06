/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t04e07;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T04E07 {

    /**
     * @param args the command line arguments
     */
    public static void ordernar (int n1, int n2, int n3, int n4){
        int aux; 
        
        for (int i = 0; i < 3; i++){
            if (n1 > n2){
                aux = n1; 
                n1 = n2; 
                n2 = aux;
            }
            
            if (n2 > n3){
                aux = n2;
                n2 = n3;
                n3 = aux;
            }
            
            if (n3 > n4){
                aux = n3;
                n3 = n4;
                n4 = aux;
            }
        }
        
        System.out.println("" + n1 + n2 + n3 +n4);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int n1, n2, n3, n4;
        
        System.out.println("Introduzca el primer núemro");
        n1 = entrada.nextInt();
        System.out.println("Introduzca el segundo núemro");
        n2 = entrada.nextInt();
        System.out.println("Introduzca el tercer núemro");
        n3 = entrada.nextInt();
        System.out.println("Introduzca el cuarto núemro");
        n4 = entrada.nextInt();
        
        ordernar(n1, n2, n2, n4);
    }
    
}
