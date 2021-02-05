package fes.aragon;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Jareth Manrique
 */
public class CopiarBytes {

    public static void main(String[] args) {
        try {
            CopiarBytes cp = new CopiarBytes();
            cp.copiarArchivo();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private void copiarArchivo() throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("C://Users/Jareth Manrique/Downloads/Entrada Y Salida De Ficheros.pdf");
            out = new FileOutputStream("C://Users//Jareth Manrique//Documents");
            int c;
            //lectura del flujo de bytes hasta que nos proporcionen -1
            while ((c = in.read()) != -1) {
                //escribiendo el flujo de bytes
                System.out.println("Entero: ");
                out.write(c);
            }

        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
