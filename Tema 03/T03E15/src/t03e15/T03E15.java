/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t03e15;
import java.util.Scanner;
/**
 *
 * @author rdlrosac01
 */
public class T03E15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        int i, num;
        
        System.out.println("Introduzca un número para calcular su tabla de multiplicar:");
        num = entrada.nextInt();
        
        for (i=0; i <11; i++){
            System.out.println(num + "x" + i);
        }
        
    }
    
}
