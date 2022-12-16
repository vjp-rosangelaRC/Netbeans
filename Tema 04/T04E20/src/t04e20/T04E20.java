/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t04e20;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T04E20 {

    /**
     * @param args the command line arguments
     */
    public static String CapitalEspanha = "Madrid" ;
    public static String DescubridorAmerica = "Colon";
    
    
    public static boolean pregunta1(){
    Scanner entrada = new Scanner (System.in);
    String respuesta1, respuesta2;
    boolean puntuacion;
    boolean iguales;
        
    System.out.println("Examen de cultural general");    
    System.out.println("¿Cuál es la capital de España?");
    respuesta1 = entrada.nextLine();
    
    iguales = CapitalEspanha.equalsIgnoreCase(respuesta1);
    
    if (iguales == true){
        System.out.println("Respuesta correcta.");
        puntuacion = true;
    }
    else {
        System.out.println("Respuesta incorrecta. La respuesta correcta es: " + CapitalEspanha);
        puntuacion = false;
    }
    return puntuacion;
    }
    
    public static void pregunta2(){
    Scanner entrada = new Scanner (System.in);
    String respuesta1, respuesta2;
    int puntuacion = 0;
    boolean iguales;
        
    System.out.println("¿Quién decubrió América?");
    respuesta2 = entrada.nextLine();
    iguales = CapitalEspanha.equalsIgnoreCase(respuesta2);
    
    if (iguales == true){
        System.out.println("Respuesta correcta.");
        puntuacion++;
    }
    else {
        System.out.println("Respuesta incorrecta. La respuesta correcta es: " + DescubridorAmerica);
        puntuacion--;
    }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    int puntuacionFinal = 0;
    
    pregunta1();
    if (puntuacion == true){
        puntuacionFinal = +5;
    }
    pregunta2();
    if (puntuacion == true){
        puntuacionFinal = +5;
    }
    
    System.out.println("Nota del examen:" + puntuacionFinal);
    
    }
    
}
