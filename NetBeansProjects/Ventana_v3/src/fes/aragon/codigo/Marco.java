/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.codigo;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class Marco extends JFrame {

    public Marco() {
        this.setSize(400, 400);
        this.setLocationRelativeTo(this);
        this.setResizable(false);
        this.setTitle("Evento del Rato y teclado");
        Toolkit kit = Toolkit.getDefaultToolkit();
        Image img = kit.getImage(getClass().getResource("/fes/aragon/recursos/Puntero.png"));
        Cursor cursor = kit.createCustomCursor(img, new Point(10, 10), "fes");
        this.setCursor(cursor);
        Lamina lamina = new Lamina();
        this.add(lamina);
        lamina.setFocusable(true);
    }
}