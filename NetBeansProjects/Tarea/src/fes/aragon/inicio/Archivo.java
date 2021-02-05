/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.inicio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Jareth Manrique
 */
public class Archivo {

    public static void main(String[] args) {
        FileReader fr = null;
        try {
            File f = new File(System.getProperty("user.dir") + "/multiplicacion");
            fr = new FileReader(f);
            BufferedReader bf = new BufferedReader(fr);
            String cad = "";

            while ((cad = bf.readLine()) != null) {
                System.out.println(cad);
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                fr.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

}
