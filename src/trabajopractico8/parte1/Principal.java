/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopractico8.parte1;

/**
 *
 * @author matut
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Tony Iommi");
        Pedido pedido = new Pedido(cliente);
        pedido.agregarProducto(new Producto("Yerba", 6500));
        pedido.agregarProducto(new Producto("Fideos", 3500));
        pedido.agregarProducto(new Producto("Manteca", 2500));
        pedido.agregarProducto(new Producto("Aceite", 5000));
        

        pedido.mostrarPedido();
        System.out.println("");
        double totalPedido = pedido.calcularTotal();
        System.out.println("Total del pedido: $" + totalPedido);
        
        //Pago pago = new PagoTarjeta();
        Pago pago = new PagoPaypal();
        
        pago.procesarPago(totalPedido);  
    }

}
