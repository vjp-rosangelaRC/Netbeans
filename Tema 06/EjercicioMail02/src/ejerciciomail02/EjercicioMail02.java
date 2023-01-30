/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciomail02;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class EjercicioMail02 {

    /**
     * @param args the command line arguments
     */
    public static int pedirN() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca un número");
        int posicionAbecedario = entrada.nextInt();
        return posicionAbecedario;
    }
    
    public static String mostrarPosicion (int posicionAbecedario, String [] abecedario){
        System.out.println(abecedario[posicionAbecedario]);
        return abecedario[posicionAbecedario];
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        String [] abecedario = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "Ñ", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        String suma = "";
                
        int posicionAbecedario;
        
        do {
            posicionAbecedario = pedirN();
            if (posicionAbecedario != -1) {
                if (posicionAbecedario < -1 || posicionAbecedario > abecedario.length) {
                    System.out.println("Error. Inserte otro número.");
                } else {
                    suma = suma + mostrarPosicion(posicionAbecedario, abecedario);
                }
            }
        } while (posicionAbecedario != -1);
        System.out.println("Cadena resultante: " + suma);               
    }
    
}
