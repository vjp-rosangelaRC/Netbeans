/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t07e09;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T07E09 {

    /**
     * @param args the command line arguments
     */
    public static int pedirN() {
        // Bucle do while para comprobar que el usuario mete número válido
        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();
        return n;
    }

    public static void rellenarNotas(Alumno[] alumno, Asignatura[] asignaturas) {
        int n, opcion;
        String nombre;
        
        System.out.println("Escoger alumno:");
        System.out.println("1. Pepe");
        System.out.println("2. Juan");
        System.out.println("3. Marta");
        do{
            opcion = pedirN();
        }while (opcion < 1 || opcion > 3);
        
        for (int i = 0; i < alumno.length; i++) { 
            System.out.println("Nota para " + alumno[opcion].getNombreAlumno());
            
            n = pedirN();
            
            asignatura[opcion].setNota(0);
            alumno[opcion].setNotas();
            
            
        }
    }

    public static void mostrarVector(Alumno[] alumno) {
        for (Alumno n : notas) {
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Asignatura asignatura1 = new Asignatura();
        asignatura1.setNombreAsignatura("Lengua");
        Asignatura asignatura2 = new Asignatura();
        asignatura2.setNombreAsignatura("Mates");
        Asignatura asignatura3 = new Asignatura();
        asignatura3.setNombreAsignatura("Historia");
        Asignatura asignatura4 = new Asignatura();
        asignatura4.setNombreAsignatura("Física");
        
        Alumno alumno1 = new Alumno();
        alumno1.setNombreAlumno("Pepe");
        Alumno alumno2 = new Alumno();
        alumno1.setNombreAlumno("Juan");
        Alumno alumno3 = new Alumno();
        alumno1.setNombreAlumno("Marta");
        
        asignatura1.setNota(0);
        alumno1.setNotas();

        int opcion;

        do {
            System.out.println("M E N Ú");
            System.out.println("1. Rellenar las notas de los alumnos");
            System.out.println("2. Mostrar las notas introducidas");
            System.out.println("3. Salir del programa");
            System.out.println("Introduzca su opción:");
            opcion = pedirN();

            switch (opcion) {
                case 1: {
                    rellenarNotas(alumno, notas);
                    break;
                }

                case 2: {
                    Alumno.mostrarVector(notas);
                    break;
                }

                case 3: {
                    /**/
                    break;
                }

                default: {
                    System.out.println("No es una opción válida.");
                }
            }

        } while (opcion != 3);

    }

}
