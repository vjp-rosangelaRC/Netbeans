/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t04e08;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T04E08 {

    /**
     * @param args the command line arguments
     */
    public static void ordenarBilletes(int billetesTotales ){
        int billetesAux, billetes50, billetes20, billetes10, monedas2, monedas1; 
        billetesAux =  billetesTotales;
        
        billetes50 = billetesAux/50;
        billetesAux = billetesAux%50;
        billetes20 = billetesAux/20;
        billetesAux = billetesAux%20;
        billetes10 = billetesAux/10;
        billetesAux = billetesAux%10;
        monedas2 = billetesAux/2;
        monedas2 = billetesAux%2;
        monedas1 = billetesAux;
        
        if (billetes50 != 0){
            System.out.println(billetes50);
        }
        if (billetes20 != 0){
            System.out.println(billetes20);
        }
        if (billetes10 != 0){
            System.out.println(billetes10);
        }
        if (monedas2 != 0){
            System.out.println(monedas2);
        }
        if (monedas1 != 0){
            System.out.println(monedas1);
        }
        
        
                
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        int billetesTotales;
        
        System.out.println("Cuantos");
        billetesTotales = entrada.nextInt();
        
        ordenarBilletes(billetesTotales);
        
    }
    
}
