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
    CuentaClave(float saldo, int clave){
        super(saldo);
        this.clave = clave;
    }
    
    // Tengo que crear un método para establecer la clave dentro de la 
    //clase principal. Uso los getters y setters para eso. 
    //Setters y getters de Clave
    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }
        
    //Sobreescribir el método extraer. Solo se puede extrar si hay saldo fuciente
    //No funciona porque saldo es privado
    // Para sobreescribir un método se usa @Override. Para sobreescribir el nombre dede ser igual
    @Override
    public void extraer(float dinero){
        if (getSaldo() >= dinero){
            // De esta manera no funciona
            // this.saldo = this.saldo - dinero;
            setSaldo(getSaldo() - dinero); 
            super.extraer(dinero);
        }
        /*else{
            System.out.println("No hay saldo suficiente.");
        }*/
    } 
    // Podemos usar super para reutilizar el código del método de la clase padre
    /* super.extraer(); 
    y me ejecuta el extraer de la clase principal*/ 
} 
    