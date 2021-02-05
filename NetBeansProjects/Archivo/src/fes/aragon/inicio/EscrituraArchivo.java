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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jareth Manrique
 */
public class EscrituraArchivo {

    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            File f = new File(System.getProperty("user.dir") + "/perro");
            fw = new FileWriter(f, true);
            PrintWriter pw = new PrintWriter(fw);
            for (int i = 0; i < 10; i++) {
            pw.println("Linea en Java");
            pw.println("Borré la información");
            }
            
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
