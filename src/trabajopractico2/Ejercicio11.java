/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopractico2;

import java.util.Scanner;

/**
 *
 * @author matut
 */
public class Ejercicio11 {
    static double DESCUENTO = 0.10;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double precioProducto;
        Scanner input = new Scanner(System.in);
        
        // validamos el precio del producto
        do {
            System.out.print("Ingrese el precio del producto: ");
            precioProducto = Integer.parseInt(input.nextLine());
        } while (precioProducto < 0);       
        
        // imprimimos y llamamos al método
        double precioFinal = calcularDescuentoAplicado(precioProducto);
        System.out.println("El precio final con descuento es $" + precioFinal);
       
    }
    static double calcularDescuentoAplicado(double precioProducto) {
        double precioDescuento = precioProducto * DESCUENTO;
        System.out.println("El descuento es de $" + precioDescuento);
        return (precioProducto - precioDescuento);
    }
}
