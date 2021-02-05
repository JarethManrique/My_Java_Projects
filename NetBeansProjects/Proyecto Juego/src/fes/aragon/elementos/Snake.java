/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.elementos;

import fes.aragon.interfaz.Acciones;
import fes.aragon.modelo.Comida;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

/**
 *
 * @author Jareth Manrique
 */
public class Snake implements Acciones {

    private ArrayList<Point> cola = new ArrayList<Point>();
    private Point p;
    private int x = 0;
    private int y = 0;
    private int snakeX = 0;
    private int snakeY = 0;
    private int puntaX = 0;
    private int puntaY = 0;
    private int desplazamiento = 7;
    private Image imagen1 = null;
    private Image imagen2 = null;
    private Image imagen3 = null;
    private Image imagen4 = null;
    private MediaTracker tracker;
    private Component componente;
    private static Snake objetoUnico;
    private boolean arriba = false;
    private boolean abajo = false;
    private boolean izq = false;
    private boolean der = false;

    public static Snake getSnake() {
        if (objetoUnico == null) {
            objetoUnico = new Snake();
        }
        return objetoUnico;
    }

    public ArrayList<Point> getCola() {
        return cola;
    }

    public Snake() {

    }

    public void crecerSnake() {
        this.cola.add(0, new Point());
    }

    public void muevoSnake() {
        for (int n = cola.size() - 1; n > 0; n--) {
            cola.get(n).setLocation(cola.get(n - 1));
        }
        cola.get(0).x += snakeX;
        cola.get(0).y -= snakeY;
    }

    public void configurar(Component componente) {
        this.componente = componente;
        tracker = new MediaTracker(componente);
        Toolkit herram = Toolkit.getDefaultToolkit();
        imagen1 = herram.getImage(getClass().getResource("/fes/aragon/recursos/snakearr.png"));
        imagen2 = herram.getImage(getClass().getResource("/fes/aragon/recursos/snakeaba.png"));
        imagen3 = herram.getImage(getClass().getResource("/fes/aragon/recursos/snakeizq.png"));
        imagen4 = herram.getImage(getClass().getResource("/fes/aragon/recursos/snakeder.png"));
        tracker.addImage(imagen1, 1);
        tracker.addImage(imagen2, 2);
        tracker.addImage(imagen3, 3);
        tracker.addImage(imagen4, 4);

        try {
            tracker.waitForAll();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        x = this.componente.getWidth() / 2;
        y = this.componente.getHeight() / 2;

        puntaX = x + (imagen1.getWidth(componente) / 2);
        puntaY = y;
        snakeX = x;
        snakeY = y;
    }

    @Override
    public void pintar(Graphics2D g) {
        if (arriba == true) {
            g.drawOval(x + 5, y + 5, 7, 13);
            g.drawImage(imagen1, x, y, 20, 20, null);
            for (int n = 0; n < cola.size(); n++) {
                g.setColor(new Color(45, 150, 43));
                p = cola.get(n);
                g.fillRect(p.x = snakeX + 4, p.y = snakeY + 18, 11, 11);
            }
        } else if (abajo == true) {
            g.drawOval(x + 5, y, 7, 13);
            g.drawImage(imagen2, x, y, 20, 20, null);
            for (int n = 0; n < cola.size(); n++) {
                g.setColor(new Color(45, 150, 43));
                p = cola.get(n);
                g.fillRect(p.x = snakeX + 5, p.y = snakeY - 8, 11, 11);
            }
        } else if (izq == true) {
            g.drawOval(x + 5, y + 5, 13, 7);
            g.drawImage(imagen3, x, y, 20, 20, null);
            for (int n = 0; n < cola.size(); n++) {
                g.setColor(new Color(45, 150, 43));
                p = cola.get(n);
                g.fillRect(p.x = snakeX + 18, p.y = snakeY + 5, 11, 11);
            }
        } else if (der = true) {
            g.drawOval(x, y + 5, 13, 7);
            g.drawImage(imagen4, x, y, 20, 20, null);
            for (int n = 0; n < cola.size(); n++) {
                g.setColor(new Color(45, 150, 43));
                p = cola.get(n);
                g.fillRect(p.x = snakeX - 8, p.y = snakeY + 4, 11, 11);
            }
        }
    }

    @Override
    public void teclado(KeyEvent e) {
        int codigoTecla = e.getKeyCode();
        switch (codigoTecla) {
            case KeyEvent.VK_UP:
                this.arriba = true;
                this.abajo = false;
                this.izq = false;
                this.der = false;
                break;
            case KeyEvent.VK_DOWN:
                this.arriba = false;
                this.abajo = true;
                this.izq = false;
                this.der = false;
                break;
            case KeyEvent.VK_LEFT:
                this.arriba = false;
                this.abajo = false;
                this.izq = true;
                this.der = false;
                break;
            case KeyEvent.VK_RIGHT:
                this.arriba = false;
                this.abajo = false;
                this.izq = false;
                this.der = true;
                break;
        }

    }

    @Override
    public void raton(KeyEvent e) {
    }

    @Override
    public void calculos() {
        //DIRECCION Y BUCLE INFINITO
        if (arriba) {
            if (y > 5) {
                y -= desplazamiento;
            } else if (y < this.componente.getHeight() - 20) {
                y = this.componente.getHeight() + 10;
            }
        }
        if (abajo) {
            if (y < this.componente.getHeight() - 5) {
                y += desplazamiento;
            } else if (y < this.componente.getHeight() + 5) {
                y = -5;
            }
        }
        if (izq) {
            if (x > 5) {
                x -= desplazamiento;
            } else if (x < this.componente.getWidth() - 20) {
                x = this.componente.getWidth() + 10;
            }
        }
        if (der) {
            if (x < this.componente.getWidth() - 5) {
                x += desplazamiento;
            } else if (x < this.componente.getWidth() + 5) {
                x = -5;
            }
        }
        puntaX = x + (imagen1.getWidth(componente) / 2);
        puntaY = y;
        snakeX = x;
        snakeY = y;

        //COLISION
        Manzanas manzanas = Manzanas.getManzanas();
        for (Comida elemento : manzanas.getElementos()) {
            int x1x2 = (int) Math.pow((x - elemento.getXx()), 2);
            int y1y2 = (int) Math.pow((y - elemento.getYy()), 2);
            int distancia = (int) Math.sqrt(x1x2 + y1y2);
            //System.out.println(distancia);
            if (distancia <= 10) {
                elemento.setEliminar(true);
                elemento.setQuienElimino("Snake");
                crecerSnake();
                muevoSnake();
            }
        }
    }
}
