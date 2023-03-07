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
public class ProductosCongelados extends Productos{
    private int tempRecomendada; 

    public ProductosCongelados(int tempRecomendada, String fechaCadu, int numLote) {
        super(fechaCadu, numLote);
        this.tempRecomendada = tempRecomendada;
    }

    public ProductosCongelados() {
        
        super();
        this.tempRecomendada = 0;
    }

    public int getTempRecomendada() {
        return tempRecomendada;
    }

    public void setTempRecomendada(int tempRecomendada) {
        this.tempRecomendada = tempRecomendada;
    }
    
}
