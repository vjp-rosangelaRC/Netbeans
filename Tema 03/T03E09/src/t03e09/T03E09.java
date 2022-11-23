/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t03e09;
import java.util.Scanner;
/**
 *
 * @author Ross
 */
public class T03E09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int n1, n2, n3, n4, n = 0;
       
       Scanner entrada = new Scanner (System.in);
       
       System.out.println("Por favor, introduzca el primer número:");
       n1 = entrada.nextInt();
       System.out.println("Ahora, introduza un segundo número:");
       n2 = entrada.nextInt();
       System.out.println("Introduzca un tercer número");
       n3 = entrada.nextInt();
       System.out.println("Por favor, introduzca un cuarto número:");
       n4 = entrada.nextInt();
       //4! = 16
       //rondas=n-1=3
       if (n1 >  n2){
           n = n1;
           n1 = n2;
           n2 = n;        
       } 
       if (n2 >  n3){
           n = n2;
           n2 = n3;
           n3 = n;        
       }
       if (n3 >  n4){
           n = n3;
           n3 = n4;
           n4 = n;        
       }
       //aquí acaba la primera ronda
       if (n1 >  n2){
           n = n1;
           n1 = n2;
           n2 = n;        
       } 
       if (n2 >  n3){
           n = n2;
           n2 = n3;
           n3 = n;        
       }
       if (n3 >  n4){
           n = n3;
           n3 = n4;
           n4 = n;        
       }
       //aquí acaba la segunda ronda
       if (n1 >  n2){
           n = n1;
           n1 = n2;
           n2 = n;        
       } 
       if (n2 >  n3){
           n = n2;
           n2 = n3;
           n3 = n;        
       }
       if (n3 >  n4){
           n = n3;
           n3 = n4;
           n4 = n;        
       }
        //aquí acaba la tercera ronda         
        System.out.println(n1 + "-" + n2 + "-" + n3 + "-" + n4);
       
       
       
        
        
        
        
       
        
        
        
        
        
        
    }
    
}
