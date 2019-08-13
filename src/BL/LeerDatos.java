package BL;

import java.io.*;

public class LeerDatos {

    File archivo = null;
    FileReader leerArchivo = null;
    BufferedReader leerTxt = null;

    public void leerArchivo() {
        try {
            archivo = new File("C:\\Palabras.txt");
            leerArchivo = new FileReader(archivo);
            String linea;
            while((linea = leerTxt.readLine() != null)) {
                System.out.println("");
            }

        } catch (Exception e) {
            System.out.println("No se encontro el archivo");
        }
    }
}
