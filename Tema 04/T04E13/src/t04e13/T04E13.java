/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t04e13;
import java.util.Scanner;

/**
 *
 * @author rdlrosac01
 */
public class T04E13 {

    /**
     * @param args the command line arguments
     */
    
    public static int pedirN (){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca un número:");
        int n = entrada.nextInt();
        return n;
    }
    
    public static boolean mayorQueUno(int numero){
        boolean mayor =true;

        if  (numero < 1){
            mayor = false;
            System.out.print("Error. El número debe ser mayor que 0.");
            numero = pedirN();
        }
        else{
            mayor = true;
        }
        return mayor;
    }
    
    public static int output (int numero){
        int i;
                
        for(i=1;i<numero;i++){
               System.out.println(i);
        }
            
        return numero;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int numero;
        boolean mayor;
        numero = pedirN();
        mayor = mayorQueUno(numero);
        if (mayor = true){
            System.out.println(output(numero));
        }
    }
    
}
