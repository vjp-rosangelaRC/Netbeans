/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t01e04;

/**
 *
 * @author Ross
 */
public class T01E04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dato1; 
        int dato2, resultado;
        int dato3;
               
        dato1 = 20;
        dato2 = 10;
        dato3 = 15;
       
        
        //Suma
        resultado = dato1 + dato2 + dato3;
        System.out.println(dato1 + " + " + dato2 + " + " + dato3 + " = " + resultado);
        
        //Resta
        resultado = dato3 - dato2;
        System.out.println(dato3 + " - " + dato2 + " = " + resultado);
        
        //Producto
        resultado = dato1 * dato2 * dato3;
        System.out.println(dato1 + " * " + dato2 + " * " + dato3 + " = " + resultado);
        
        //Cociente
        resultado = dato1 / dato3; 
        System.out.println(dato1 + " / " + dato3 + " = " + resultado);
        
    }
    
}
