/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t12e26;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

/**
 *
 * @author rdlrosac01
 */
public class T12E26 {

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
        String s = entrada.nextLine();
        return s;
    }

    private static void anhadirBebidas(ObjectOutputStream oos) throws IOException {
        String nombre;
        float precio;
        int stock;

        System.out.println("¿Cómo se llama la bebida?");
        nombre = pedirS();

        System.out.println("¿Cuánto vale la bebida?");
        precio = pedirN();

        System.out.println("¿Cuánto stock quiere introducir?");
        stock = pedirN();

        Bebida bebidas = new Bebida(nombre, precio, stock);

        oos.writeObject(bebidas);
    }

    public static void escribir(File fichero) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            if (!fichero.exists()) {
                fos = new FileOutputStream(fichero, true);
                oos = new ObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(fichero, true);
                oos = new MiObjectOutputStream(fos);
            }
            anhadirBebidas(oos);
        } catch (FileNotFoundException e) {
            System.out.println("Error");
        } catch (IOException e) {
            System.out.println("Datos guardados correctamente");
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    System.out.println("Error");
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    System.out.println("Error");
                }
            }
        }
    }

    public static void leer() {
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            fis = new FileInputStream("bebidas.obj");
            ois = new ObjectInputStream(fis);
            mostrarBebidas(ois);
        } catch (FileNotFoundException e) {
            System.out.println("Error");
        } catch (ClassNotFoundException e) {
            System.out.println("Error");
        } catch (EOFException e) {
            System.out.println("Fin de la lista (●'◡'●)");
        } catch (IOException e) {
            System.out.println("Fin ");
        } finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    System.out.println("Error");
                }
            }
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    System.out.println("Error");
                }
            }
        }
    }

    private static void mostrarBebidas(ObjectInputStream ois) throws IOException, ClassNotFoundException {
        Bebida bebidas = new Bebida();
        while (true) {
            bebidas = (Bebida) ois.readObject();
            System.out.println(bebidas.toString());
        }
    }
    
    public static void comprar(){
        
    }

    public static void menu(File fichero) {
        int opcion;
        String respuesta;
        do {
            System.out.println(" ======= M  E   N   Ú =======");
            System.out.println("Introducir una bebida");
            System.out.println("Comprar producto");
            System.out.println("Salir");
            opcion = pedirN();

            switch (opcion) {

                case 1: {
                    escribir(fichero);
                    System.out.println("¿Quiere introducir otro producto?");
                    respuesta = pedirS();
                    while (respuesta.equalsIgnoreCase("si")) {
                        escribir(fichero);
                        System.out.println("¿Quiere introducir otro producto?");
                        respuesta = pedirS();
                    }
                    System.out.println("☆*: .｡. Datos introducidos correctamente .｡.:*☆☆*");
                    break;
                }

                case 2: {
                    System.out.println("==== BEBIDAS DISPONIBLES ====");
                    leer();
                    
                    System.out.println("¿Qué bebida quiere comprar? (❁´◡`❁)");
                    comprar();
                    
                    break;
                }

                case 3: {
                    System.out.println("Saliendo... ");
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
        File fichero = new File("bebidas.obj");
        menu(fichero);
    }

}
