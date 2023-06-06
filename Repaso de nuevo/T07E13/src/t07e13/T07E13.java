/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t07e13;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T07E13 {

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
    
    public static void datosAlumnos(int pos, Alumno[] alumnos) {
        Alumno alumnoAux = new Alumno();
        System.out.println("Nom");
        alumnoAux.setNombre(pedirS());
        System.out.println("Edad");
        alumnoAux.setEdad(pedirN());
        System.out.println("Media");
        alumnoAux.setNotaMedia(pedirN());
        System.out.println("Alumo correcto");
        
        alumnos[pos].setEdad(alumnoAux.getEdad());
        alumnos[pos].setNombre(alumnoAux.getNombre());
        alumnos[pos].setNotaMedia(alumnoAux.getNotaMedia());
        
    }
    
    public static void insertarAlumno(Alumno[] alumnos) {
        int pos;
        boolean salir = false;
        
        do {
            try {
                System.out.println("Donde quiiere insertar alumno");
                pos = (pedirN() - 1);
            } catch (InputMismatchException e) {
                System.out.println("No válido");
                pos = pedirN();
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("No válido");
                pos = pedirN();
            }
            
            if (alumnos[pos] == null) {
                alumnos[pos] = new Alumno();
                datosAlumnos(pos, alumnos);
                salir = true;
            } else {
                System.out.println("Pos ocupada");
            }
        } while (!salir);
    }
    
    public static void mostrar(Alumno[] alumnos) {
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i] != null) {
                System.out.println(alumnos[i].toString());
            }
        }
    }
    
    public static void media(Alumno[] alumnos) {
        System.out.println("Media");
        int media = pedirN();
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i] != null) {
                alumnos[i].buscarMedia(media);
            }
        }
    }
    
    public static void suspensos(Alumno[] alumnos) {
        int contador = 0;
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i] != null) {
                if (alumnos[i].suspensos()) {
                    contador++;
                }
            }
            
        }
        System.out.println(contador);
    }
    
    public static void buscarMatriculado(Alumno[] alumnos) {
        System.out.println("Nom?");
        String nom = pedirS();
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i] != null) {
                if (alumnos[i].matriculado(nom)) {
                    System.out.println("Matriculado");
                } else {
                    System.out.println("No existe");
                }
            }            
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Alumno[] alumnos = new Alumno[5];
        int opcion;
        do {
            System.out.println("1. Rellenar alumno"
                    + "2. Mostrar alumnos"
                    + "Mostrar notame media por encima"
                    + "Mostrar suspensos "
                    + "Buscar alumnos");
            opcion = pedirN();
            
            switch (opcion) {
                case 1: {
                    insertarAlumno(alumnos);
                    break;
                }
                
                case 2: {
                    mostrar(alumnos);
                    break;
                }
                
                case 3: {
                    media(alumnos);
                    break;
                }
                
                case 4: {
                    suspensos(alumnos);
                    break;
                }
                
                case 5: {
                    buscarMatriculado(alumnos);
                    break;
                }
                
                case 6: {
                    System.out.println("salir");
                    break;
                }
                default: {
                    System.out.println("No valido");
                }
            }
            
        } while (opcion != 6);
    }
    
}
