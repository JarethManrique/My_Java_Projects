/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.modelo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Jareth Manrique
 */
public class Archivos {

    private File archivo;
    private ArrayList<Alumno> datos;

    public Archivos(File archivo, ArrayList<Alumno> datos) {
        this.archivo = archivo;
        this.datos = datos;
    }

    public void almacenar() throws FileNotFoundException, IOException {
        FileOutputStream fs = new FileOutputStream(archivo.getAbsolutePath(), false);
        ObjectOutputStream os = new ObjectOutputStream(fs);
        os.writeObject(datos);
        os.close();
    }

    public void exportar() throws IOException {
        FileWriter fw = new FileWriter(archivo.getAbsolutePath(), false);
        PrintWriter salida = new PrintWriter(fw);
        for (Alumno dato : datos) {
            salida.print(dato.getNombre());
            salida.print(";");
            salida.print(String.valueOf(dato.getParciales()[0]));
            salida.print(";");
            salida.print(String.valueOf(dato.getParciales()[1]));
            salida.print(";");
            salida.print(String.valueOf(dato.getParciales()[2]));
            salida.print(";");
            salida.print(String.valueOf(dato.getCalificacion()));
            salida.println();
        }
        salida.close();

    }

    public ArrayList<Alumno> cargar() throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream fw = new FileInputStream(archivo.getAbsoluteFile());
        ObjectInputStream in = new ObjectInputStream(fw);
        ArrayList<Alumno> info = (ArrayList<Alumno>) in.readObject();
        return info;
    }
}
