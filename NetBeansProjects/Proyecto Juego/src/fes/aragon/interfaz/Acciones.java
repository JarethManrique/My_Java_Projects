/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.interfaz;

import java.awt.Graphics2D;
import java.awt.event.KeyEvent;

/**
 *
 * @author Jareth Manrique
 */
public interface Acciones {

    public void pintar(Graphics2D g);

    public void teclado(KeyEvent e);

    public void raton(KeyEvent e);

    public void calculos();

}
