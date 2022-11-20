/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t02e18;

/**
 *
 * @author Ross
 */
public class T02E18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 2, b = 4;
        int resultadoa = -a + 5 % b - a * a;
        int resultadob = 5 + 3 % 7 * b * a - b % a;
        int resultadoc = (a + 1) * (b + 1) - b / a;
        System.out.println("Resultados: ");
        System.out.println(resultadoa);
        System.out.println(resultadob);
        System.out.println(resultadoc);
        
    }
    
}
