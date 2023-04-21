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
        } catch (FileNotFoundException e) { // Esta hay que controlarla antes
            System.out.println("error");
        } catch (IOException e) {
            System.out.println("Error");
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    System.out.println("Error");
                }
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
    
    public static void leerFichero (BufferedReader br) throws IOException, FileNotFoundException{
        String linea;
        String[] lineaDividida = new; 
        int numero; 
        
        linea = br.readLine();
        lineaDividida = linea.split("-");
        while (linea != null){
            linea = br.readLine();
            lineaDividida = linea.split("-");
        }
        
        for (int i = 0; i < lineaDividida.length; i++) {
            numero = Integer.parseInt(lineaDividida[i]);
        }
    }

    public static void main(String[] args) throws IOException, FileNotFoundException {
        // TODO code application logic here
        FileReader fr = null;
        BufferedReader br = null;

        crearFichero(fr, br);
        leerFichero(br);

    }

}
