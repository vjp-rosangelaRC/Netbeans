/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t12e09;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Ross
 */
public class T12E09 {

    /**
     * @param args the command line arguments
     */
    
    private static void leerFichero(BufferedReader br) throws IOException {
        String linea;
        String[] lineainversa;
        char[] caracteres;
        int i;
              
        linea = br.readLine();
        while (linea != null) {
               linea = br.readLine();
        }
        
        lineainversa = new String[linea.length()];
        caracteres = linea.toString().toCharArray();
        
        for (i = linea.length() ; i > linea.length() - 1; i--) {
            lineainversa[i] = linea[i];
          
        }
        
        
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Solo fileReader. Leer a caracter a caracter + método read + 
        cast explícito de char hasta el -1 (no usa null)
        
         */
        String archivoEntrada = "frase.txt";
        String archivoSalida = "fraseinvertida.txt";

        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(archivoEntrada);
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
