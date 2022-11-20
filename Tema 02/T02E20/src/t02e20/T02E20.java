/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t02e20;
import java.util.Scanner; //Ponía "lang" y es "util".

/**
 *
 * @author Ross
 */
public class T02E20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double numero1;
        double numero2;
        int suma;
        Scanner entrada = new Scanner (System.in); //No estaba declarado.
        
        System.out.println("Escriba el primer entero: "); //El \t dentro del texto
        numero1 = entrada.nextInt();
        System.out.println("Escriba el segundo entero: ");
        numero2 = entrada.nextInt(); //debería ser nextInt, es un integer
        
        suma = (int) ((int) numero1 + numero2); //Como suma está declarado como int es necesario indicar que el resultado debe ser convertido forzozamente 
        System.out.println("La suma es: "+ suma); //aquí falta el más antes de suma
    }
    
}
