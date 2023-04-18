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
    
    /*
    Si tenemos una línea puedo leer directamente caracter a caracter
    Usamos los flujos de filereader sin más, no necesito un buffered reader
    Las vamos almacenando en una estructura de datos dinámica(arrayList)
    Puedo insertarla al principio, cuando la inserto directamente en mi 
    arrayList lo puedo insertar por el principio, de manera que al insertar
    uno nuevo este esté en la primera posición. lista.add(0, letra) y así 
    siempre se inserta en la posición cero.
    Otra opción es desde el size - 1 hasta 0;
    Cuando tengo el arrayList ahora tengo que escribirlo en el fichero
    usando el filewriter y luego leyendolo.
    Lo ideal sería usar una pila, pero aún no las hemos visto. 
    Usando el método read para leer lo lee como ascci, ponemos un buble 
    que mientras no llegue al final del fichero (con el -1) y convierto el 
    ascii a la letra que corresponda 
    Esto haría que las letras ya estén invertidas 
    Me recorro el arrayList de principio a final para ir poniendo los caracteres
    */
    
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
