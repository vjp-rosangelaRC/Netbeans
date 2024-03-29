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
     * Aquí falta la clase contacto
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
        /*Ampliar este para que cuando abra el ejercicio lo cargue en una estructura de datos (la que yo quiera)
        y en vez de mostrar cada línea la voy insertando en mi estructura. 
        Pero ahora el insertar no escribe en el fichero sino en la estructura de datos. EL mostrar muestra lo que
        haya en la estructura de datos. 
        Cuando salgamos volcamos los datos al fichero. Borrando los datos previos
        Para poder hacer esto necesitamos el método split (tema 8); de manera que si dividimos con un guión cuando
        metemos los datos cuando hagamos el read line la línea adopta todos los valores dentro, por eso tengo que 
        trocear la línea.
        */
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
            /*Falta la parte para escribir los contactos*/
            /*En este caso lo que hace falta es crear un objeto de tipo Contacto y poner los nombres
            y luego de tener los contactos sería usar el método para escribir el contacto en la agenda
            al que le pasamos el pw y el contacto que queremos introducir y ya en el print pongo
            el contacto y su datos guardados*/
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
