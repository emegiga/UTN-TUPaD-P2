/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico5.ejercicio04;

/**
 *
 * @author matut
 */
public class Banco {
    private String nombre;
    private int cuit;
    private TarjetaDeCredito tc;

    // constructor
    public Banco(String nombre, int cuit) {
        this.nombre = nombre;
        this.cuit = cuit;
    }

    // getters propios
    public String getNombre() {
        return nombre;
    }

    public int getCuit() {
        return cuit;
    }

}
