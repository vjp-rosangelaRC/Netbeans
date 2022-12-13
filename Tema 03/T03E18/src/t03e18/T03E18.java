/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t03e18;
import java.util.Scanner;
/**
 *
 * @author Ross
 */
public class T03E18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        int i=1, password = 1234, passwordUsuario;
        System.out.println("Por favor, introduzca la contraseña:");
        passwordUsuario = entrada.nextInt();
        
         do{
            if (passwordUsuario != password){
                System.out.println("No es correcto, trate de nuevo:");
                passwordUsuario = entrada.nextInt();
            }
            
            if (passwordUsuario == password){
                System.out.println("Contraseña correcta");
            }
            
             i++;
             if (i == 3){
                System.out.println("Número máximo de intentos alcanzados");
            }
             
         }while ( i < 3);
         
        
        
           
    }
    
}
