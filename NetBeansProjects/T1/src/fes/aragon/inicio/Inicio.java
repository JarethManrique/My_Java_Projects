package fes.aragon.inicio;

import javax.swing.JOptionPane;

public class Inicio {

    public static void main(String[] args) {
        String dato = JOptionPane.showInputDialog(null, "Dame un nùmero");
        int numUn = Integer.parseInt(dato);
        String cad;
        cad = "";
        int a = 1;
        while (a <= 10) {
            cad = cad + numUn + "x" + a + "=" + (numUn * a++) + "\n";
            JOptionPane.showMessageDialog(null, cad, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
