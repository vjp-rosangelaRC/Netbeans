/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t02e02;

/**
 *
 * @author Ross
 */
public class T02E02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       float numero1=0.5F;
       long numero2;
       float resultado;
       numero2=178823419991L;
       resultado=numero1*numero2;
       System.out.println("El resultado de multiplicar " + numero1 + "y el numero 2 es igual a"+ resultado);
       //el error es que falta el + después de número y tiene que ir todo junto. También se quita el útlimo +.
    }
    
}
