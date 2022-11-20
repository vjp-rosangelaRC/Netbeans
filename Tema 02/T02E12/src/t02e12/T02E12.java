/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t02e12;

/**
 *
 * @author Ross
 */
public class T02E12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num = 5; 
        num += num - 1 * 4 + 1;
        //num=0 → sale 7.
        System.out.println(num); //Sale un 0.
        num = 4; 
        num %= 7 * num % 3 * 7 >> 1;
        //num=0 → sale 1.
        System.out.println(num);
    }
    
}
