/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico5.ejercicio01;

/**
 *
 * @author matut
 */
public class Pasaporte {
    private String numero;
    private String fechaEmision;
    private Foto foto;          // referencia a Foto
    private Titular titular;    // referencia a Titular

    // constructor
    public Pasaporte(String numero, String fechaEmision, String imagen, String formato) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = new Foto(imagen, formato);
    }
    
    // setter con Titular
    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null && titular.getPassport() != this) {
            titular.setPassport(this);
        }
    }
    
    // getter con Titular
    public Titular getTitular() {
        return titular;
    }

    // getters numero y fecha de emision
    public String getNumero() {
        return numero;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }
    
    
    // 
    public void mostrarFoto() {
        System.out.println("FOTO: " + foto.getImagen() + "." + foto.getFormato());
    }
    
    
}
