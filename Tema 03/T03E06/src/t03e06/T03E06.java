/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t03e06;
import java.util.Scanner;
/**
 *
 * @author Ross
 */
public class T03E06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada;
        entrada = new Scanner(System.in);
        System.out.println("Por favor, introduzca un número:");
        int num = entrada.nextInt();
        if (num > 10 || num < 0) {
            System.out.println("Por favor, introduzca un valor entre 0 y 10.");
        }
        else {
            if (num <= 4) {
                System.out.println("Suspenso");
            }
            else {
                if (num == 5 || num == 6){
                    System.out.println("Bien");
                }
                else {
                    if (num == 7 || num == 8){
                        System.out.println("Notable");
                    }
                    else {
                        if (num == 9 || num == 10){
                            System.out.println("Sobresaliente");
                        }
                    }
                }
            }
        }
        
    }
    
}
