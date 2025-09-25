/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico5.ejercicio07;

/**
 *
 * @author matut
 */
public class Vehiculo {
    private String patente;
    private String modelo;
    private Motor motor;
    private Conductor conductor;

    public Vehiculo(String patente, String modelo, Motor motor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
    }
    
    public void mostrarMotor() {
        System.out.println("Datos del motor:\n *Tipo: " + motor.getTipo() + "\n *Nro de serie: " + motor.getNumeroSerie());
    }
    
    // getter Conductor
    public Conductor getConductor() {
        return conductor;
    }
    
    // setter Conductor
    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
        if (conductor != null && conductor.getVehiculo() != this) {
            conductor.setVehiculo(this);
        }
    }
    
    // getters propios
    public String getPatente() {
        return patente;
    }

    public String getModelo() {
        return modelo;
    }
}
