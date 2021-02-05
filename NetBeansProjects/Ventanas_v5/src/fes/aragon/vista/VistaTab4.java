/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.vista;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.JPanel;

/**
 *
 * @author Jareth Manrique
 */
public class VistaTab4 extends JPanel implements PropertyChangeListener {

    private int compartir;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
        Graphics2D gg = (Graphics2D)g;
        gg.setColor(new Color(150,230,50,compartir));
        gg.fill3DRect(150, 70, compartir, compartir,true);

    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if (evt.getPropertyName().equals("modelo.cambio")) {
            this.compartir = (int) evt.getNewValue();
            repaint();
        }
    }

}
