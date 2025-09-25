/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico5.ejercicio04;

/**
 *
 * @author matut
 */
public class Cliente {
    private String nombre;
    private int dni;
    private TarjetaDeCredito tc;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Cliente(String nombre, int dni, TarjetaDeCredito tc) {
        this.nombre = nombre;
        this.dni = dni;
        this.tc = tc;
    }

    public TarjetaDeCredito getTc() {
        return tc;
    }

    public void setTc(TarjetaDeCredito tc) {
        this.tc = tc;
        if (tc != null && tc.getCliente() != this) {
            tc.setCliente(this);
        }
        
  
    }
    
    
}
