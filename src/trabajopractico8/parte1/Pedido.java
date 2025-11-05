/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico8.parte1;

import java.util.ArrayList;

/**
 *
 * @author matut
 */
public class Pedido implements Pagable {
    private ArrayList<Producto> productos = new ArrayList<>();
    private Cliente cliente;
    

    public Pedido(Cliente cliente) {
        System.out.println("+++++++++++++++++++++ PEDIDO RECIBIDO +++++++++++++++++++++");
        this.cliente = cliente;
        System.out.println("Nombre del cliente: " + cliente.getNombre());
        cliente.notificar("PROCESANDO COBRO...\n");
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void mostrarPedido() {
        System.out.println("Detalle del pedido:");
        for (Producto producto : productos) {
            System.out.println(" -" + producto.getNombre() + " $" + producto.getPrecio());
        }
    }

    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.calcularTotal();
        }
        cliente.notificar("$$$ PEDIDO COBRADO $$$");
        return total;
    }

}
