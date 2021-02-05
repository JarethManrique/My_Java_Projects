/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.modelo;

import java.awt.Image;

/**
 *
 * @author Jareth Manrique
 */
public class Comida {

    private int xx;
    private int yy;
    private int cx;
    private int cy;
    private int radio;
    private boolean eliminar = false;
    private String quienElimino = "Nadie";
    private Image imagen;

    public Comida(int xx, int yy, int cx, int cy, int radio,Image imagen) {
        this.xx = xx;
        this.yy = yy;
        this.cx = cx;
        this.cy = cy;
        this.radio = radio;
        this.imagen=imagen;
    }

    public Image getImagen() {
        return imagen;
    }

    public void setImagen(Image imagen) {
        this.imagen = imagen;
    }
    

    public int getXx() {
        return xx;
    }

    public void setXx(int xx) {
        this.xx = xx;
    }

    public int getYy() {
        return yy;
    }

    public void setYy(int yy) {
        this.yy = yy;
    }

    public int getCx() {
        return cx;
    }

    public void setCx(int cx) {
        this.cx = cx;
    }

    public int getCy() {
        return cy;
    }

    public void setCy(int cy) {
        this.cy = cy;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public boolean isEliminar() {
        return eliminar;
    }

    public void setEliminar(boolean eliminar) {
        this.eliminar = eliminar;
        
    }

    public String getQuienElimino() {
        return quienElimino;
    }

    public void setQuienElimino(String quienElimino) {
        this.quienElimino = quienElimino;
    }

}
