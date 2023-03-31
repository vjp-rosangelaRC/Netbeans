/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t12e05b;

import static com.sun.org.apache.xalan.internal.lib.ExsltStrings.split;
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
 * @author rdlrosac01
 */
public class T12E05B {

    /**
     * @param args the command line arguments
     */
    public static void crearFichero(Contacto contacto) {
        FileWriter fw = null;
        PrintWriter pw = null;
        
        try {
            fw = new FileWriter("agenda.txt");
            pw = new PrintWriter(fw);
            anhadirAlFichero(pw, contacto);
        } catch (FileNotFoundException e) {
            System.out.println("No se ha encontrado");
        } catch (IOException e) {
            System.out.println("Error de lectura");
        } finally {
            if (pw != null) {

                pw.close();

                if (fw != null) {
                    try {
                        fw.close();
                    } catch (IOException e) {
                        System.out.println("Error");
                    }
                }
            }
        }
    }

    public static void anhadirAlArray(ArrayList<Contacto> listaContactos, Contacto contacto) {
        String nombre, tel;
        int edad;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Nombre:");
        nombre = entrada.nextLine();

        System.out.println("Edad");
        edad = entrada.nextInt();

        System.out.println("Num tel");
        entrada.next();
        tel = entrada.nextLine();

        contacto.setEdad(edad);
        contacto.setNombre(nombre);
        contacto.setTelefono(tel);
        
        listaContactos.add(contacto);
    }

    public static void leerFichero() {
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader("agenda.txt");
            br = new BufferedReader(fr);
            mostrarFichero(br);
        } catch (FileNotFoundException e) {
            System.out.println("No se ha encontrado");
        } catch (IOException e) {
            System.out.println("Error de lectura");
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    System.out.println("Error");
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
    }

    public static void mostrarFichero(BufferedReader br) throws IOException {
        String linea;
        linea = br.readLine();
        while (linea != null) {
            System.out.println(linea);
            linea = br.readLine();
        }

    }
    
    public static void verListaContactos(ArrayList<Contacto> listaContactos){
        for (Contacto i:listaContactos){
            System.out.println(i.toString());
        }
    }
    
    public static void anhadirAlFichero(PrintWriter pw, Contacto contacto){
        /*Falta el split*/
        String[] temporal = contacto;
        String[] part = contacto.split("-");
        
        /*
        String cadena = "Hola|Stackoverflow|en|español";
String[] parts = cadena.split("|");              
System.out.println(Arrays.asList(parts));
        */
        pw.print(contacto);
    }

    public static void main(String[] args) {
        /*Ampliar este para que cuando abra el ejercicio lo cargue en una estructura de datos (la que yo quiera)
        y en vez de mostrar cada línea la voy insertando en mi estructura. 
        Pero ahora el insertar no escribe en el fichero sino en la estructura de datos. EL mostrar muestra lo que
        haya en la estructura de datos. 
        Cuando salgamos volcamos los datos al fichero. Borrando los datos previos
        Para poder hacer esto necesitamos el método split (tema 8); de manera que si dividimos con un guión cuando
        metemos los datos cuando hagamos el read line la línea adopta todos los valores dentro, por eso tengo que 
        trocear la línea.
        */
        Scanner entrada = new Scanner(System.in);
        int opcion;
        Contacto contacto = new Contacto();
        ArrayList<Contacto> listaContactos = new ArrayList<>();
                

        do {
            System.out.println("1. Añadir un contacto a un fichero de texto (“agenda.txt”) en el que\n"
                    + "indiques en cada línea:\n"
                    + "• Un Nombre.\n"
                    + "• Una Edad.\n"
                    + "• Un número de teléfono.\n"
                    + "2. Mostrar por pantalla el contenido del fichero de texto creado.\n"
                    + "3. Salir del Programa.");
            System.out.println("Introduzca opcion");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1: {
                    anhadirAlArray(listaContactos, contacto);
                    break;
                }
                
                case 2: {
                    verListaContactos(listaContactos);
                    break;
                }

                case 3: {
                    leerFichero();
                    System.out.println("Saliendo...");
                    break;
                }
                default: {
                    System.out.println("No es una opción válida");
                }

            }

        } while (opcion != 3);

    }

}
