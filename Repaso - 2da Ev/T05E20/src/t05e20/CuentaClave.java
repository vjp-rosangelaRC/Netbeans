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
public class CuentaClave extends Cuenta{
    private int clave; 

    public CuentaClave(int clave, int saldo) {
        super(saldo);
        this.clave = clave;
    }

    public CuentaClave(int clave) {
        this.clave = clave;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    @Override
    public void extraer(float c) {
        if (getSaldo() > c){
            setSaldo((int) (getSaldo() - c));
        }
        else{
            System.out.println("error");
        }
    }
    
    
    
    
}
