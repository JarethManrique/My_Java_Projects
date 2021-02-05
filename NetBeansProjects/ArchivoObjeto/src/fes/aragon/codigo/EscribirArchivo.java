/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.codigo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jareth Manrique
 */
public class EscribirArchivo {

    public static void main(String[] args) {
        FileOutputStream fw = null;
        try {
            File f = new File(System.getProperty("user.dir") + "/archivo");
            fw = new FileOutputStream(f);
            ObjectOutput os = new ObjectOutputStream(fw);
            os.writeObject(new Persona("José", "Madero", "Vizcaíno", 40));
            os.writeObject(new Persona("Ricardo", "Treviño", "Chapa", 40));
            os.writeObject(new Persona("Jorge", "Vazquez", "Martinez", 40));
            os.writeObject(new Persona("Arturo", "Arredondo", "Treviño", 39));

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
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
