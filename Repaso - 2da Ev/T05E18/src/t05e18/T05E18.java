/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t05e18;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T05E18 {

    /**
     * @param args the command line arguments
     */
    public static int pedirN (){
        Scanner entrada = new Scanner(System.in); 
        int n; 
        n = entrada.nextInt(); 
        return n;
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Numero n1 = new Numero(pedirN());
        Numero n2 = new Numero(pedirN());
        int opc; 
        
        do{
            System.out.println("Opcion");
            opc = pedirN(); 
            switch(opc){
                case 1:{
                    int resul = n1.getValor() + n2.getValor();
                    System.out.println(resul);
                    break;
                }
                case 2:{
                    int resul = n1.getValor() - n2.getValor();
                    System.out.println(resul);
                    break;
                }
                
                case 3:{
                    int resul = n1.getValor() * n2.getValor();
                    System.out.println(resul);
                    break;
                }
                
                case 4:{
                    int resul;
                    try{
                         resul = n1.getValor() / n2.getValor();
                    }
                    catch (Exception e){
                         resul = 0;
                    }
                    
                    System.out.println(resul);
                    break;
                }
            }
            
        }while (opc != 5);
        
        
    }
    
}
