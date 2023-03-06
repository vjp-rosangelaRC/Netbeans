/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t04e09;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T04E09 {

    /**
     * @param args the command line arguments
     */
    public static int pedirN(){
        Scanner entrada = new Scanner(System.in);
        int n; 
        n = entrada.nextInt(); 
        return n;
    }
    
    public static int pedir3N(){
        int n;
        System.out.println("Introduzca n");
        n = pedirN();
        return n;
    }
    
    public static void menor(int n1, int n2, int n3){
        if (n1 < n2 && n1 < n3){
            System.out.println("Menor " + n1);
        }else{
            if (n2 < n1 && n2 < n3){
                System.out.println("Menor "+n2);
            }else{
                System.out.println("Menor " +n3);
            }
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int n1, n2, n3;
        n1 = pedir3N();
        n2 = pedir3N();
        n3 = pedir3N();
        menor(n1, n2, n3);
    }
    
}
