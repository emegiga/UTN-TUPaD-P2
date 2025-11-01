/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico7.ej1;

/**
 *
 * @author matut
 */
public class Auto extends Vehiculo {
    private int cantidadPuertas;

    public Auto(String marca, String modelo, int cantidadPuertas) {
        super(marca, modelo);
        this.cantidadPuertas = cantidadPuertas;
    }

   @Override
   public void mostrarInfo() {
        System.out.println("El auto es marca " + super.getMarca() + ", modelo " + super.getModelo() + ". Cantidad de puertas: " + this.cantidadPuertas);
    }
    
}
