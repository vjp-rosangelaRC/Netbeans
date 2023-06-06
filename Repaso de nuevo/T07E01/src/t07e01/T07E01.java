/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t07e01;

/**
 *
 * @author Ross
 */
public class T07E01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Asignaturas[] notas = new Asignaturas[6]; 
        
        notas[0] = new Asignaturas("A", 5); 
        notas[1] = new Asignaturas("B", 3); 
        notas[2] = new Asignaturas("C", 7); 
        notas[3] = new Asignaturas("D", 6); 
        notas[4] = new Asignaturas("E", 7); 
        notas[5] = new Asignaturas("F", 5); 
        
        for(Asignaturas a:notas){
            System.out.println(a.getNombre() + " :" + a.getNota());
        }
                
        
        
        
    }
    
}
