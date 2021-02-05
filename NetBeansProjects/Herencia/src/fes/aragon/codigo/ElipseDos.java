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
public class ElipseDos extends FiguraDos {

    private double ejeUno;
    private double ejeDos;

    public ElipseDos(double ejeUno, double ejeDos, double x, double y) {
        super(x, y);
        this.ejeUno = ejeUno;
        this.ejeDos = ejeDos;
    }

    public double getEjeUno() {
        return ejeUno;
    }

    public void setEjeUno(double ejeUno) {
        this.ejeUno = ejeUno;
    }

    public double getEjeDos() {
        return ejeDos;
    }

    public void setEjeDos(double ejeDos) {
        this.ejeDos = ejeDos;
    }

    @Override
    public double area() {
        return Math.PI * ejeUno * ejeDos;
    }
    
    
}
