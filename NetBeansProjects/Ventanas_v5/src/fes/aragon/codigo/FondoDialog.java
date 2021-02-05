/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.codigo;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
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
public class FondoDialog extends JPanel {

    private Image imagen = null;
    private MediaTracker tracker;
    private boolean cambio = false;
    private final int maximo = 255;
    private int transparencia = maximo;

    public FondoDialog(Component componente, String archivo) {
        try {
            tracker = new MediaTracker(componente);
            Toolkit hr = Toolkit.getDefaultToolkit();
            imagen = hr.getImage(getClass().getResource("/fes/aragon/recursos/gif.gif"));
            tracker.addImage(imagen, 1);
            tracker.waitForAll();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
        g.drawImage(imagen, 0, 0, this.getSize().width, this.getSize().height, null);
        g.setFont(new Font("Times New Roman", Font.PLAIN,40));
        g.setColor(new Color(255,255,255,transparencia));
        g.drawString("PXNDX", 120, 40);
        this.calculos();
    }

    private void calculos() {
        if (cambio){
            transparencia++;
            if(transparencia==maximo){
                cambio=false;
            }
        }else{
            transparencia--;
            if(transparencia==0){
                cambio=true;
            }
        }
    }
}
