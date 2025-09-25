/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico5.ejercicio08;

/**
 *
 * @author matut
 */
public class Documento {
    private String titulo;
    private String contenido;

    // constructor
    public Documento(String titulo, String contenido) {
        this.titulo = titulo;
        this.contenido = contenido;
    }
    
    // getters propios
    public String getTitulo() {
        return titulo;
    }

    public String getContenido() {
        return contenido;
    }
    
}
