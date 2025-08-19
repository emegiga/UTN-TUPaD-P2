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
public class Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double precioBase, impuesto, descuento;
        Scanner input = new Scanner(System.in);
        
        // validamos precio base, descuento e impuesto sean mayor a 0
        do {
            System.out.print("Ingrese el precio base del producto: ");
            precioBase = Integer.parseInt(input.nextLine());
        } while (precioBase <= 0);
        
        do {
            System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
            impuesto = Integer.parseInt(input.nextLine());
        } while (impuesto <= 0);
        
        do {
            System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 10 para 10%): ");
            descuento = Integer.parseInt(input.nextLine());
        } while (descuento <= 0);
        
        // imprimimos el llamado al método
        System.out.println(precioFinal(precioBase, impuesto, descuento));
    }
    
    // método
    static double precioFinal(double precioBase, double impuesto, double descuento) {
        double valorImpuesto = (precioBase * impuesto) / 100.0;
        double valorDescuento = (precioBase * descuento) / 100.0;
        return (precioBase + valorImpuesto - valorDescuento);
    }
}
