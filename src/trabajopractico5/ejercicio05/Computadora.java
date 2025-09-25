/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico5.ejercicio05;

/**
 *
 * @author matut
 */
public class Computadora {

    private String marca;
    private int numeroSerie;
    private Propietario propietario;
    private PlacaMadre placaMadre;

    // constructor
    public Computadora(String marca, int numeroSerie, String modelo, String chipset) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placaMadre = new PlacaMadre(modelo, chipset);
    }

    // metodo mostrar placa madre
    public void mostrarPlacaMadre() {
        System.out.println("Datos de la motherboard: \n **Modelo: " + placaMadre.getModelo() + "\n **Chipset: " + placaMadre.getChipset());
    }
    
    // getters propios
    public String getMarca() {
        return marca;
    }

    public int getNumeroSerie() {
        return numeroSerie;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
        if (propietario != null && propietario.getComputadora() != this) {
            propietario.setComputadora(this);
        }
    }

}
