/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t02e16;

/**
 *
 * @author rdlrosac01
 */
public class T02E16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int billetesTotales, billetesAux, billetes50, billetes10;
        
        billetesTotales=130;
        billetesAux = billetesTotales;
        
        billetes50=130/50;
        billetesAux = 130%50;
        
        billetes10 = billetesAux/10;
        
        System.out.println("50=" + billetes50 + " 10=" + billetes10);
        
        
        
    }
    
}
