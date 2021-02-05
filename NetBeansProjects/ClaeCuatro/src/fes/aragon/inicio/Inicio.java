/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.inicio;

import fes.aragon.codigo.Racional;

/**
 *
 * @author Jareth Manrique
 */
public class Inicio {
    public static void main(String[] args) {
        Racional objUno = new Racional(1, 3);
        Racional objDos = new Racional(objUno);
        Racional objTres = objUno;
        System.out.println(objUno.toString());
        System.out.println(objDos.toString());
        objUno.setNumerador(9);
        System.out.println(objDos.toString());
        System.out.println(objTres.toString());
        objDos.setNumerador(9);
        objUno.suma(objDos);
        System.out.println(objUno);
        Racional objCuatro = objUno.sumaObjeto(objDos);
        System.out.println(objCuatro);
    }
    
}
