/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t03e25;

/**
 *
 * @author Ross
 */
public class T03E25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, suma = 0;
        
        for (n = 17; n < 139; n++){
            if (n % 2 == 0){
                suma = suma + n;
            }
        }
        System.out.println("" + suma);
        
    }
    
}
