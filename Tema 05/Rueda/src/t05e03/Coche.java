/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t05e03;

/**
 *
 * @author Ross
 */
public class Coche {
    private String marca;
    private String modelo;
    private Rueda rueda;
    
    public void establecerMarca(String _marca){
        marca = _marca;
    } 
    
    public void establecerModelo(String _modelo){
        modelo = _modelo;
    }
    
    public String obtenerMarca(){
        return marca;
    }
    
    public String obtenerModelo(){
        return modelo;
    }
    
    public void establecerRueda(Rueda _rueda){
        rueda = _rueda;
    }
    
    public Rueda obtenerRueda(){
        return rueda;
    }
}
