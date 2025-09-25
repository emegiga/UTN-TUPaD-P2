/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico5.ejercicio06;

/**
 *
 * @author matut
 */
public class Cliente {
    private String nombre;
    private String telefono;

    // constructor
    public Cliente(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }
    
    // getters propios
    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }
    
}
