/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t12e24;

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
 * @author Ross
 */
public class T12E24 {

    /**
     * @param args the command line arguments
     */
    public static Empleado crearEmpleado() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce el nombre del empleado: ");
        String nombre = entrada.nextLine();

        System.out.println("Introduce el número de horas trabajadas: ");
        int horas = entrada.nextInt();

        System.out.println("Introduce la tarifa por hora: ");
        float tarifa = entrada.nextFloat();

        System.out.println("Empleado creado con éxito.");
        Empleado empleado = new Empleado(nombre, horas, tarifa);

        return empleado;
    }

    public static void anhadirEmpleado(ArrayList<Empleado> empleados, ObjectOutputStream oos) throws IOException {
        empleados.add(crearEmpleado());

        Scanner entrada = new Scanner(System.in);
        String respuesta;
        System.out.println("¿Quiere crear otro empleado?");
        respuesta = entrada.nextLine();
        
        if (respuesta.equalsIgnoreCase("si")) {
            anhadirEmpleado(empleados, oos);
        } else {
            if (!respuesta.equalsIgnoreCase("si") ) {
                for (int i = 0; i < empleados.size(); i++) {
                    oos.writeObject(empleados.get(i));
                }
            }
        }
    }

    public static void escribir(File fichero, ArrayList<Empleado> empleados) {
        FileOutputStream fos = null;
        ObjectOutputStream  oos = null;
        try {
            if  (!fichero.exists()){  //SI no existe
                fos = new FileOutputStream(fichero, true);
                oos = new ObjectOutputStream(fos);
            }
            else{  //Si existe el fichero
                fos = new FileOutputStream(fichero, true);
                oos = new MiObjectOutputStream(fos);
            }
            
            anhadirEmpleado(empleados, oos);
        } catch (FileNotFoundException e) {
            System.out.println("El fichero no existe");
        } catch (IOException e) {
            System.out.println("Error de entrada - salida");
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    System.out.println("Error de entrada - salida");
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    System.out.println("Error de entrada - salida");
                }
            }
        }
    }

    public static void leer(File fichero) {
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            fis = new FileInputStream(fichero);
            ois = new ObjectInputStream(fis);
            mostrarFichero(ois);
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        } catch (ClassNotFoundException e) {
            System.out.println("Clase no encontrada");
        } catch (IOException e) {
            System.out.println("Error de entrada - salida");
        } finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    System.out.println("Error entrada salida");
                }
            }
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    System.out.println("Error entrada");
                }
            }

        }
    }

    public static void mostrarFichero(ObjectInputStream ois) throws IOException, ClassNotFoundException {
        Empleado empleadoAuxiliar = new Empleado();
        while (true) {
            empleadoAuxiliar = (Empleado) ois.readObject();
            System.out.println(empleadoAuxiliar.toString());
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Empleado> empleados = new ArrayList<>();
        File fichero = new File("listaAlumnos.obj");
        
        //No se escribe en el fichero los nuevos datos
        escribir(fichero, empleados);
        leer(fichero);

    }

}
