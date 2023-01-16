/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package Calculadora;

/**
 *
 * @author Marcos
 */
public class Calculadora {
    
    public int suma(int a, int b) {
        return a+b;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        System.out.println(calc.suma(2,4));
    }
    
}