/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon;

/**
 *
 * @author Jareth Manrique
 */
import java.util.ArrayList;

public class Palindromo {
private ArrayList<String> hora = new ArrayList<>();

    public void setHora(ArrayList<String> hora) {
        this.hora = hora;
        hora.add(0, "00:00");
    }

    public static void main(String[] args) {
        
        String[] cadenas = {"00:00"};
        for (String cadena : cadenas) {
            if (esPalindromo(cadena) == true) {
                System.out.println(cadena + " es palíndromo ");
            }
        }
    }

    public static boolean esPalindromo(String cadena) {

        String invertida = new StringBuilder(cadena).reverse().toString();
        return invertida.equals(cadena);
    }
}
