package fes.aragon.inicio;

import javax.swing.JOptionPane;

public class Inicio {

    public static void main(String[] args) {
        String d1 = JOptionPane.showInputDialog(null, "Escribe un nùmero entero positivo");
        int n1 = Integer.parseInt(d1);
        String cad;
        cad = "";

        if (n1 % 2 == 0) {
            cad = cad + "El nùmero es par";
            JOptionPane.showMessageDialog(null, cad, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        } else {
            cad = cad + "El nùmero es impar";
            JOptionPane.showMessageDialog(null, cad, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }
    }

}
