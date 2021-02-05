package fes.aragon.inicio;

import javax.swing.JOptionPane;

public class Inicio {

    public static void main(String[] args) {
        String d1 = JOptionPane.showInputDialog(null, "Escribe el primer nùmero");
        int n1 = Integer.parseInt(d1);
        String d2 = JOptionPane.showInputDialog(null, "Escribe el segundo nùmero");
        int n2 = Integer.parseInt(d2);
        String d3 = JOptionPane.showInputDialog(null, "Escribe el tercer nùmero");
        int n3 = Integer.parseInt(d3);
        String cad;
        cad = "";

        if (n1 > n2 && n2 > n3) {
            cad = cad + "Numero mayor: " + n1 + "\n" + "Numero de en medio: " + n2 + "\n" + "Numero menor: " + n3 + "\n";
            JOptionPane.showMessageDialog(null, cad, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        } else if (n1 > n3 && n3 > n2) {
            cad = cad + "Numero mayor: " + n1 + "\n" + "Numero de en medio: " + n3 + "\n" + "Numero menor: " + n2 + "\n";
            JOptionPane.showMessageDialog(null, cad, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        } else if (n2 > n1 && n1 > n3) {
            cad = cad + "Numero mayor: " + n2 + "\n" + "Numero de en medio: " + n1 + "\n" + "Numero menor: " + n3 + "\n";
            JOptionPane.showMessageDialog(null, cad, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        } else if (n2 > n3 && n3 > n1) {
            cad = cad + "Numero mayor: " + n2 + "\n" + "Numero de en medio: " + n3 + "\n" + "Numero menor: " + n1 + "\n";
            JOptionPane.showMessageDialog(null, cad, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        } else if (n3 > n1 && n1 > n2) {
            cad = cad + "Numero mayor: " + n3 + "\n" + "Numero de en medio: " + n1 + "\n" + "Numero menor: " + n2 + "\n";
            JOptionPane.showMessageDialog(null, cad, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        } else if (n3 > n2 && n2 > n1) {
            cad = cad + "Numero mayor: " + n3 + "\n" + "Numero de en medio: " + n2 + "\n" + "Numero menor: " + n1 + "\n";
            JOptionPane.showMessageDialog(null, cad, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
