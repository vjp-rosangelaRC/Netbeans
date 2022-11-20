/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t02e16;

/**
 *
 * @author Ross
 */
public class T02E16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int billetesTotales=130, billetes = billetesTotales;
               
        int billetes50=billetesTotales/50;
        billetesTotales = billetesTotales % 50;
        int billetes10= billetesTotales/10;
                
        System.out.println("130 euros hacen un total de "+ billetes50 + " billetes de 50 euros y " +billetes10+ " billetes de 10 euros.");
    }
    
}
