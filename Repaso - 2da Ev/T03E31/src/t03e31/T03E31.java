/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t03e31;

/**
 *
 * @author Ross
 */
public class T03E31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int aleatorio, contador = 0, contador2 = 0;

        while (contador < 3) {
            aleatorio = (int) (Math.floor(Math.random() * 100 + 1));
            if (aleatorio % 2 == 1) {

                System.out.println(aleatorio);
                contador++;
            }
            contador2++;
        }
        System.out.println("cont" + contador2);

    }

}
