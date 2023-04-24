/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t12e12;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rdlrosac01
 */
public class T12E12 {

    /**
     * @param args the command line arguments
     */
    public static void crearFichero(FileReader fr, BufferedReader br) throws FileNotFoundException, IOException {
        try {
            fr = new FileReader("masnumeros.txt");
            br = new BufferedReader(fr);
            leerFichero(br);
        } catch (FileNotFoundException e) { // Esta hay que controlarla antes
            System.out.println("Error file not found");
        } catch (IOException e) {
            System.out.println("Error IOException");
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    System.out.println("Error IOExeption en el close");
                }
            }

            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    System.out.println("Error IOException en el close del fr");
                }
            }
        }
    }

    public static void leerFichero(BufferedReader br) throws IOException, FileNotFoundException {
        String linea;
        int suma = 0;
        String[] prueba;

        linea = br.readLine();
        prueba = linea.split(";");
        suma = suma + recorrerVector(prueba);

        while (linea != null);{
            linea = br.readLine();
            prueba = linea.split(";");
            
            suma = suma + recorrerVector(prueba);
            
        }
        
        
        System.out.println("Suma: " + suma);
    }

    public static int recorrerVector(String[] prueba) {
        int suma = 0;
        for (int i = 0; i < prueba.length; i++) {
            suma = suma + Integer.parseInt(prueba[i]);
        }
        System.out.println("a:" + suma);
        return suma;
    }

    public static void main(String[] args) {
        try {
            // TODO code application logic here
            FileReader fr = null;
            BufferedReader br = null;
            crearFichero(fr, br);
            //leerFichero(br);
        } catch (IOException ex) {
            System.out.println("Error");
        }
    }
}
