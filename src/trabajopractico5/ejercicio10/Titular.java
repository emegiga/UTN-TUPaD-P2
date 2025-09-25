/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico5.ejercicio10;

/**
 *
 * @author matut
 */
public class Titular {
    private String nombre;
    private int dni;
    private CuentaBancaria cuenta;

    // constructor
    public Titular(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    // getters propios
    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        return dni;
    }

    // getter CuentaBancaria
    public CuentaBancaria getCuenta() {
        return cuenta;
    }
    
    // setter CuentaBancaria
    public void setCuenta(CuentaBancaria cuenta) {
        this.cuenta = cuenta;
        if (cuenta != null && cuenta.getTitular() != this) {
            cuenta.setTitular(this);
        }
    }
    
    
    
}
