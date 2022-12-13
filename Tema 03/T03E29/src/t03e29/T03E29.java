/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t03e29;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T03E29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        double numero;
        int aleatorio, numeroAdivinado, intentos=0;
        boolean correcto = false;
        numero = Math.random()*2+1;
        numero = Math.floor(numero);
        aleatorio = (int) numero;
        System.out.println("Adivine:");
        System.out.println(aleatorio);
        numeroAdivinado = entrada.nextInt();
        do {
        entrada.next();  
            if (numeroAdivinado < aleatorio){
                System.out.println("Es mayor");
            }
            else{
                if (numeroAdivinado > aleatorio){
                System.out.println("Es menor");
                }
            }
            
            intentos++;
        }while ( correcto = false);
       
        if (numeroAdivinado == aleatorio){
            correcto = true;
            System.out.println("Correcto. Intentos: " + intentos); 
        }
       
        
        
        
    }
    
}
