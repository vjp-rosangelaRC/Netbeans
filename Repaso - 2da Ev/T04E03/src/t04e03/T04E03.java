/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t04e03;

import java.util.Scanner;
import newpackage.mayorQue;

/**
 *
 * @author Ross
 */
public class T04E03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int n1, n2, n3;
        
        System.out.println("N1");
        n1 = entrada.nextInt();
        System.out.println("N2");
        n2 = entrada.nextInt();
        System.out.println("N3");
        n3 = entrada.nextInt();
        
        mayorQue.mayor(n1, n2, n3);
        
    }
    
}
