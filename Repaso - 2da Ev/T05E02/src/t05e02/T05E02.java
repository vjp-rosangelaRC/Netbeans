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
public class T05E02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Curso curso1 = new Curso(); 
        Curso curso2 = new Curso(); 
        
        curso1.establecerNombreYHoras("Programacion", 6);
        curso2.establecerNombreYHoras("Fol", 3);
        
        System.out.println(curso1.getNombre() + curso1.getNumeroHoras());
       System.out.println(curso2.getNombre() + curso2.getNumeroHoras());
        
       curso1.verNumeroDeCursos();
    }
    
}
