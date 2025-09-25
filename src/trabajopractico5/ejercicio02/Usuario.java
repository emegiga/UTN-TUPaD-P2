/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico5.ejercicio02;

/**
 *
 * @author matut
 */
public class Usuario {
    private String nombre;
    private int dni;
    private Celular celular;

    // constructor
    public Usuario(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    // getters y setters propios
    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setCelular(Celular celular) {
        this.celular = celular;
    }

    
    // getter y setter con Celular
    public Celular getCelular() {
        return celular;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    
}
