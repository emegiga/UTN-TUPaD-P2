/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico5.ejercicio12;

/**
 *
 * @author matut
 */
public class Impuesto {
    private int monto;
    private Contribuyente contribuyente;

    // constructor
    public Impuesto(int monto) {
        this.monto = monto;
    }

    // getter y setter Contribuyente
    public Contribuyente getContribuyente() {
        return contribuyente;
    }

    public void setContribuyente(Contribuyente contribuyente) {
        this.contribuyente = contribuyente;
    }
    
    // metodo Contribuyente
    public void mostrarContribuyente() {
        System.out.println("Datos del contribuyente:");
        System.out.println("Nombre: " + contribuyente.getNombre() + "\nCUIL: " + contribuyente.getCuil());
    }
    
    // getter propio
    public int getMonto() {
        return monto;
    }
    
    
    
}
