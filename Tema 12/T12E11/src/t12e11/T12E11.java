/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t12e11;

import java.io.FileNotFoundException;
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
    public static int pedirN(){
        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();
        return n; 
    }
    
    public static String pedirS(){
        Scanner entrada = new Scanner(System.in);
        String l = entrada.nextLine();
        return l;
    }
    
    
    public static void escribirFichero(PrintWriter pw) throws IOException {
        Scanner entrada = new Scanner(System.in);
        String respuesta = "";
        int num;

        do {
            System.out.println("Introduzca un número para almacenar");
            num = pedirN();
            pw.println(num);
            
            System.out.println("¿Quiere seguir añadiendo números?");
            respuesta = pedirS();
            
        } while (!respuesta.equalsIgnoreCase("no"));
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

    }

}
