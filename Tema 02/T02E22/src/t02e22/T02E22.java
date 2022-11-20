/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t02e22;
import java.util.Scanner;
/**
 *
 * @author Ross
 */
public class T02E22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Por favor, introduzca la medida de un lado:");
        float lado = entrada.nextFloat(), resultado = 0.43F * ((lado * lado) ), resultado2 = 3 * lado;
        
        System.out.println("El área de un triángulo de lado: " + lado + " es " + resultado);
        System.out.println("El perímetro de un triángulo de lado: " + lado + " es " + resultado2);
        
    }
    
}
