/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t05e24;

/**
 *
 * @author Ross
 */
public class ProductosRefrigerados extends Productos{
    private int codSuperAli;

    public ProductosRefrigerados(int codSuperAli, String fechaCadu, int numLote) {
        super(fechaCadu, numLote);
        this.codSuperAli = codSuperAli;
    }

    public ProductosRefrigerados() {
        super();
        this.codSuperAli = 0;
    }

    public int getCodSuperAli() {
        return codSuperAli;
    }

    public void setCodSuperAli(int codSuperAli) {
        this.codSuperAli = codSuperAli;
    }
    
}
