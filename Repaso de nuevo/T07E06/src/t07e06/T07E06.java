/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t07e06;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T07E06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in); 
        int n; 
        System.out.println("Cuantos emp?");
        n = entrada.nextInt(); 
        
        Empleado[] vector = new Empleado[n]; 
        for (int i = 0; i < vector.length; i++) {
            vector[i] = new Empleado();
            System.out.println("nom");
            vector[i].setNombre(entrada.nextLine());
            entrada.next();
            System.out.println("horas");
            int horas = entrada.nextInt();
            System.out.println("Tarifa");
            float tarifa = entrada.nextFloat(); 
            
        }
        
        for(Empleado na: vector){
            System.out.println(na.getNombre() + " total " + na.sueldo());
        }
        
    }
    
}
