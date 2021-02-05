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
public class Trabajador {

    private String numTrabajador;
    private String nombre;
    private int edad;
    private Responsabilidades responsabilidad;

    public Trabajador() {
    }

    public Trabajador(String numTrabajador, String nombre, int edad, Responsabilidades responsabilidad) {
        this.numTrabajador = numTrabajador;
        this.nombre = nombre;
        this.edad = edad;
        this.responsabilidad = responsabilidad;
    }

    public String getNumTrabajador() {
        return numTrabajador;
    }

    public void setNumTrabajador(String numTrabajador) {
        this.numTrabajador = numTrabajador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Responsabilidades getResponsabilidad() {
        return responsabilidad;
    }

    public void setResponsabilidad(Responsabilidades responsabilidad) {
        this.responsabilidad = responsabilidad;
    }

}
