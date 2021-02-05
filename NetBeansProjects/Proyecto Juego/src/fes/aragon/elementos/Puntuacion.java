/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.elementos;

import fes.aragon.interfaz.Acciones;
import fes.aragon.modelo.Comida;
import java.awt.Color;
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
    private int score = 0;

    public Puntuacion(JPanel panel) {
        this.panel = panel;
    }

    @Override
    public void pintar(Graphics2D g) {
        g.setColor(Color.WHITE);
        g.setFont(new Font("MV Boli", Font.BOLD, 20));
        g.drawString("Score: " + score, 5, 20);

    }

    @Override
    public void teclado(KeyEvent e) {

    }

    @Override
    public void raton(KeyEvent e) {

    }

    @Override
    public void calculos() {
        Manzanas manzanas = Manzanas.getManzanas();
        if (manzanas.getElementos().size() >= 1) {
            for (Comida elemento : manzanas.getElementos()) {
                if (elemento.getQuienElimino().equals("Snake")) {
                    score += 1;
                }
            }
            Iterator iterador = manzanas.getElementos().iterator();
            while (iterador.hasNext()) {
                Comida objeto = (Comida) iterador.next();
                if (objeto.isEliminar()) {
                    iterador.remove();
                }
            }
        }
        if(manzanas.getElementos().size()==0){
            manzanas.nuevaManzana();
        }
    }

}
