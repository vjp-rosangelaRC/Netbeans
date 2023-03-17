/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t11e03;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author rdlrosac01
 */
public class Autobuses {
    private int matriculas;
    private Conductores conductor;

    public int getMatriculas() {
        return matriculas;
    }

    public void setMatriculas(int matriculas) {
        this.matriculas = matriculas;
    }

    public Autobuses(int matriculas) {
        this.matriculas = matriculas;
        Conductores conductor = new Conductores();
    }
    
     public Autobuses() {
        this.matriculas = 0;
        Conductores conductor = new Conductores();
    }

    public Conductores getConductor() {
        return conductor;
    }

    public void setConductor(Conductores conductor) {
        this.conductor = conductor;
    }
    
    public void guardarConductores(){
        Map<Integer, Conductores> mapa = new HashMap<>();
                
        for (int i = 0; i < mapa.size(); i++) {
            conductor.datosConductor();
            mapa.put(mapa.size(), conductor);
        }
        
    }

    @Override
    public String toString() {
        return "Autobuses{" + "matriculas=" + matriculas + ", conductor=" + conductor + '}';
    }
    
    
}
