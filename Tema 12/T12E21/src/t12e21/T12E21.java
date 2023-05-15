/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t12e21;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T12E21{

    /**
     * @param args the command line arguments
     */
    public static int pedirN() {
        int nota;
        Scanner entrada = new Scanner(System.in);

        nota = entrada.nextInt();
        while (nota < 0 || nota > 10) {
            System.out.println("No es una nota correcta");
            nota = entrada.nextInt();
        }

        return nota;
    }

    public static void escribirFichero(ObjectOutputStream oos) throws IOException {
        System.out.println("Por favor, introduzca la nota de Programación");

        Asignatura programacion = new Asignatura(pedirN(), "Programación");
        oos.writeObject(programacion);

        System.out.println("Por favor, introduzca la nota de Lenguajes de Marcas");
        Asignatura Lenguajes = new Asignatura(pedirN(), "Lenguajes");
        oos.writeObject(Lenguajes);

        System.out.println("Por favor, introduzca la nota de Entornos de Desarrollo");
        Asignatura Entornos = new Asignatura(pedirN(), "Entornos");
        oos.writeObject(Entornos);

        System.out.println("Por favor, introduzca la nota de Bases de Datos");
        Asignatura Bases = new Asignatura(pedirN(), "Bases");
        oos.writeObject(Bases);

        System.out.println("Por favor, introduzca la nota de Sistemas Informáticos");
        Asignatura Sistemas = new Asignatura(pedirN(), "Sistemas");
        oos.writeObject(Sistemas);

        System.out.println("Por favor, introduzca la nota de FOL");
        Asignatura FOL = new Asignatura(pedirN(), "FOL");
        oos.writeObject(FOL);

        System.out.println("Notas almacenadas correctamente");

    }

    public static void escribir() {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            fos = new FileOutputStream("notasDam.obj");
            oos = new ObjectOutputStream(fos);
            escribirFichero(oos);
        } catch (FileNotFoundException e) {
            System.out.println("Error " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    System.out.println("Error " + e.getMessage());
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    System.out.println("Error " + e.getMessage());
                }
            }
        }
    }

    public static void leer() {
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            fis = new FileInputStream("notasDam.obj");
            ois = new ObjectInputStream(fis);
            leerFichero(ois);

        } catch (FileNotFoundException e) {
            System.out.println("Error " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Error " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
        } finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    System.out.println("Error " + e.getMessage());
                }
            }
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    System.out.println("Error " + e.getMessage());
                }
            }
        }
    }

    public static void leerFichero(ObjectInputStream ois) throws IOException, ClassNotFoundException {
        Asignatura aux;
        float suma = 0;

        System.out.println("Leyendo el fichero y calculando la media ...");

        while (true) {
            aux = (Asignatura) ois.readObject();
            suma = suma + aux.getNota();

            if (aux.getNombre().equalsIgnoreCase("fol")) {
                System.out.println("La nota media es " + (suma / 6));
            }
        }

    }

    public static void main(String[] args) {
        // TODO code application logic here
        escribir();
        leer();;

    }

}
