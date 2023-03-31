/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t12e05;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T12E05 {

    /**
     * @param args the command line arguments
     */
    public static void mostrarFichero(BufferedReader br) throws IOException {
        String linea;
        linea = br.readLine();
        while (linea != null){
            System.out.println(linea);
            linea= br.readLine();
        }

    }

    public static void leerFichero() {
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader("agenda.txt");
            br = new BufferedReader(fr);
            mostrarFichero(br);
        } catch (FileNotFoundException e) {
            System.out.println("No se ha encontrado");
        } catch (IOException e) {
            System.out.println("Error de lectura");
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    System.out.println("Error");
                }
                if (fr != null) {
                    try {
                        fr.close();
                    } catch (IOException e) {
                        System.out.println("Error");
                    }
                }
            }
        }
    }

    public static void escribirFichero(PrintWriter pw) {
        String nombre, tel;
        int edad;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Nombre:");
        nombre = entrada.nextLine();
        pw.print(nombre);
        

        System.out.println("Edad");
        edad = entrada.nextInt();
        pw.print(edad);

        System.out.println("Num tel");
        entrada.next();
        tel = entrada.nextLine();
        pw.print(tel);
    }

    public static void crearFichero() {
        FileWriter fw = null;
        PrintWriter pw = null;

        try {
            fw = new FileWriter("agenda.txt", true);
            pw = new PrintWriter(fw);
            escribirFichero(pw);
        } catch (FileNotFoundException e) {
            System.out.println("No se ha encontrado");
        } catch (IOException e) {
            System.out.println("Error de lectura");
        } finally {
            if (pw != null) {

                pw.close();

                if (fw != null) {
                    try {
                        fw.close();
                    } catch (IOException e) {
                        System.out.println("Error");
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("1. Añadir un contacto a un fichero de texto (“agenda.txt”) en el que\n"
                    + "indiques en cada línea:\n"
                    + "• Un Nombre.\n"
                    + "• Una Edad.\n"
                    + "• Un número de teléfono.\n"
                    + "2. Mostrar por pantalla el contenido del fichero de texto creado.\n"
                    + "3. Salir del Programa.");
            System.out.println("Introduzca opcion");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1: {
                    crearFichero();
                    break;
                }
                case 2: {
                    leerFichero();
                    break;
                }

                case 3: {
                    System.out.println("Saliendo...");
                    break;
                }
                default: {
                    System.out.println("No es una opción válida");
                }

            }

        } while (opcion != 3);

    }

}
