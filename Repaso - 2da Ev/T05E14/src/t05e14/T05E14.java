/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t05e14;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T05E14 {

    /**
     * @param args the command line arguments
     */
    public static int pedirN(){
        Scanner entrada = new Scanner(System.in); 
        int n; 
        n = entrada.nextInt();
        return n;
    }
    
    public static void mostrar (Numero n){
        for (int i= 0; i < 11; i++){
            System.out.println(n.getValor() + "x" + i + "=" + (n.getValor()*i));
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Numero n = new Numero(); 
        n.setValor(pedirN());
        mostrar(n);
        
    }
    
}
