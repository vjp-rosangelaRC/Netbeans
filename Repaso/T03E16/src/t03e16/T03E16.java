/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t03e16;

/**
 *
 * @author rdlrosac01
 */
public class T03E16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero = 20, contador = 0;
        
        while (numero < 161){
            if (numero % 2 == 1){
              System.out.print(numero + "-");
              contador++;
            }
            numero++;    
        }
        System.out.println("\nSe han impreso " + contador + " numeros");
        
    }
    
}
