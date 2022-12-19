/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t04e27;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T04E27 {

    /**
     * @param args the command line arguments
     */
    
    public static String respuestaMoneda () {
      Scanner entrada = new Scanner (System.in);
      String caracruz;
      caracruz = entrada.nextLine();
      return caracruz;
    }
    
    public static String monedaAleatoria () {
        double moneda;
        String result;
        moneda = Math.random();
        if (moneda <= 0.5){
            result = "cara";
        }
        else {
            result = "cruz"; 
        }
    return result;
    }
    
    
     
    public static void main(String[] args) {
        // TODO code application logic here
        String inputUsuario;
        boolean iguales =false;
        
        while (!iguales){
            System.out.println("¿Cara o cruz?");
            inputUsuario = respuestaMoneda();
            String resultado = monedaAleatoria();
            System.out.println("Ha salido " + resultado);

            iguales = resultado.equalsIgnoreCase(inputUsuario);
            if (iguales) {
                System.out.println("Enhorabuena");
            }
            else {
                System.out.println("Ha perdido. Pruebe de nuevo:");
            }
        }
    }
    
}
