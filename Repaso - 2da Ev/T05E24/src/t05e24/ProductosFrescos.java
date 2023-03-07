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
public class ProductosFrescos extends Productos{
    private String fechaEnvasado;
    private String paisOrigen;

    public ProductosFrescos(String fechaEnvasado, String paisOrigen, String fechaCadu, int numLote) {
        super(fechaCadu, numLote);
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
    }

    public ProductosFrescos() {
        super();
        this.fechaEnvasado = "";
        this.paisOrigen = "";
    }

    public String getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(String fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    @Override
    public String toString() {
        return "ProductosFrescos{" + "fechaEnvasado=" + fechaEnvasado + ", paisOrigen=" + paisOrigen + '}';
    }
    
    
    
    
}
