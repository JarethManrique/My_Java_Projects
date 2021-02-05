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

/**
 *
 * @author gerar_9xpij6c
 */
public class Archivos {
    public static void main(String[] args) throws IOException {
        try {
            FileReader fr = null;
            
            File f = new File(System.getProperty("user.dir") + "/Presencia de Redes Sociales - Hoja 1.pdf");
            fr = new FileReader(f);
            BufferedReader bf = new BufferedReader(fr);
            String cad = "";
            
            while((cad = bf.readLine()) != null) {
            System.out.println(cad);
        }
        } catch(FileNotFoundException ex){
            ex.printStackTrace();
        }
        catch(IOException ex){
            ex.printStackTrace();
            
        }   
    }
}
