/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico8.parte1;

/**
 *
 * @author matut
 */
public class PagoTarjeta implements PagoConDescuento {
    @Override
    public double aplicarDescuento(double monto) {
        return monto * 0.90; // 10% descuento
    }

    @Override
    public double procesarPago(double monto) {
        double totalNeto = aplicarDescuento(monto);
        System.out.println("Importe neto $" + totalNeto + " (10% descuento por pago con TARJETA)");
        return totalNeto;
    }
}
