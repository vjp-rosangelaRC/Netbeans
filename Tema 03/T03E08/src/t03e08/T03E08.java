/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t03e08;
import java.util.Scanner;
/**
 *
 * @author Ross
 */
public class T03E08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        System.out.println("Por favor, indique una cantidad de dinero:");
        int importeTotal, importe = entrada.nextInt();
        importeTotal = importe;      
        int billetes50 = importe / 50;
        importe = importe % 50;
        int billetes20 = importe / 20;
        importe = importe % 20;
        int billetes10 = importe / 10;
        importe = importe % 10;
        int billetes5 = importe / 5;
        importe = importe % 5;
        int billetes2 = importe / 2;
        importe = importe %2; 
        int billetes1 = importe/1;
        System.out.println(importeTotal + " euros se descomponen en: ");
        if (billetes50 > 0){
            System.out.println("Billetes de 50: " + billetes50);
        }
        if (billetes20 > 0){
            System.out.println("Billetes de 20: " + billetes20);
        }
        if (billetes10 > 0){
            System.out.println("Billetes de 10: " + billetes10);
        }
        if (billetes5 > 0){
            System.out.println("Billetes de 5: " + billetes5);
        }
        if (billetes2 > 0){
            System.out.println("Monedas de 2 euros: " + billetes2);
        }
        if (billetes1 > 0){
            System.out.println("Monedas de 1 euro: " + billetes1);
        }
        
         
    }
    
}
