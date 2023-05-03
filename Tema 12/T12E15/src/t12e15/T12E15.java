/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t12e15;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rdlrosac01
 */
public class T12E15 {

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
        String n = entrada.nextLine();
        return n;
    }

    public static void crearContacto() {
        String nombre, telefono;
        int edad;

        System.out.println("Nombre?");
        nombre = pedirS();

        System.out.println("Edad?");
        edad = pedirN();

        System.out.println("Telefono?");
        telefono = pedirS();

        Contacto contacto = new Contacto(nombre, edad, telefono);

        anhadirContactoAAgendA(contacto);
    }

    public static void anhadirContactoAAgendA(Contacto contacto) {
        DataOutputStream dos = null;

        try {
            FileOutputStream fos = new FileOutputStream("agenda.bin", true);
            dos = new DataOutputStream(fos);
            escribirFichero(dos, contacto);
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

    public static void escribirFichero(DataOutputStream dos, Contacto contacto) throws IOException, FileNotFoundException {
        dos.writeUTF(contacto.getNombre());
        dos.writeInt(contacto.getEdad());
        dos.writeUTF(contacto.getTelefono());
    }

    public static void leerAgenda() {
        FileInputStream fis = null;
        DataInputStream dis = null;

        try {
            fis = new FileInputStream("agenda.bin");
            dis = new DataInputStream(fis);
            leerFichero(dis);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (dis != null) {
                try {
                    dis.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }

    public static void leerFichero(DataInputStream dis) throws IOException, FileNotFoundException {
        while (true) {
            System.out.println("Nombre: " + dis.readUTF());
            System.out.println("Edad: " + dis.readInt());
            System.out.println("Teléfono: " + dis.readUTF());
        }
    }

    public static void menu() {
        int opcion;
        String respuesta = "si";

        do {
            System.out.println("1. Añadir un contacto a un fichero binario (“agenda.bin”) en el que \n"
                    + "indiques:\n"
                    + "• Un Nombre.\n"
                    + "• Una Edad.\n"
                    + "• Un número de teléfono.\n"
                    + "2. Mostrar por pantalla el contenido del fichero de texto creado.\n"
                    + "3. Salir del Programa.");
            opcion = pedirN();

            switch (opcion) {
                case 1: {
                    crearContacto();

                    System.out.println("¿Quiere crear otro contacto?");
                    respuesta = pedirS();

                    if (respuesta.equalsIgnoreCase("no")) {
                        System.out.println("Volviendo al menú ... ");
                    }

                    while (respuesta.equalsIgnoreCase("si")) {
                        crearContacto();
                        System.out.println("¿Quiere crear otro contacto?");
                        respuesta = pedirS();
                        if (respuesta.equalsIgnoreCase("no")) {
                            System.out.println("Volviendo al menú ... ");
                        }
                    }

                    break;
                }

                case 2: {
                    System.out.println("Los contactos guardados son:");
                    leerAgenda();
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
        menu();

    }

}
