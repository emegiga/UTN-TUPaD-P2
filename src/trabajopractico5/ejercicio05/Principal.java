/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopractico5.ejercicio05;

/**
 *
 * @author matut
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Computadora macbook = new Computadora("Apple Surface Pro", 5551265, "AMD Ryzen", "M3");
        Propietario steve = new Propietario("Bill Jobs", "30.334.565");
        
        // ASOCIACION BIDIRECCIONAL 1 A 1 COMPUTADORA <-> PROPIETARIO
        steve.setComputadora(macbook);
        System.out.println(macbook.getPropietario().getNombre() + " es dueño de la computadora " + steve.getComputadora().getMarca() + " modelo " + macbook.getNumeroSerie());
        System.out.println("La contraseña de su computadora es su DNI: " + macbook.getPropietario().getDni());
        
        // COMPOSICION 1 A 1 COMPUTADORA -> PLACA MADRE
        macbook.mostrarPlacaMadre();
    }
    
}
