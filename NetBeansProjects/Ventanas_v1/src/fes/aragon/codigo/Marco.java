/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.codigo;

import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author Jareth Manrique
 */
public class Marco extends JFrame{
    private static final int ANCHURA = 300;
    private static final int ALTURA = 300;

    public Marco() throws HeadlessException {
        this.setSize(ANCHURA, ALTURA);
        this.setLocationRelativeTo(this);
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension pantalla = kit.getScreenSize();
        int altura = pantalla.height;
        int anchura = pantalla.width;
        this.setSize(anchura/2, altura/2);
        this.setLocation(anchura/4, altura/4);
        Image img = kit.getImage(getClass().getResource("/fes/aragon/recursos/download.png"));
        this.setIconImage(img);
        this.setTitle("Programacion en Swing");
        Lamina lamina = new Lamina(new Dimension(anchura/2, altura/2));
        this.add(lamina);
        EventoVentana oyente = new EventoVentana();
        this.addWindowListener(oyente);
    }
        
}
