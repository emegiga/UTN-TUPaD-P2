/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopractico5.ejercicio11;

/**
 *
 * @author matut
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Artista artista = new Artista("Metallica","Metal");
        Cancion cancion = new Cancion("Master of Puppets");
        Reproductor winamp = new Reproductor();
        
        // ASOCIACION 1 A 1 CANCION -> ARTISTA
        cancion.setArtista(artista);
        cancion.mostrarArtista();
        
        System.out.println("");
        // DEPENDENCIA DE USO REPRODUCTOR -> ARTISTA
        winamp.reproducir(cancion);
    }
    
}
