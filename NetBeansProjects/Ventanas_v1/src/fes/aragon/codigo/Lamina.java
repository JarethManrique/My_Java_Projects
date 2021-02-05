/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.codigo;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Random;
import javax.swing.JPanel;

/**
 *
 * @author Jareth Manrique
 */
public class Lamina extends JPanel{
    private Point[] circulos = new Point[60];
    private Dimension pantalla = null;

    public Lamina( Dimension pantalla) {
        this.pantalla=pantalla;
        creacionCirculos();
    }
    private void creacionCirculos(){
        Random rd = new Random();
        for (int i = 0; i < circulos.length; i++) {
            circulos[i] = new Point(rd.nextInt(pantalla.width), rd.nextInt(pantalla.height));
        }
    }

    @Override
    protected void printComponent(Graphics g) {
        super.printComponent(g);
        for (int i = 0; i < circulos.length; i++) {
            g.drawOval(circulos[i].x, circulos[i].y, 10, 10);
            if(i<circulos.length-1){
                g.drawLine(circulos[i].x+5, circulos[i].y+5, circulos[i+1].x+5, circulos[i+1].y+5);
            }
        }
        creacionCirculos();
    }
    
}
