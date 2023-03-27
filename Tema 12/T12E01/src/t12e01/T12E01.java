/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t12e01;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author rdlrosac01
 */
public class T12E01 {

    /**
     * @param args the command line arguments
     */
    public static int pedirN() throws IOException{
        Scanner entrada = new Scanner(System.in);
        int n; 
        n = entrada.nextInt();
        return n;        
    }
    
    public static String pedirS()throws IOException {
        Scanner entrada = new Scanner(System.in);
        String n; 
        n = entrada.nextLine();
        return n;        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion;
        
        do{
            System.out.println("1. Añadir contactos a la agenda: Pediremos los datos de un contacto al usuario y lo introducimos en la lista.\n" +
            "2. Visualizar la lista de contactos.\n" +
            "3. Eliminar contactos de la lista: Pediremos el número de teléfono y eliminamos el contacto.\n" +
            "4. Mostrar todos los contactos ordenados por su edad.\n" +
            "5. Salir del programa");
            System.out.println("Seleccione una opción");
            try{
                opcion = pedirN();
            } 
            catch(IOException e){
                System.out.println("Error");
            }
            
            

            
            
        }while (opcion != 5);
        
        
    }
    
}
