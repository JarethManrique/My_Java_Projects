/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.inicio;

import fes.aragon.codigo.Limpieza;
import fes.aragon.codigo.Mantenimiento;
import fes.aragon.codigo.Trabajador;

/**
 *
 * @author Jareth Manrique
 */
public class Inicio {

    public static void main(String[] args) {
        Trabajador objetoUno = new Trabajador();
        objetoUno.setNumTrabajador("perro3");
        objetoUno.setNombre("pepe");
        objetoUno.setEdad(20);
        Limpieza lim = new Limpieza(1);
        objetoUno.setResponsabilidad(lim);
        System.out.println(objetoUno.getResponsabilidad().hacer());

        Mantenimiento man = new Mantenimiento(1);
        Trabajador objetoDos = new Trabajador("perro2", "ricardo", 20, man);
        System.out.println(objetoDos.getResponsabilidad().hacer());

    }
}
