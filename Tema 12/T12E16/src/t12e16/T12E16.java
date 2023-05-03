/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t12e16;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author rdlrosac01
 */
public class T12E16 {

    /**
     * @param args the command line arguments
     */
    public static int[] primerosImpares() {
        int[] primerosImp = new int[100];

        for (int i = 0; i < primerosImp.length; i++) {
            if (i % 2 == 1) {
                primerosImp[i] = i;
            }
        }
        return primerosImp;
    }

    public static void escribirFichero(DataOutputStream dos, int[] primerosImp) throws IOException, FileNotFoundException{
        for (int i = 0; i < primerosImp.length; i++) {
            dos.writeInt(primerosImp[i]);
        }
    }

    public static void crearFichero(int[] primerosImp, String nombre) {
        Scanner entrada = new Scanner(System.in);
        DataOutputStream dos = null;

        System.out.println("¿Qué nombre quiere darle al fichero?");
        nombre = entrada.nextLine();

        try {
            FileOutputStream fos = new FileOutputStream(nombre, true);
            dos = new DataOutputStream(fos);
            escribirFichero(dos, primerosImp);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (dos != null) {
                    dos.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    
    public static void lectorFichero(DataInputStream dis) throws IOException, FileNotFoundException{
        System.out.println("Números: ");
        
        while (true){
            System.out.println(dis.readInt());
       }
    }
    
    /*No funciona lo de recibir nombre*/
    public static void leerFichero (String nombre){
        FileInputStream fis = null; 
        DataInputStream dis = null; 
        
        try{
            fis = new FileInputStream(nombre); 
            dis = new DataInputStream(fis);
            lectorFichero(dis);
        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        } catch (IOException e){
            System.out.println(e.getMessage());
        } finally {
            if (dis != null){
                try {
                    dis.close();
                } catch (IOException e){
                    System.out.println(e.getMessage());
                }
            } 
            if (fis != null){
                try{
                    fis.close();
                } catch (IOException e){
                    System.out.println(e.getMessage());
                }
            }
        }
        
    }

    public static void menu(int[] primerosImp, String nombre) {
        Scanner entrada = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("1. Volcado de un array con los 100 primeros números impares a \n"
                    + "un fichero binario. El nombre del fichero lo elegirá el \n"
                    + "usuario.\n"
                    + "2. Mostrar por pantalla el contenido del fichero binario creado.\n"
                    + "3. Salir del Programa.");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1: {
                    crearFichero(primerosImp, nombre);
                    break;
                }
                
                case 2: {
                    leerFichero(nombre);
                    break;
                }

                case 3: {
                    System.out.println("Saliendo ...");
                    break;
                }

                default: {
                    System.out.println("No es una opción válida");
                }
            }
        } while (opcion != 3);

    }

    public static void main(String[] args) {
        // TODO code application logic here
        String nombre = "";
        int[] primerosImp = primerosImpares(); 
        
        menu(primerosImp, nombre);
    }

}
