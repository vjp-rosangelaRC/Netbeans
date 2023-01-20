/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salario;

/**
 *
 * @author rdlrosac01
 */
public class SalarioClase {
    private String tipo; 
    private float salario;
    private float ventasMes;
    private float horasExtra;

    //Constructor por defecto
    public SalarioClase(){
        this.tipo = "";
        this.salario = 0;
        this.ventasMes = 0;
        this.horasExtra = 0;
    }
        
    // Constructor parametrizado
    public SalarioClase(String tipo, float salario, float ventasMes, float horasExtra) {
        this.tipo = tipo;
        this.salario = salario;
        this.ventasMes = ventasMes;
        this.horasExtra = horasExtra;
    }
    
    // Getters y setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getVentasMes() {
        return ventasMes;
    }

    public void setVentasMes(float ventasMes) {
        this.ventasMes = ventasMes;
    }

    public float getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(float horasExtra) {
        this.horasExtra = horasExtra;
    }
    
}
