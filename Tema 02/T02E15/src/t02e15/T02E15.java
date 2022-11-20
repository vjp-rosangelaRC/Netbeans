/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t02e15;

/**
 *
 * @author Ross
 */
public class T02E15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int tiempo = 10000, tiempo2 = tiempo; /*segundos */
    
    int horas = tiempo / 3600;
    tiempo = tiempo % 3600;
    int minutos = tiempo / 60;
    tiempo = tiempo % 60;
    int segundos = tiempo;
    
    
    
    
    
    // resultado = 2h, 46min y 40 s
    System.out.println("10.000 segundos hacen un total de " + horas + " horas, " + minutos + " minutos y " + segundos + " segundos");
    }
    
}
