/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t04e07;

/**
 *
 * @author Ross
 */
public class Orden {
    public static void Orden (int n1, int n2, int n3, int n4, int n){
        int i;
        for(i = 0;i < 3;i++){
            if (n1 > n2){
                n = 1;
                n1 = n2;
                n2 = n;
            }
            if (n2 > n3){
                n = 2;
                n2 = n3;
                n3 = n;
            }
            if (n3 > n4){
                n = n3;
                n3 = n4;
                n4 = n;
            }    
        }
        
        
    }
}
