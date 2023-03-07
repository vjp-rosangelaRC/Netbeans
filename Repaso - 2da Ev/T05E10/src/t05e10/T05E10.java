/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t05e10;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T05E10 {

    /**
     * @param args the command line arguments
     */
    public static int pedirN(){
        Scanner entrada = new Scanner(System.in); 
        int n = entrada.nextInt(); 
        return n;
    }
    
    public static void ordernar (Numero n1, Numero n2, Numero n3, Numero n4){
        int aux; 
       
        for (int i = 0; i < 4; i++){
            if (n1.getValor() > n2.getValor()){
                aux = n1.getValor(); 
                n1.setValor(n2.getValor());
                n2.setValor(aux);
            }
            if (n2.getValor() > n3.getValor()){
                aux = n2.getValor(); 
                n2.setValor(n3.getValor());
                n3.setValor(aux);
            }
            if (n3.getValor() > n4.getValor()){
                aux = n3.getValor(); 
                n3.setValor(n4.getValor());
                n4.setValor(aux);
            }
        }
        System.out.println(n1.getValor() + "-" + n2.getValor() + " - " + n3.getValor() + " - " +n4.getValor() );
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Numero num1 = new Numero(); 
        num1.setValor(pedirN());
        Numero num2 = new Numero(); 
        num2.setValor(pedirN());
        Numero num3 = new Numero(); 
        num3.setValor(pedirN());
        Numero num4 = new Numero(); 
        num4.setValor(pedirN());
        
        ordernar(num1, num2, num3, num4);
        
        
    }
    
}
