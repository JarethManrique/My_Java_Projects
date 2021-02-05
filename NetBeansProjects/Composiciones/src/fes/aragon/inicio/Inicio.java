/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.inicio;

import fes.aragon.codigo.OperacionesRacionales;
import fes.aragon.codigo.Racional;

/**
 *
 * @author Jareth Manrique
 */
public class Inicio {

    public static void main(String[] args) {
        Racional objUno = new Racional(1, 9);
        Racional objDos = new Racional(1, 5);
        OperacionesRacionales op = new OperacionesRacionales(objUno, objDos);
        Racional objTres = op.suma();
        System.out.println(objTres.toString());
        op.getRacionalUno().setDenominador(5);
        objTres = op.suma();
        System.out.println(objTres.toString());
        System.out.println(objUno.toString());
    }
}
