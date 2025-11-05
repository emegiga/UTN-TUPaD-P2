/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico8.parte1;

/**
 *
 * @author matut
 */
public class PagoPaypal implements PagoConDescuento {
    @Override
    public double aplicarDescuento(double monto) {
        return monto * 0.95; // 5% descuento
    }

    @Override
    public double procesarPago(double monto) {
        double montoFinal = aplicarDescuento(monto);
        System.out.println("Importe neto $" + montoFinal + " (5% descuento por pago con PAYPAL)");
        return montoFinal;
    }    
}
