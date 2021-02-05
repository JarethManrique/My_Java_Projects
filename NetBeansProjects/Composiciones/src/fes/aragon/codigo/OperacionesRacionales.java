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
public class OperacionesRacionales {

    private Racional racionalUno;
    private Racional racionalDos;

    public OperacionesRacionales(Racional racionalUno, Racional racionalDos) {
        this.racionalUno = racionalUno;
        this.racionalDos = racionalDos;
    }

    public Racional suma() {
        int numerador = this.racionalUno.getNumerador() * this.racionalDos.getDenominador() + (this.racionalUno.getDenominador() * this.racionalDos.getNumerador());
        int denominador = this.racionalUno.getDenominador() * this.racionalDos.getDenominador();
        return new Racional(numerador, denominador);
    }

    public Racional getRacionalUno() {
        return racionalUno;
    }

    public Racional getRacionalDos() {
        return racionalDos;
    }

}
