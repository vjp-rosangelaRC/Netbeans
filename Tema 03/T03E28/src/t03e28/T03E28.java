/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t03e28;

/**
 *
 * @author Ross
 */
public class T03E28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double numero;
        int aleatorio, parImpar;
        numero = Math.random()*100+1;
        numero = Math.floor(numero);
        aleatorio = (int) numero;
        parImpar = aleatorio % 2 ; 
        
        System.out.println("Numero: " + aleatorio);
        if (parImpar == 0){
     
            System.out.println("Es par");
            
        }
        else{
            System.out.println("Es impar");
    }
        
        
    }
    
}
