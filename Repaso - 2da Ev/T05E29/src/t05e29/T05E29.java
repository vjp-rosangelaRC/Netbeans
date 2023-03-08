/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t05e29;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T05E29 {

    /**
     * @param args the command line arguments
     */
    public static String pedirS() {
        Scanner entrada = new Scanner(System.in);
        String n;
        n = entrada.nextLine();
        return n;
    }

    public static int comprobarAular() {
        Scanner entrada = new Scanner(System.in);
        int aula; 
        System.out.println("Aula");
        aula = entrada.nextInt(); 
        while (aula < 10 || aula > 10){
            aula = entrada.nextInt();
        }
        return aula; 
    }
    
    public static String comprobarFecha(){
        String fecha; 
        Scanner entrada = new Scanner(System.in);
        fecha = entrada.nextLine(); 
        if (fecha.equalsIgnoreCase(fecha)){
            
        }
        return fecha;
        
    }

    public static void main(String[] args) {
        // TODO code application logic here
        int aula;
        String nombre, fecha, hora;
        
        aula = comprobarAular();
        

        Examen examen1 = new Examen("", aula, "", "");
        Examen examen2 = new Examen();
        Examen examen3 = new Examen();

        
    }

}
