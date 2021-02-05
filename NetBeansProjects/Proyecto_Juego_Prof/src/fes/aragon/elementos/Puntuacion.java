/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.elementos;

import fes.aragon.interfaz.Acciones;
import fes.aragon.modelo.Burbuja;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import javax.swing.JPanel;

/**
 *
 * @author Jareth Manrique
 */
public class Puntuacion implements Acciones {

    private JPanel panel;
    private int nave = 0;
    private int burbuja = 0;

    public Puntuacion(JPanel panel) {
        this.panel = panel;
    }

    @Override
    public void pintar(Graphics2D g) {
        g.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        g.drawString("Nave: " + nave, 0, 20);
        g.drawString("Burbuja: " + burbuja, 300, 20);
    }

    @Override
    public void teclado(KeyEvent e) {
    }

    @Override
    public void raton(KeyEvent e) {
    }

    @Override
    public void calculo() {
        Burbujas burbujas = Burbujas.getBurbujas();
        if (burbujas.getElementos().size() > 1) {
            for (Burbuja elemento : burbujas.getElementos()) {
                if (elemento.getQuienElimino().equals("nave")) {
                    nave += 1;
                } else if (elemento.getQuienElimino().equals("burbuja")) {
                    burbuja += 1;
                }
            }
            Iterator iterador = burbujas.getElementos().iterator();
            while (iterador.hasNext()) {
                Burbuja objeto = (Burbuja) iterador.next();
                if (objeto.isEliminar()) {
                    iterador.remove();
                }
            }
        } else {
            burbujas.configurar(this.panel, "burbuja_final.png");
        }
    }
}
