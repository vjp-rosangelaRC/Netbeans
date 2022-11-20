/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t02e19;

/**
 *
 * @author Ross
 */
public class T02E19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 3, b = 6, c;
        c = a / b;
        System.out.println("El calor de c es: " + c); //c=0
        
        c = a % b;
        System.out.println("El valor de c es: " + c);//c=3
        
        a++;
        System.out.println("El valor de a es: " + a);//a=4
        
        ++a;
        System.out.println("El valor de a es: " + a);//a=5
        
        c = ++a + b++;
        System.out.println("El valor de a es: " + a);//a=6
        System.out.println("El valor de b es: " + b);//b=7
        System.out.println("El valor de c es: " + c);//c=12
        
        c = ++a + ++b;
        System.out.println("El valor de a es: " + a);//a=7
        System.out.println("El valor de b es: " + b);//b=8
        System.out.println("El valor de c es: " + c);//c=15
                       
    }
    
}
