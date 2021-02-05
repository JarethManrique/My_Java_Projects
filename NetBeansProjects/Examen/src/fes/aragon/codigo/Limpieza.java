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
public class Limpieza extends Responsabilidades {

    public Limpieza(int tipo) {
        super(tipo);
    }

    @Override
    public String hacer() {
        return "Limpieza";
    }

}
