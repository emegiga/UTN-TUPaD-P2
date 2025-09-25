/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico5.ejercicio11;

/**
 *
 * @author matut
 */
public class Cancion {
    private String titulo;
    private Artista artista;

    public Cancion(String titulo) {
        this.titulo = titulo;
    }
    
    // getter y setter Artista
    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public Artista getArtista() {
        return artista;
    }
    
    
    // mostrar artista
    public void mostrarArtista() {
        System.out.println("Artista: " + artista.getNombre() + "\nGénero: " + artista.getGenero());
    }

    public String getTitulo() {
        return titulo;
    }
    
    
}
