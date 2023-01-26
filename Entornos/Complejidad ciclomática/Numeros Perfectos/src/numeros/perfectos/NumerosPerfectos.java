/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeros.perfectos;

/**
 *
 * @author rdlrosac01
 */
public class NumerosPerfectos {

    /**
     * @param args the command line arguments
     */
    
    public boolean esPerfecto(int j){
        int suma; 
        boolean resultado;
        int i;
        
        suma = 0;
        resultado=false;
        
        for (i = 1; i < j; i++){
            if (j%i == 0){
                suma = suma + i;
            }
        }
        
        if (suma == j){
            resultado = true;
        }
        return resultado;              
                
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
       
    }
    
}
