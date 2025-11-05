/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopractico8.parte2.ej5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author matut
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombreArchivo = "pruebaSSSS.txt"; // prueba.txt
        System.out.println("USO DE TRY-WITH-RESOURCES\nLeer un archivo con BufferedReader usando try-with-resources. Manejar IOException correctamente.");
        System.out.println("****************************************************\n");

        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            System.out.println("Abriendo archivo '" + nombreArchivo + "'...");
            System.out.println(br.readLine());
        } catch (IOException ex) {
            System.out.println("*** ERROR DE E/S: " + ex.getMessage() + " ***");
        }
    }
}
