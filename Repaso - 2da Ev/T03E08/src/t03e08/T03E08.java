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
        Scanner entrada = new Scanner(System.in); 
        int total, totalAux, billetes50, billetes20, billetes10, moneda1, moneda2; 
        
        System.out.println("Introduzca la cantidad de billetes");
        total = entrada.nextInt();
        totalAux = total; 
        
        billetes50 = totalAux/50;
        totalAux = totalAux%50;
        billetes20 = totalAux/20;
        totalAux = totalAux%20;
        billetes10 = totalAux/10;
        totalAux = totalAux%10; 
        moneda2 = totalAux/2;
        totalAux = totalAux%2;
        moneda1 = totalAux; 
        
        if (billetes50 != 0){
            System.out.println("Billetes 50 " + billetes50);
        }
        if (billetes20 != 0){
            System.out.println("Billetes 20 " + billetes20);
        }
        if (billetes10 != 0){
            System.out.println("Billetes 10 " + billetes10);
        }
        if (moneda2 != 0){
            System.out.println("Monedas de dos " + moneda2);
        }
        if (moneda1 != 0){
            System.out.println("Monedas de uno " + moneda1);
        }
        
        
    }
    
}
