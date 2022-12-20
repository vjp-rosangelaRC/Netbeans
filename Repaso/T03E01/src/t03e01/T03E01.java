/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t03e01;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T03E01 {

    /**
     * @param args the command line arguments
     */
    public static void positivoNegativo (int numeroUsuario){
        
        if (numeroUsuario > 0){
            System.out.println("Positivo");
        }
        else {
            System.out.println("Negativo");
        }        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        
        int numeroUsuario;
        
        System.out.println("Por favor, introduzca un número:");
        numeroUsuario = entrada.nextInt();
        
        positivoNegativo(numeroUsuario);
    }
    
}
