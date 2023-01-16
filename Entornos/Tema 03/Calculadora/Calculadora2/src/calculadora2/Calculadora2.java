/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package calculadora2;

/**
 *
 * @author Marcos
 */
public class Calculadora2 {
    
    public int suma(int a, int b) {
        return a+b;
    }
    
    public int resta(int a, int b) {
        return a-b;
    }
    
    public int division(int a, int b) {
        return a/b;
    }
    
    public int multiplicacion(int a, int b) {
        return a*b;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculadora2 calc = new Calculadora2();
        System.out.println(calc.suma(2,4));
    }
    
}