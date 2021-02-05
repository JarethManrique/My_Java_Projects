/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.elementos;

import fes.aragon.interfaz.Acciones;
import fes.aragon.modelo.Comida;
import java.awt.Component;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Jareth Manrique
 */
public class Manzanas implements Acciones {

    private int x = 0;
    private int y = 0;
    private ArrayList<Comida> elementos = new ArrayList<>();
    private int diametro = 10;
    private int radio = 5;
    Random rd1 = new Random();
    Random rd2 = new Random();
    private MediaTracker tracker;
    private Image imagen = null;
    private Component componente;
    private static Manzanas objetoUnico;

    public static Manzanas getManzanas() {
        if (objetoUnico == null) {
            objetoUnico = new Manzanas();
        }
        return objetoUnico;
    }

    public Manzanas() {
    }

    public void nuevaManzana() {
        this.elementos.add(new Comida(rd1.nextInt(450), rd2.nextInt(300), x, y, radio, imagen));

    }

    public ArrayList<Comida> getElementos() {
        return elementos;
    }

    public void configurar(Component componente, String archivo) {
        this.componente = componente;
        tracker = new MediaTracker(componente);
        x = rd1.nextInt(450);
        y = rd2.nextInt(300);
        Toolkit herram = Toolkit.getDefaultToolkit();
        imagen = herram.getImage(getClass().getResource("/fes/aragon/recursos/" + archivo));
        tracker.addImage(imagen, 1);
        this.elementos.add(new Comida(x, y, x, y, radio, imagen));
        try {
            tracker.waitForAll();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void pintar(Graphics2D g) {
        if (elementos.size() > 0) {
            for (Comida elemento : elementos) {
                g.drawOval(elemento.getXx(), elemento.getYy(), 10, 10);
                g.drawImage(elemento.getImagen(), elemento.getXx(), elemento.getYy(), diametro, diametro, null);
            }
        }

    }

    @Override
    public void teclado(KeyEvent e) {

    }

    @Override
    public void raton(KeyEvent e) {

    }

    @Override
    public void calculos() {
        
    }
}
