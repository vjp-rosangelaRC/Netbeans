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
    final static int MAX = 222;
    public static void main(String[] args) {
        // TODO code application logic here
        int suma = 0;
        for (int i = 111; i < MAX; i++ ){
           if (i % 2 == 1){
                suma = suma + i;
           }
        }
        System.out.println(suma);
    }
    
}
