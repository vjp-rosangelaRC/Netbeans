/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacion;

/**
 *
 * @author rdlrosac01
 */
public class refactoringexample {

    /**
     * @param args the command line arguments
     */
    private int x;
    private int y; 
    private int resultado;
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        int x=5, y=3, resultado;
        resultado=Operaciones.suma(x,y);
        mostrarResultado(resultado);
    }

    public static void mostrarResultado(int resultado) {
        System.out.println(resultado);
    }
    
    public static int restar(int x, int y){
        return x -y;
    }
    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }
    
}
public class Operaciones {

    public static int suma(int x, int y) {
        return x + y;
    }
    
}