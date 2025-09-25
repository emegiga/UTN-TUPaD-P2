/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico5.ejercicio14;

/**
 *
 * @author matut
 */
public class Proyecto {
    private String nombre;
    private String duracionMin;
    
    // constructor
    public Proyecto(String nombre, String duracionMin) {
        this.nombre = nombre;
        this.duracionMin = duracionMin;
    }
    
    // getters
    public String getNombre() {
        return nombre;
    }

    public String getDuracionMin() {
        return duracionMin;
    }
    
}
