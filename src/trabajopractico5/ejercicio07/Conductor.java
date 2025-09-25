/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico5.ejercicio07;

/**
 *
 * @author matut
 */
public class Conductor {
    private String nombre;
    private String licencia;
    private Vehiculo vehiculo;

    public Conductor(String nombre, String licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
    }
    
    // getter Vehiculo
    public Vehiculo getVehiculo() {
        return vehiculo;
    }
    
    // setter Vehiculo
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
        if (vehiculo != null && vehiculo.getConductor() != this) {
            vehiculo.setConductor(this);
        }
    }
    
    // getters propios
    public String getNombre() {
        return nombre;
    }

    public String getLicencia() {
        return licencia;
    }
    
}
