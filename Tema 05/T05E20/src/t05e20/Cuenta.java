/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t05e20;

/**
 *
 * @author Ross
 */
public class Cuenta {

    /**
     * @param args the command line arguments
     */
    // Declaro campos
    private float saldo;
  
    // Constructor por defecto
    // Esta se llama para el case 1
    public Cuenta(){
        this.saldo = 0;
    }
    
    // Constructor parametrizado
    // Este se llama para el case 2
    public Cuenta(float _saldo){
        this.saldo = _saldo;
    }
    
    // Getter / Obtener saldo    
    public float getSaldo() {
        return saldo;
    }
    
    // Setter. No se usa realmente. Preguntar si lo elimino. 
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    //Método ingresar. Añado el dinero que introduce el usuario y se lo sumo al saldo de la cuenta
    public void ingresar(float dinero){
        this.saldo = this.saldo + dinero;
    }
    
    // Método extraer
    public void extraer(float dinero){
        this.saldo = this.saldo - dinero;
    }  
}
