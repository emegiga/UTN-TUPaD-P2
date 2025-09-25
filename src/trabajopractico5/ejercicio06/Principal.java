/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopractico5.ejercicio06;

/**
 *
 * @author matut
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mesa mesa = new Mesa(19,4);
        Reserva reserva = new Reserva("19/07/2020", "13:30", mesa);
        Cliente cliente = new Cliente("Oliver Atom", "+541165251511");
                
        // AGREGACION 1 A 1 RESERVA -> MESA
        reserva.mostrarMesa();
        
        System.out.println("");
        
        // ASOCIACION UNIDIRECCIONAL RESERVA -> CLIENTE
        reserva.setCliente(cliente);
        reserva.mostrarCliente();
    }
    
}

