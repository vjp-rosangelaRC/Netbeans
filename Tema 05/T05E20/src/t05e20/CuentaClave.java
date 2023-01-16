/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t05e20;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class CuentaClave extends Cuenta{
    // Variables específicas de CuentaClave
    private int clave;
    
    // Constructor por defecto
    CuentaClave (){
        super();
        clave = 0; 
    }
    
    //Constructor parametrizado
    CuentaClave(int saldo, int clave){
        super(saldo);
        this.clave = clave;
    }
    
    //Sobreescribir el método extraer. Solo se puede extrar si hay saldo fuciente
    //No funciona porque saldo es privado
    public void extraer(float dinero){
        if (getSaldo() > dinero){
            this.saldo = this.saldo - dinero;
            // setSaldo(getSaldo() - dinero); 
        }
        /*else{
            System.out.println("No hay saldo suficiente.");
        }*/
    } 
} 
    