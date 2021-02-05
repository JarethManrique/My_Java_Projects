/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.inicio;

import fes.aragon.codigo.Marco;
import javax.swing.JFrame;

/**
 *
 * @author Jareth Manrique
 */

public class Inicio {

    public static void main(String[] args) {
        Marco app = new Marco();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}
