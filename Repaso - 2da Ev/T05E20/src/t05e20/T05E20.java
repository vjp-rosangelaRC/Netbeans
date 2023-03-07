/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t05e20;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T05E20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opc;
        Scanner entrada = new Scanner(System.in);
        Cuenta cuenta1 = new Cuenta();
        boolean creada = false;
        int n;
        do {
            System.out.println("1.- Crear cuenta vacía.\n"
                    + "2.- Crear cuenta con saldo inicial.\n"
                    + "3.- Ingresar dinero.\n"
                    + "4.- Sacar dinero.\n"
                    + "5.- Ver saldo.\n"
                    + "6.- Salir.");
            opc = entrada.nextInt();
            switch (opc) {
                case 1: {
                    creada = true;
                    break;
                }

                case 2: {
                    if (creada == false) {
                        n = entrada.nextInt();
                        cuenta1.setSaldo(n);
                        creada = true;
                       
                    }
                    break;
                }

                case 3: {
                    if (creada) {
                        n = entrada.nextInt();
                        cuenta1.setSaldo(n);
                    } else {
                        System.out.println("Error");
                    }
                    break;
                }
                
                case 4: {
                    if (creada) {
                        n = entrada.nextInt();
                        cuenta1.extraer(n);
                    } else {
                        System.out.println("Error");
                    }
                    break;
                }
                
                case 5:{
                    if (creada) {
                        System.out.println(cuenta1.getSaldo());
                    } else {
                        System.out.println("Error");
                    }
                    break;
                }
                
                case 6 : {
                    System.out.println("Salir");
                }
            }

        } while (opc != 6);

    }

}
