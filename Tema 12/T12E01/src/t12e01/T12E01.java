/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t12e01;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rdlrosac01
 */
public class T12E01 {

    /**
     * @param args the command line arguments
     */
    public static int pedirN() throws IOException {
        Scanner entrada = new Scanner(System.in);
        int n;
        n = entrada.nextInt();
        return n;
    }

    public static String pedirS() throws IOException {
        Scanner entrada = new Scanner(System.in);
        String n;
        n = entrada.nextLine();
        return n;
    }

    public static void anhadirContacto(ArrayList<Contacto> listaContactos) throws NullPointerException, IOException {
        String nombre, numeroMovil;
        int edad;

        System.out.println("Nombre?");
        try {
            nombre = pedirS();
        } catch (IOException e) {
            System.out.println("Error");
            nombre = "error";
        }

        System.out.println("Numero móvil?");
        try {
            numeroMovil = pedirS();
        } catch (IOException e) {
            System.out.println("Error");
            numeroMovil = "error";
        }

        System.out.println("Edad?");
        try {
            edad = pedirN();
        } catch (IOException e) {
            System.out.println("Error");
            edad = 0;
        }

        Contacto contacto = new Contacto(nombre, edad, numeroMovil);

        listaContactos.add(contacto);
    }
    
    public static void mostrarContactos(ArrayList<Contacto> listaContactos) throws NullPointerException, IOException{
        for(Contacto i: listaContactos){
            System.out.println(i.toString());
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        int opcion;
        ArrayList<Contacto> listaContactos = new ArrayList<>();

        do {
            System.out.println("1. Añadir contactos a la agenda: Pediremos los datos de un contacto al usuario y lo introducimos en la lista.\n"
                    + "2. Visualizar la lista de contactos.\n"
                    + "3. Eliminar contactos de la lista: Pediremos el número de teléfono y eliminamos el contacto.\n"
                    + "4. Mostrar todos los contactos ordenados por su edad.\n"
                    + "5. Salir del programa");
            System.out.println("Seleccione una opción");

            try {
                opcion = pedirN();

            } catch (IOException e) {
                System.out.println("Error.");
                opcion = 6;
            }

            switch (opcion) {
                case 1: {
                    try {
                        anhadirContacto(listaContactos);
                    } catch (NullPointerException ex) {
                        System.out.println("Error");
                    } catch (IOException ex) {
                        System.out.println("Error");
                    }
                    finally{
                        break;
                    }
                }
                
                case 2:{
                try {
                    mostrarContactos(listaContactos);
                } catch (NullPointerException ex) {
                    System.out.println("Error");
                } catch (IOException ex) {
                    System.out.println("Error");
                }
                finally{
                    break;
                }
                    
                }
                
                case 3:{
                    break;
                }

                case 5: {
                    System.out.println("Saliendo...");
                    break;
                }
                default: {
                    System.out.println("No es un número válido");
                }

            }

        } while (opcion != 5);

    }

}
