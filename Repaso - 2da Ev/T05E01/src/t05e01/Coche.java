/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t05e01;

/**
 *
 * @author Ross
 */
public class Coche {
    private char marca; 
    private char modelo;
    private char color;
    private int velocidad;
    private boolean motorEncendido;
    
     public Coche() {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.velocidad = velocidad;
        this.motorEncendido = false;
    }
     
    public Coche(char marca, char modelo, char color, int velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.velocidad = velocidad;
        this.motorEncendido = false;
    }

    
    
    
    public char getMarca() {
        return marca;
    }

    public void setMarca(char marca) {
        this.marca = marca;
    }

    public char getModelo() {
        return modelo;
    }

    public void setModelo(char modelo) {
        this.modelo = modelo;
    }

    public char getColor() {
        return color;
    }

    public void setColor(char color) {
        this.color = color;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public boolean isMotorEncendido() {
        return motorEncendido;
    }

    public void setMotorEncendido(boolean motorEncendido) {
        this.motorEncendido = motorEncendido;
    }
    
    public void arrancarCoche(){
        setMotorEncendido(true);
        setVelocidad(10);
    }
    
    public void apagarCoche(){
        setMotorEncendido(false);
        setVelocidad(0);
    }
    
    public void acelerarCoche (){
        setVelocidad(velocidad + 20);
    }
    
    public void frenarCoche(){
        setVelocidad(velocidad - 6);
    }
    
    public void obtenerEstado(){
        getColor();
        getMarca();
        getModelo();
        getVelocidad();
        isMotorEncendido();
    }

    @Override
    public String toString() {
        return "Coche{" + "marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", velocidad=" + velocidad + ", motorEncendido=" + motorEncendido + '}';
    }
    
    
    
    
}
