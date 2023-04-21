/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t12e11;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rdlrosac01
 */
public class T12E11 {

    /**
     * @param args the command line arguments
     */
    public static int pedirN() {
        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();
        return n;
    }

    public static String pedirS() {
        Scanner entrada = new Scanner(System.in);
        String l = entrada.nextLine();
        return l;
    }

    public static void escribirFichero(PrintWriter pw) throws IOException {
        Scanner entrada = new Scanner(System.in);
        String respuesta = "";
        boolean salir = false;
        int num;

        do {
            System.out.println("Introduzca un número para almacenar");
            num = pedirN();
            pw.println(num);

            System.out.println("¿Quiere seguir añadiendo números?");
            respuesta = pedirS();

            if (respuesta.equalsIgnoreCase("si")) {
                salir = false;
            } else {
                if (respuesta.equalsIgnoreCase("no")) {
                    salir = true;
                }
            }

        } while (salir == false);
    }

    private static void leerFichero(BufferedReader br) throws IOException {
        String linea;
        int total = 0;
        // integer.parseint(linea) → esto me lo devuelve como entero 
        linea = br.readLine();
        
        while (linea != null) {
            total = total + Integer.parseInt(linea);
            linea = br.readLine();
        }

        System.out.println("total: " + total);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        FileWriter fw = null;
        PrintWriter pw = null;

        try {
            fw = new FileWriter("numeros.txt", true);
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
                        System.out.println("Error de lectura");
                    }
                }

            }
        }
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader("numeros.txt");
            br = new BufferedReader(fr);
            leerFichero(br);
            String linea = br.readLine();

        } catch (FileNotFoundException e) {
            System.out.println("No existe el fichero " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error de E/S " + e.getMessage());
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    System.out.println("Error de E/S " + e.getMessage());
                }
            }
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    System.out.println("Error de E/S " + e.getMessage());
                }
            }
        }

    }

}
