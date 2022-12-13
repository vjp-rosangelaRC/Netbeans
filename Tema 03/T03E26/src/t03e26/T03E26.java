/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t03e26;

/**
 *
 * @author Ross
 */
public class T03E26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int i, suma=0;
         
        for(i = 111; i <223; i++){
           if ( i % 2 == 1){
               suma = suma + i;
           } 
        }
        System.out.println(suma);
    }
    
}
