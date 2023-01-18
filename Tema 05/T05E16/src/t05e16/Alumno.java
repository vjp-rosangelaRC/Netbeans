/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t05e16;
import java.util.Scanner;

/**
 *
 * @author rdlrosac01
 */
public class Alumno {

    /**
     * @param args the command line arguments
     */
    // Falta el private 
    private String nombre;
    private int nota;
    
// Faltan los constructores
    
    public Alumno() {
        this.nombre = "";
        this.nota = 0;
    }

    public Alumno(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        Scanner entrada = new Scanner(System.in);
        nombre = entrada.next(nombre);
        return nombre;
    }

    public void setNombre(String nombre) {        
        this.nombre = nombre;        
    }

    public int getNota() {
        Scanner entrada = new Scanner(System.in);
        nota = entrada.nextInt();
        do {
            System.out.println("Introduca una nota válida");
            nota = entrada.nextInt();
        }while ( nota < 0 && nota > 10);
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;        
    }  

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", nota=" + nota + '}';
    }
       
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
