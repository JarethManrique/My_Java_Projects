/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Random;

public class Frutita {

    private Random random;
    private Point frutita;

    public Frutita() {
        random = new Random();
        frutita = new Point();
    }

    public void nuevaFrutita() {
        frutita.x = random.nextInt(39);
        frutita.y = random.nextInt(28) + 1;
    }

    public void dibujoFrutita(Graphics g) {
        g.setColor(Color.RED);
        g.fillOval(frutita.x * 20, frutita.y * 20, 20, 20);
    }

    public Point getFrutita() {
        return frutita;
    }

}
