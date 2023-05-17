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
import java.util.ArrayList;
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

    private static void anhadirBebidas(ObjectOutputStream oos, ArrayList<Bebida> arrayBebidas) throws IOException {
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
        arrayBebidas.add(bebidas);
    }

    public static void escribir(File fichero, ArrayList<Bebida> arrayBebidas) {
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
            anhadirBebidas(oos, arrayBebidas);
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
            System.out.println("☆*: .｡. Datos introducidos correctamente .｡.:*☆☆*");
        }
    }

    public static void leer(File fichero, ArrayList<Bebida> arrayBebidas) {
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            fis = new FileInputStream(fichero);
            ois = new ObjectInputStream(fis);
            mostrarBebidas(ois);
        } catch (FileNotFoundException e) {
            System.out.println("No hay ningún producto en stock ＞︿＜ ");
        } catch (ClassNotFoundException e) {
            System.out.println("Error ");
        } catch (EOFException e) {
            System.out.println("Fin de la lista (●'◡'●)");
        } catch (IOException e) {
            System.out.println("No hay ningún producto en stock ＞︿＜ ");
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
        try {
            while (true) {
                Bebida bebida = (Bebida) ois.readObject();
                System.out.println(bebida.toString());
            }
        } catch (EOFException e) {
            System.out.println("Fin de la lista (●'◡'●)");
        }
    }

    public static void comprar(ArrayList<Bebida> arrayBebidas, File fichero) {
        int cantidad;
        float total = 0;
        String compra;

        System.out.println("¿Qué bebida quiere comprar? (❁´◡`❁)"); 
        compra = pedirS();

        if (!arrayBebidas.isEmpty()) {
            for (int i = 0; i < arrayBebidas.size(); i++) {
                if (arrayBebidas.get(i).getNombreBebida().equalsIgnoreCase(compra)) {
                    System.out.println("¿Qué cantidad quiere?");
                    cantidad = pedirN();

                    if (arrayBebidas.get(i).getStock() <= cantidad) {
                        System.out.println("No hay suficiente stock");
                    } else {
                        arrayBebidas.get(i).setStock(arrayBebidas.get(i).getStock() - cantidad);
                        total = arrayBebidas.get(i).getPrecio() * cantidad;
                                               
                        System.out.println("Su total es " + total);
                    }
                }
            }
        } else {
            System.out.println("No hay stock de esta bebida (；′⌒`). Por favor, seleccione una de las bebidas disponibles");
            leer(fichero, arrayBebidas);
            System.out.println("¿Quiere comprar alguna de las bebidas disponibles?");
            compra = pedirS();

            if (compra.equalsIgnoreCase("si")) {
                /*while (!arrayBebidas.contains(compra)) { Esta parte no */
                System.out.println("¿Qué bebida quiere comprar? (❁´◡`❁)");
                compra = pedirS();
                //}
            }
        }
    }

    private static void reanhadirBebidas(ObjectOutputStream oos, ArrayList<Bebida> arrayBebidas) throws IOException {
        String nombre = "";
        float precio = 0;
        int stock = 1;

        for (int i = 0; i < arrayBebidas.size(); i++) {
            nombre = arrayBebidas.get(i).getNombreBebida();
            precio = arrayBebidas.get(i).getPrecio();
            stock = arrayBebidas.get(i).getStock();
        }

        Bebida bebidas = new Bebida(nombre, precio, stock);

        oos.writeObject(bebidas);
        arrayBebidas.add(bebidas);
    }

    public static void reescribir(File fichero, ArrayList<Bebida> arrayBebidas) {
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
            reanhadirBebidas(oos, arrayBebidas);
        } catch (FileNotFoundException e) {
            System.out.println("Error");
        } catch (IOException e) {
            //System.out.println("Stock actualizado");
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
            //System.out.println("☆*: .｡. Datos introducidos correctamente .｡.:*☆☆*");
        }
    }

    public static void menu(File fichero, ArrayList<Bebida> arrayBebidas) {
        int opcion;
        String respuesta;
        do {
            System.out.println(" ======= M  E   N   Ú =======");
            System.out.println("1. Introducir una bebida");
            System.out.println("2. Comprar producto");
            System.out.println("Salir");
            opcion = pedirN();

            switch (opcion) {

                case 1: {
                    escribir(fichero, arrayBebidas);
                    System.out.println("¿Quiere introducir otro producto?");
                    respuesta = pedirS();
                    while (respuesta.equalsIgnoreCase("si")) {
                        escribir(fichero, arrayBebidas);
                        System.out.println("¿Quiere introducir otro producto?");
                        respuesta = pedirS();
                    }
                    break;
                }

                case 2: {
                    System.out.println("==== BEBIDAS DISPONIBLES ====");
                    leer(fichero, arrayBebidas);
                    if (fichero.exists()) {
                        comprar(arrayBebidas, fichero);
                    }
                    break;
                }

                case 3: {
                    //reescribir(fichero, arrayBebidas);
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
        ArrayList<Bebida> arrayBebidas = new ArrayList<>();
        
        // Cada vez que se vuelve a ejecutar el programa tengo que escribir en el array
        // el reescribir no funciona → tengo que borrarlo e introducir la información del arrayList
        // línea 172 while Hay alguna manera de comprobar el contenido de una lista sin entrar en el bucle? 
        /* En este ejercicio no quiero respetar la cabecera (reescribo todo), 
        así que no hace falta el miObjectOutputStream */
        menu(fichero, arrayBebidas);
    }

}
