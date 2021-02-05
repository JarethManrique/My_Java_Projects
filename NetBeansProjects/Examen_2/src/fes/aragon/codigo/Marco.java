/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.codigo;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author Jareth Manrique
 */
public class Marco extends JFrame {

    private static final int ANCHURA = 500;
    private static final int ALTURA = 500;

    public Marco() {
        this.setSize(600, 350);
        this.setLocationRelativeTo(this);
        this.setTitle("Examen 2   -   Garfias Manrique Adán  Jareth");
        this.setResizable(false);
        Toolkit kit = Toolkit.getDefaultToolkit();
        Image img = kit.getImage(getClass().getResource("/fes/aragon/recursos/unamlogo.png"));
        this.setIconImage(img);
        Lamina lamina = new Lamina();
        add(lamina);
    }
}
