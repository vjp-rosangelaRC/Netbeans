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
public class Rueda {

    private String material;
    private int pulgadas;
    
    public void establecerMaterial(String _material){
        material = _material;
    } 
    
    public void establecerPulgadas(int _pulgadas){
        pulgadas = _pulgadas;
    }
    
    public String obtenerMaterial(){
        return material;
    }
    
    public int obtenerPulgadas(){
        return pulgadas;
    }
    /**
     * @param args the command line arguments
     */
    
    
    
}
