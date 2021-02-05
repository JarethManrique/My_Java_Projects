/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.pantalla;

import fes.aragon.interfaz.Acciones;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.Timer;
import javax.swing.JPanel;

/**
 *
 * @author Jareth Manrique
 */
public class Pantalla extends JPanel implements KeyListener {

    private ArrayList<Acciones> componente = new ArrayList<>();
    private Timer tiempo;

    public Pantalla(Timer tiempo) {
        this.addKeyListener(this);
        this.tiempo = tiempo;
    }

    public ArrayList<Acciones> getComponente() {
        return componente;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D gg = (Graphics2D) g;
        for (Acciones acciones : componente) {
            acciones.calculo();
            acciones.pintar(gg);
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int codigoTeclado = e.getKeyCode();
        if (codigoTeclado == KeyEvent.VK_P) {
            this.tiempo.stop();
        } else if (codigoTeclado == KeyEvent.VK_R) {
            this.tiempo.start();
        } else if (codigoTeclado == KeyEvent.VK_ESCAPE) {
            System.exit(0);
        }
        for (Acciones acciones : componente) {
            acciones.teclado(e);
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

}
