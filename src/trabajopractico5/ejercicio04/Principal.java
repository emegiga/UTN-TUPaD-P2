/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopractico5.ejercicio04;

/**
 *
 * @author matut
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Banco banco = new Banco("Santander Rio", 302152150);
        TarjetaDeCredito tc = new TarjetaDeCredito(454456411, "12/2025", banco);
        Cliente cliente = new Cliente("Anthony Bourdain", 21222451, tc);
        
        // AGREGACION 1 A 1 TARJETA DE CREDITO -> BANCO
        tc.mostrarBanco();
        
        // ASOCIACION BIDIRECCIONAL 1 A 1 TARJETA DE CREDITO <-> CLIENTE
        System.out.println("Cliente: " + cliente.getNombre() + " \nDNI: " + cliente.getDni());
        System.out.println("Datos de TC: \n -Nro de tc: " + cliente.getTc().getNumero() + "\n -Fecha de vto: " + cliente.getTc().getFechaVencimiento());
        
    }
    
}
