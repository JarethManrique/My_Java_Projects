/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.modelo;

import com.sun.xml.internal.ws.developer.Serialization;
import java.io.Serializable;

/**
 *
 * @author Jareth Manrique
 */
public class Alumno implements Serializable {

    private String nombre;
    private float[] parciales = new float[3];
    private float calificacion;

    public Alumno(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float[] getParciales() {
        return parciales;
    }

    public void setParciales(float[] parciales) {
        this.parciales = parciales;
    }

    public float getCalificacion() {
        float suma = 0;
        for (int i = 0; i < parciales.length; i++) {
            suma += parciales[i];
        }
        this.calificacion = suma / parciales.length;
        return calificacion;
    }

    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion;
    }

}
