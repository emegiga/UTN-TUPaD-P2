/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico5.ejercicio01;

/**
 *
 * @author matut
 */
public class Titular {

    private String nombre;
    private int dni;
    private Pasaporte passport;    // relacion con Pasaporte

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

    //
    public Pasaporte getPassport() {
        return passport;

    }

    public void setPassport(Pasaporte passport) {
        this.passport = passport;
        if (passport != null && passport.getTitular() != this) {
            passport.setTitular(this);
        }
    }

}
