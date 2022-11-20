/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t01e03;

/**
 *
 * @author Ross
 */
public class T01E03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dato1; 
        int dato2, resultado;
               
        dato1 = 20;
        dato2 = 10;
       
        
        //Suma
        resultado = dato1 + dato2;
        System.out.println(dato1 + " + " + dato2 + " = " + resultado);
        
        //Resta
        resultado = dato1 - dato2;
        System.out.println(dato1 + " - " + dato2 + " = " + resultado);
        
        //Producto
        resultado = dato1 * dato2;
        System.out.println(dato1 + " * " + dato2 + " = " + resultado);
        
        //Cociente
        resultado = dato1 / dato2; 
        System.out.println(dato1 + " / " + dato2 + " = " + resultado);
        
    }
    
}
