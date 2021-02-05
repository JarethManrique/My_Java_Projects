/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.codigo;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 *
 * @author Jareth Manrique
 */
public class EventoVentana implements WindowListener{

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("Abrendo");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Cerrando");
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("Cerrada");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Miniixar");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Maximizar");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("Activa");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("Desactivada");
    }
    
}
