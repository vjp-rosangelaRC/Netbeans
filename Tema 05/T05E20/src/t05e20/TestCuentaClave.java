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
public class TestCuentaClave { //Falta parte del ejercicio

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcionMenu, clave, claveIntroducida;
        // Se inicializa la cuenta a valor null  para poder usarla, si no existe el objeto cuenta no se puede usar el menú
        CuentaClave cuenta1 = null;

        //Bucle do para mostrar el menú
        do {
            System.out.println("M   E   N   Ú:");
            System.out.println("1.- Crear cuenta vacía");
            System.out.println("2.- Crear cuenta con saldo inicial.");
            System.out.println("3.- Ingresar dinero.");
            System.out.println("4.- Sacar dinero");
            System.out.println("5.- Ver saldo");
            System.out.println("6.- Salir");
            System.out.println("Seleccione una opción:");
            opcionMenu = entrada.nextInt();

            switch (opcionMenu) {
                // Creo cuenta usando el constructor por defecto
                case 1: {
                    cuenta1 = new CuentaClave();
                    System.out.println("Se ha creado su cuenta vacía");
                    System.out.println("Escoja una clave");
                    clave = entrada.nextInt();
                    break;
                }

                // El usuario introduce un saldo inicial
                case 2: {
                    float saldoInicial = entrada.nextFloat();
                    System.out.println("Introduzca un saldo para crear cuenta:");
                    cuenta1 = new CuentaClave(saldoInicial);
                    System.out.println("Se ha creado su cuenta con un saldo inicial de " + saldoInicial);
                    System.out.println("Escoja una clave");
                    clave = entrada.nextInt();
                    break;
                }

                //Ingresar dinero 
                case 3: {
                    if (cuenta1 != null) {
                        System.out.println("Introduzca su clave:");
                        claveIntroducida = entrada.nextInt();
                        if (clave == claveIntroducida) {
                            float dinero = entrada.nextFloat();
                            System.out.println("Introduza el monto que quiere ingresar:");
                            cuenta1.ingresar(dinero);
                            System.out.println("Se han ingresado " + dinero + " con éxito.");
                        } else {
                            System.out.println("La clave no es correcta. Pruebe de nuevo");
                        }
                    } else {
                        System.out.println("No existe la cuenta. Cree una cuenta antes.");
                    }
                    break;
                }

                // Extraer dinero
                case 4: {
                    if (cuenta1 != null) {
                        float dinero = entrada.nextFloat();
                        System.out.println("Introduza el monto que quiere extraer:");
                        cuenta1.extraer(dinero);
                        System.out.println("Se han extraído " + dinero + " con éxito.");
                    } else {
                        System.out.println("No existe la cuenta. Cree una cuenta antes.");
                    }
                    break;

                }

                // Mostrar dinero
                case 5: {
                    if (cuenta1 != null) {
                        System.out.println("El saldo es: " + cuenta1.getSaldo());
                    } else {
                        System.out.println("No existe la cuenta. Cree una cuenta antes.");
                    }
                    break;
                }

                //Salir
                case 6: {
                    System.out.println("Saliendo");
                    break;
                }

                //Default
                default: {
                    System.out.println("Introduzca un número válido");
                }
            }
        } while (opcionMenu != 6);

    }

}
