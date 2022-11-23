/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t03e16;

/**
 *
 * @author rdlrosac01
 */
public class T03E16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n=20, contImpares = 0;
        
        System.out.println("Los números impares existentes emtre el número 20 y el 160 son:");
                
        do{
            if (n%2 == 0) { //si es impar
            System.out.print(n + "-");
                contImpares++;
            }
            n++;
        }while (n <=160);
      
        System.out.println("\nLa cantidad de números impares impresos ha sido: " + contImpares);
        
        
    }
    
}
