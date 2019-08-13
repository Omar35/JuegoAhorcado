package BL;

import java.io.*;

public class LeerDatos {

    public void LeerDatos(String nombreArchivo) {
        File archivo = null;
        FileReader leerArchivo = null;
        BufferedReader leerTxt = null;
        RandomAccessFile Randon = null;

        try {
            archivo = new File("Palabras.txt.txt");
            leerArchivo = new FileReader(archivo);
            leerTxt = new BufferedReader(leerArchivo);
            Randon = new RandomAccessFile("Palabras.txt.txt", "rw");
            String linea;
            while ((linea = leerTxt.readLine()) != null) {
                System.out.println(linea);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
