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
    private float saldo; 

    public Cuenta(int saldo) {
        this.saldo = saldo;
    }
    
    public Cuenta() {
        this.saldo = 0;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    public void ingresar(float c){
        this.saldo = this.saldo + c;
    }
    
    public void extraer(float c){
        this.saldo = this.saldo - c;
    }
   
    
    
    
    
}
