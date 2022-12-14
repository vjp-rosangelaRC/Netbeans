/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t04e14;
import java.util.Scanner;
/**
 *
 * @author rdlrosac01
 */

public class T04E14 {

    /**
     * @param args the command line arguments
     */
    public static int pedirN (){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el número:");
        int n = entrada.nextInt();
        return n;
    }
    
    public static boolean mayorQueCero(int numero){
        Scanner teclado = new Scanner(System.in);
        boolean mayor =true;

        if  (numero < 0){
            mayor = false;
            System.out.print("Error. El número debe ser mayor que 0.");
        }
        else{
            mayor = true;
        }
        return mayor;
    }
    
    public static int multiplosTres (int numero){
        
        int i, contador=0;
        

        for(i=1;i<=numero;i++){
            if ((i % 3)==0){
               System.out.println(i);
               contador++;
            }
        }
            System.out.println("Contador: " + contador);
        return numero;
    }
     
    public static void main(String[] args) {
        // TODO code application logic here
        int numero;
        boolean mayor;
        numero = pedirN();
        mayor = mayorQueCero(numero);
        if (mayor = true){
            System.out.println(multiplosTres(numero));
        }
        
        
    }
    
}
