/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.inicio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author Jareth Manrique
 */
public class Multiplicacion {

    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            File f = new File(System.getProperty("user.dir") + "/multiplicacion");
            fw = new FileWriter(f, true);
            PrintWriter pw = new PrintWriter(fw);
            String dato = JOptionPane.showInputDialog(null, "Dame un nùmero");
        int numUn = Integer.parseInt(dato);
        String cad;
        cad = "";
        int a = 1;
        while (a <= 10) {
            cad = cad + numUn + "x" + a + "=" + (numUn * a++) + "\n";
            }
        pw.println(cad);
        pw.println("-----------------------------------\n");
       pw.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                fw.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
}
}