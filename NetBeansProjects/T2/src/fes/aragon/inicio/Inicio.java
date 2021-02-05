package fes.aragon.inicio;

import javax.swing.JOptionPane;

public class Inicio {

    public static void main(String[] args) {

        String dato = JOptionPane.showInputDialog(null, "Dame un nùmero");
        int numUno = Integer.parseInt(dato);
        String cad;
        cad = "";
        int i = 1;
        do {
            cad = cad + numUno + "x" + i + "=" + (numUno * i++) + "\n";
            JOptionPane.showMessageDialog(null, cad, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        } while (i <= 10);
    }
}
