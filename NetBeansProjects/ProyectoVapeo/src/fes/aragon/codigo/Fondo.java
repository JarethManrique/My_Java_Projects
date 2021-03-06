/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.codigo;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author Jareth Manrique
 */
public class Fondo extends JPanel {

    private Image imagen = null;
    private MediaTracker tracker;

    public Fondo(Component componente) {
        try {
            tracker = new MediaTracker(componente);
            Toolkit hr = Toolkit.getDefaultToolkit();
            imagen = hr.getImage(getClass().getResource("/fes/aragon/recursos/fondo.png"));
            tracker.addImage(imagen, 1);
            tracker.waitForAll();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
        g.drawImage(imagen, 0, 0, this.getSize().width,this.getSize().height,null);
    }

}
