/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t02e15;

/**
 *
 * @author rdlrosac01
 */
public class T02E15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int tiempo=10000; 
        int segundos = tiempo % 60;
        tiempo = tiempo/60;
        int minutos= tiempo%60;
        tiempo = tiempo/60;
        int horas= tiempo/60;
        
        
        
        
        System.out.println("Segundos " + tiempo +" minutos " + minutos + " horas " + horas);
        System.out.println("Minutos " + minutos);
        
    }
    
}
