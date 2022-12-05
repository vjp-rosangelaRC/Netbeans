/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t04e06;

/**
 *
 * @author Ross
 */
public class Notas {
    public static void Notas (int num){
        if (num > 10 || num < 0) {
            System.out.println("Por favor, introduzca un valor entre 0 y 10.");
        }
        else {
            if (num <= 4) {
                System.out.println("Suspenso");
            }
            else {
                if (num == 5 || num == 6){
                    System.out.println("Bien");
                }
                else {
                    if (num == 7 || num == 8){
                        System.out.println("Notable");
                    }
                    else {
                        if (num == 9 || num == 10){
                            System.out.println("Sobresaliente");
                        }
                    }
                }
            }
        }
    }
}
