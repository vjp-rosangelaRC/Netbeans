/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t04e18;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T04E18 {

    /**
     * @param args the command line arguments
     */
    public static String pedirNombre () {
        Scanner entrada = new Scanner (System.in);
        String nombre;
        System.out.println("Introduzca nombre");
        nombre = entrada.nextLine();
        return nombre;
}
    public static String nombreCincoVeces (String nombre){
        int i;
        
        for(i=1; i<5; i++){
            System.out.println(nombre);
        }
        return nombre;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        nombre = pedirNombre();
        System.out.println(nombreCincoVeces(nombre));
    }
    
}
