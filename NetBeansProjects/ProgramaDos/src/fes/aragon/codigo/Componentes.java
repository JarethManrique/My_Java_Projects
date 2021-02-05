/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.codigo;

/**
 *
 * @author Jareth Manrique
 */
public class Componentes {
    private float tiempo;
    private float x;
    private float y;

    public Componentes(float tiempo, float x, float y) {
        this.tiempo = tiempo;
        this.x = x;
        this.y = y;
    }

    public float getTiempo() {
        return tiempo;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }
    
}
