/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopractico5.ejercicio03;

/**
 *
 * @author matut
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Editorial editorial1 = new Editorial("Penguin Books", "Av Siempreviva 72");
        Autor autor1 = new Autor("Murakami Haruki", "Japón");
        Libro book1 = new Libro("Tokyo Blues", "A451-4511-5414111", autor1, editorial1);
        
        // ASOCIACION 1 A 1 UNIDIRECCIONAL LIBRO -> AUTOR
        book1.setAutor(autor1);
        book1.mostrarAutor();
        
        System.out.println("");
        // AGREGACION 1 A 1 LIBRO -> EDITORIAL
        book1.mostrarEditorial();
    }
    
}
