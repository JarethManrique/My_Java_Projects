/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.inicio;

import fes.aragon.codigo.Componentes;
import fes.aragon.codigo.TiroParabolico;
import javax.swing.JOptionPane;

/**
 *
 * @author Jareth Manrique
 */
public class Inicio {

    public static void main(String[] args) {
        TiroParabolico objetoUno = new TiroParabolico(30, 30);
        Componentes[] datos = objetoUno.calculoDeCompontes(3);
        
        for (Componentes objeto: datos){
            System.out.println(objeto.getTiempo()+";"+ objeto.getX()+";"+ objeto.getY());
            
        }
        
        JOptionPane.showMessageDialog(null, objetoUno.alturaMaxima());
        objetoUno.setGrado(45);
        JOptionPane.showMessageDialog(null, objetoUno.alturaMaxima());
    }
}
