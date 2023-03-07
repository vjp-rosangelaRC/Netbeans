/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t05e05;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T05E05 {

    /**
     * @param args the command line arguments
     */
    public static int pedirNota(){
        Scanner entrada = new Scanner(System.in);
        int nota;
        System.out.println("Nota?");
        nota = entrada.nextInt(); 
        return nota;
    }
    
    public static int calcularMedia (int n1, int n2, int n3, int n4){
        int media;
        media = (n1 + n2 + n3 +n4)/4;
        
        return media; 
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int n1, n2, n3, n4, media;
        
        System.out.println("Programación");
        n1 = pedirNota();
        Asignatura programación = new Asignatura("programación");
        programación.setNota(n1);
        
        System.out.println("Fol");
        n2 = pedirNota();
        Asignatura fol = new Asignatura("fol");
        fol.setNota(n1);
        
        System.out.println("AA");
        n3 = pedirNota(); 
        Asignatura aa = new Asignatura("AA");
        aa.setNota(n1);
        
        System.out.println("ASNAS");
        n4 = pedirNota();
        Asignatura ASNAS = new Asignatura("ASNAS");
        ASNAS.setNota(n1);
        
        media = calcularMedia(n1, n2, n3, n4);
        System.out.println(media);
        
    }
    
}
