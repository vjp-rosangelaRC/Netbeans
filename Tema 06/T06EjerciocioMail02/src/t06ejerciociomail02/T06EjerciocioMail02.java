/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t06ejerciociomail02;

import java.util.Scanner;

/**
 *
 * @author rdlrosac01
 */
public class T06EjerciocioMail02 {

    /**
     * @param args the command line arguments
     */
    
    public static int pedirPosicion (){
        Scanner entrada = new Scanner(System.in);
        System.out.println("¿Posición?");
        int posicion = entrada.nextInt();
        return posicion;
    }
    
    public static void rellenarVector (String [] vector){
        int i, posicion = pedirPosicion();
        
        i = posicion;
        System.out.println("Corresponde la letra: " + vector[i]);       
        
    }
    
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        String [] vector = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "Ñ", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        int posicion = pedirPosicion();
        do {
            rellenarVector(vector);
        } while (posicion != -1);
        
        
        
        
    }
    
}
