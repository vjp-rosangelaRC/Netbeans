/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t02e20;
import java.util.Scanner;
/**
 *
 * @author rdlrosac01
 */
public class T02E20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        double numero1;
        double numero2;
        int suma; 
        
        System.out.println("a");
        numero1 = entrada.nextDouble();
        System.out.println("a");
        numero2=entrada.nextDouble();
        
        suma = (int) (numero1 + numero2);
        System.out.println("a" + suma);
        
        
    }
    
}
