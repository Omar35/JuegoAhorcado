/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUi;

//import BL.LeerDatos;
import BL.LeerDatos;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Prueba {

    public static void main(String[] args) {
   
        LeerDatos leer = new LeerDatos();
        leer.LeerDatos("Palabras.txt.txt");
        
        
    }
}
