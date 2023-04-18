/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t12e07;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T12E07 {

    /**
     * @param args the command line arguments
     */
    public static void crearFichero(String nombreArchivo, String textoArchivo) {
        FileWriter fw = null;
        PrintWriter pw = null;

        try {
            fw = new FileWriter(nombreArchivo, true);
            pw = new PrintWriter(fw);
            escribirFichero(pw, textoArchivo);
        } catch (FileNotFoundException e) {
            System.out.println("No existe el fichero agenda.txt");

        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al escribir en el archivo: " + e.getMessage());
        } finally {
            if (pw != null) {
                pw.close();
            }
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    System.out.println("Error de E/S " + e.getMessage());
                }
            }
        }
    }

    public static void escribirFichero(PrintWriter pw, String textoArchivo) throws IOException {
        pw.println(textoArchivo);
        System.out.println("Fichero guardado");
    }

    private static void leerFichero(BufferedReader br) throws IOException {
        String linea;
        System.out.println("Mostrando fichero original...");
        linea = br.readLine();

        while (linea != null) {
            System.out.println(linea);
            linea = br.readLine();
        }

        System.out.println("");
    }

    private static void leerFicheroCambiado(BufferedReader br) throws IOException {
        String linea, texto;
        ArrayList<String> contenido = new ArrayList<>();
        char[] caracteres;

        // Guardo el contenido de todo el fichero en un arrayList
        linea = br.readLine();
        contenido.add(linea);

        while (linea != null) {
            linea = br.readLine();
            contenido.add(linea);
        }

        //Convierto el arraList en caracteres
        caracteres = contenido.toString().toCharArray();

        //Saco el ascii de los caracteres para cambiarlos de mayúsculas a minúsculas
        for (int i = 0; i < caracteres.length; i++) {
            if ((int) caracteres[i] > 65 && (int) caracteres[i] < 90) {
                caracteres[i] = Character.toLowerCase(caracteres[i]);
            } else {
                caracteres[i] = Character.toUpperCase(caracteres[i]);
            }
        }

        //Convierto el vector en un String para mostrar el texto
        texto = new String(caracteres);
        System.out.println(texto); //Esto sale null

        texto = br.readLine();

        // Muestro el contenido
        System.out.println("Mostrando el fichero cambiado");
        while (texto != null) {
            System.out.println(texto);
            texto = br.readLine();
        }
        System.out.println("");

    }

    /*
    //Convierto el contenido a mayúsculas y minúsculas y lo muestro
    System.out.println("Mostrando el fichero cambiado");
    for (String s : contenido) {
        texto = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isUpperCase(c)) {
                texto += Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                texto += Character.toUpperCase(c);
            } else {
                texto += c;
            }
        }
        System.out.println(texto);
    }
    System.out.println("");
}
     */
    public static void leerF(String nombreArchivo) {
        FileReader fr = null;
        BufferedReader br = null;
        try {

            fr = new FileReader(nombreArchivo);
            br = new BufferedReader(fr);
            leerFichero(br);
            leerFicheroCambiado(br);
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

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        String nombreArchivo, textoArchivo;

        System.out.print("Ingrese el nombre del fichero: ");
        nombreArchivo = entrada.nextLine();

        System.out.print("Ingrese el texto que desea escribir en el archivo: ");
        textoArchivo = entrada.nextLine();

        crearFichero(nombreArchivo, textoArchivo);

        leerF(nombreArchivo);

    }

}
