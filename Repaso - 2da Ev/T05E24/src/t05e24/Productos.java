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
public class Productos {
    private String fechaCadu; 
    private int numLote;

    public Productos(String fechaCadu, int numLote) {
        this.fechaCadu = fechaCadu;
        this.numLote = numLote;
    }
    
     public Productos() {
        this.fechaCadu = "";
        this.numLote = 0;
    }

    public String getFechaCadu() {
        return fechaCadu;
    }

    public void setFechaCadu(String fechaCadu) {
        this.fechaCadu = fechaCadu;
    }

    public int getNumLote() {
        return numLote;
    }

    public void setNumLote(int numLote) {
        this.numLote = numLote;
    }

    @Override
    public String toString() {
        return "Productos{" + "fechaCadu=" + fechaCadu + ", numLote=" + numLote + '}';
    }
     
     
    
    
}
