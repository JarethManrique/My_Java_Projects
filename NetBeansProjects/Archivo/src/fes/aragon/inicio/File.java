/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.inicio;

/**
 *
 * @author Jareth Manrique
 */
public class File {

    public static void main(String[] args) {
        File f = new File("C://");
        File[] rutas = f.listFiles();
        for (File ruta : rutas) {
            if (ruta.isDirectory()){
                System.out.println("D " + ruta.getAbsolutePath());
            } else {
                System.out.println("A " + ruta.getAbsolutePath());
                ruta.delete();
            }
        }
        
    }
}
