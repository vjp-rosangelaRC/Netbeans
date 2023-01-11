/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t03e12;

/**
 *
 * @author rdlrosac01
 */
public class T03E12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero = 11;
        
        do{
            if (numero%2 == 0){
            System.out.println(numero);
            }
            numero++;
        }while (numero < 134);
   
    }
    
}
