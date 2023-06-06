/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t06ea07;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T06EA07 {

    /**
     * @param args the command line arguments
     */
    public static void posiciones(char[] vector) {
        Scanner entrada = new Scanner(System.in);
        int num;
        String a=""; 

        do {
            System.out.println("Pos?");
            num = entrada.nextInt();
            if(num >= 0 && num <= vector.length){
                a = a + vector[num]; 
            }
            
        } while (num != -1);
        System.out.println(a);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        char[] vector = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
            'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        
        posiciones(vector);
    }

}
