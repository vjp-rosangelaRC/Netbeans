/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t03e12;

/**
 *
 * @author Ross
 */
public class T03E12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 11;

        do {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        } while (i <= 133);

    }

}
