/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t02e23;

import java.util.Scanner;

/**
 *
 * @author rdlrosac01
 */
public class T02E23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int precio, unidades, total;
        
        System.out.println("Precio");
        precio = entrada.nextInt();
        
        System.out.println("Cantidad");
        unidades = entrada.nextInt();
        
        total = precio * unidades;
        
        System.out.println("" + total);
        
    }
    
}
