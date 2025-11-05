/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopractico8.parte2.ej3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
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
        String nombreArchivo = "pruebaSSSS.txt";  // prueba.txt
        System.out.println("LECTURA DE UN ARCHIVO: Leer un archivo de texto y mostrarlo. \nManejar FileNotFoundException si el archivo no existe.");
        System.out.println("****************************************************\n");
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(nombreArchivo));
            System.out.println("Abriendo archivo '" + nombreArchivo + "'...");
            System.out.println(br.readLine());

        } catch (FileNotFoundException e) {
            System.out.println("*** ERROR: El archivo no existe ***");
        } catch (IOException ex) {
            System.out.println("Error de E/S");
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException ex) {
                    System.out.println("*** ERROR: No se pudo liberar el BufferedReader ***");
                }
            }
        }
    }
}
