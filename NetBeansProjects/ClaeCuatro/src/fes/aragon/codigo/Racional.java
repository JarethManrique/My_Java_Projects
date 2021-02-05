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
public class Racional {

    private int numerador;
    private int denominador;

    public Racional(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public Racional(Racional racional) {
        this.numerador = racional.getNumerador();
        this.denominador = racional.getDenominador();
        
    }
    public void suma(int numerador, int denominador){
        this.numerador = (this.numerador * denominador) + (this.denominador * numerador);
        this.denominador = (this.denominador * denominador);
    }
    public void suma(Racional racional) {
        this.numerador = (this.numerador * racional.getDenominador()) + (this.denominador * racional.getNumerador());
        this.denominador= (this.denominador * racional.getDenominador());
    }
    public Racional sumaObjeto(Racional racional) {
        this.numerador = (this.numerador * racional.getDenominador()) + (this.denominador * racional.getNumerador());
        this.denominador= (this.denominador * racional.getDenominador());
        return new Racional(this.numerador,this.denominador);
    }
    
    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    @Override
    public String toString() {
        return this.numerador + "/"+ this.denominador;
    }
    
}
