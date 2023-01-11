/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t05e02;


/**
 *
 * @author Ross
 */
public class Test {
    public static void main(String[] args){
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();
        curso1.establecerNombreyHoras("pepe",12);
        curso2.establecerNombreyHoras("Juan",2);
        
        System.out.println("Mi curso 1 es " + curso1.obtenerNombre() + " y mi hora es " + curso1.obtenerHoras());
        System.out.println("Mi curso 2 es " + curso2.obtenerNombre() + " y mi hora es " + curso2.obtenerHoras());
        
        System.out.println("El número de cursos es " + Curso.verNumeroCursos() );
    }
}
