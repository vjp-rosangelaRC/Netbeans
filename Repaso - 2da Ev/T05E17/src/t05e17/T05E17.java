/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t05e17;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T05E17 {

    /**
     * @param args the command line arguments
     */
    public static boolean preguntar (Enunciado preg){
        Scanner entrada = new Scanner(System.in);
        boolean correcto = false;
        String resp; 
        System.out.println(preg.getPregunta());
        resp = entrada.nextLine();
        if (preg.getRespuesta().equalsIgnoreCase(resp)){
            correcto = true;
        }
        return correcto;
    }
    
    public static double nota(double n){
        double nota = 0; 
        nota = nota + n;
        System.out.println(nota);
        return nota;     
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Enunciado preg1 = new Enunciado("A", "a");
        Enunciado preg2 = new Enunciado("B", "b");
        Enunciado preg3 = new Enunciado("C", "c");
        Enunciado preg4 = new Enunciado("D", "d");
        
        double nota = 0;
        
        if (preguntar(preg1) == true){
            nota = nota + 2.5;
        }
        
        if (preguntar(preg2) == true){
            nota = nota + 2.5;
        }
        
        if (preguntar(preg3) == true){
            nota = nota + 2.5;
        }
        
        if (preguntar(preg4) == true){
            nota = nota + 2.5;
        }
        
        System.out.println(nota);
        
        
    }
    
}
