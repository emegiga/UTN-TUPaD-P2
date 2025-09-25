/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico5.ejercicio11;

/**
 *
 * @author matut
 */
public class Reproductor {
    public void reproducir(Cancion cancion) {
        System.out.println("*** NOW PLAYING ***");
        System.out.println(cancion.getArtista().getNombre() + " - " + cancion.getTitulo());
    }
}
