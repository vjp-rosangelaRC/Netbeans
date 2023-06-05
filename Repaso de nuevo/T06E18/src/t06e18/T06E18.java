/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t06e18;

/**
 *
 * @author rdlrosac01
 */
public class T06E18 {

    /**
     * @param args the command line arguments
     */
    public static int[] unirarrays(int[] vector1, int[] vector2){
        int[] vector3 = new int[10];
        
        for (int i = 0; i < vector1.length; i++) {
            if(vector1[i] < vector2[i]){
                vector3[i] = vector1[i]; 
                
            }
        }
        
        return vector3;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int[] vector1 = new int[]{1,2,3,4,5};
        int[] vector2 = new int[]{6,7,8,9,10};
        
        
        
    }
    
}
