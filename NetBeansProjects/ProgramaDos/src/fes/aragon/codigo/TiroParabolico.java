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
public class TiroParabolico {

    private float velocidadInicial;
    private int grado;
    private final float gravedad = 9.8f;

    public TiroParabolico() {
    }

    public TiroParabolico(float velocidadInicial, int grado) {
        this.velocidadInicial = velocidadInicial;
        this.grado = grado;
    }

    public float alturaMaxima() {
        float voy = (float) (this.velocidadInicial * Math.sin(Math.toRadians(grado)));
        float tiempo = voy / this.gravedad;
        float y = (float) (voy * tiempo - (4.9f * Math.pow(tiempo, 2)));

        return y;
    }

    public float alcance() {
        return 0.0f;
    }

    public Componentes[] calculoDeCompontes(int t) {
        int elementos = (int) (t / 0.1);
        Componentes[] valores = new Componentes[elementos + 1];
        int indice = 0;
        float x = 0.0f;
        float y = 0.0f;

        for (float i = 0; i <= t; i += 0.1) {
            x = (float) (velocidadInicial * Math.cos(Math.toRadians(grado)) * i);
            y = (float) (velocidadInicial * Math.sin(Math.toRadians(grado)) + (0.5 * -gravedad * Math.pow(i, 2)));

            Componentes obj = new Componentes(i, x, y);
            valores[indice] = obj;
            indice++;

        }
            return valores ;
    }
    public float getVelocidadInicial() {
        return velocidadInicial;
    }

    public void setVelocidadInicial(float velocidadInicial) {
        this.velocidadInicial = velocidadInicial;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

}
