/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.modelo;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 *
 * @author Jareth Manrique
 */
public class Datos {

    private int incremento;
    private PropertyChangeSupport cambio = new PropertyChangeSupport(this);
    
    public void oyenteCambio(PropertyChangeListener oyente) {
        cambio.addPropertyChangeListener(oyente);
    }
    
    public int getIncremento() {
        return incremento;
    }
    
    public void setIncremento(int incremento) {
        this.incremento = incremento;
        cambio.firePropertyChange("modelo.cambio", null, incremento);
    }
    
}
