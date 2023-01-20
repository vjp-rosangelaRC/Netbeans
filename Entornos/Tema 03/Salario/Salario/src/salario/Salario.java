/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salario;

import java.util.Scanner;

/**
 *
 * @author rdlrosac01
 */
public class Salario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner entrada = new Scanner(System.in);
    String tipo;
    float salarioEuros=0, ventasMes=0, horas=0, horasExtra = (salarioEuros * horas);  
    
    System.out.println("Introduzca el tipo:");
    tipo = entrada.nextLine();
    
    if (tipo == "vendedor"){
        salarioEuros = 1000;
        
    }
    else {
        if (tipo == "encargado"){
        salarioEuros = 1500;
            if (ventasMes >= 1000){ 
                salarioEuros = salarioEuros + 100;
            }
            else {
                if (ventasMes >= 1500){ 
                salarioEuros = salarioEuros + 200;
            }
            }
            
        }
    }
    }
}
