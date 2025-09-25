/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico5.ejercicio06;

/**
 *
 * @author matut
 */
public class Reserva {
    private String fecha;
    private String hora;
    private Mesa mesa;
    private Cliente cliente;

    public Reserva(String fecha, String hora, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.mesa = mesa;
    }
    
    public void mostrarMesa() {
        System.out.println("Fecha de reserva: " + fecha + "\nHora de reserva: " + hora);
        System.out.println("Nro de mesa: " + mesa.getNumero() + "\nCapacidad: " + mesa.getCapacidad() + " comensales" );
    }
    
    // setter Cliente
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public void mostrarCliente() {
        System.out.println("Cliente: " + cliente.getNombre() + "\nTeléfono: " + cliente.getTelefono());
    }
    
}
