/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t05e16;

/**
 *
 * @author Ross
 */
public class Alumno {
    private String nombre;
    private int nota;

    public Alumno(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
        this.checkNota();
    }

    public String getNombre() {
        return nombre;
    }

    public int getNota() {
        return nota;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
    
    public void checkNota(){
        if(this.nota <0 || this.nota > 10){
            System.out.println("Constructor: La nota de "+ this.nombre +" no es válida.");
        }
    }
    
    public String getCalificacion(){
        String result = "";
        if(this.nota >= 0 && this.nota <= 4){
            result = this.nombre +": Suspenso";
        }else{
            switch(this.nota){
                    case(5):
                    case(6):
                        result = this.nombre +": Bien";
                        break;
                    case(7):
                    case(8):
                        result = this.nombre +": Notable";
                        break;
                    case(9):
                    case(10):
                        result = this.nombre +": Sobresaliente";
                        break;
                    default:
                        result = this.nombre +": La nota no es válida";
                        break;
            }
        }
        return result;
    }
    
}
