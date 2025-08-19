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
public class Ejercicio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double pesoPaquete, precioProducto;
        String zona;
        Scanner input = new Scanner(System.in);
        
        // validamos que precio y peso sean mayor a 0, y zona sea nac o int
        do {
            System.out.print("Ingrese el precio del producto: $");
            precioProducto = Integer.parseInt(input.nextLine());
        } while (precioProducto <= 0);
        
        do {
            System.out.print("Ingrese el peso del paquete (en kg): ");
            pesoPaquete = Integer.parseInt(input.nextLine());
        } while (pesoPaquete <= 0);
        
        do {
            System.out.print("Ingrese la Zona de envío (Nacional / Internacional): ");
            zona = input.nextLine();
        } while (!zona.equalsIgnoreCase("Nacional") && !zona.equalsIgnoreCase("Internacional"));
        
        // corremos el método calcularCostoEnvio 
        double costoEnvio = calcularCostoEnvio(pesoPaquete, zona);
        
        // impresion
        System.out.println("El costo de envío es: $" + costoEnvio);
        System.out.println("El total a pagar es: $" + calcularTotalCompra(precioProducto, costoEnvio));
        
    }
    
    // método 1 (costo de envio x zona)
    static double calcularCostoEnvio(double peso, String zona) {
        return zona.equalsIgnoreCase("Nacional") ? (peso * 5) : (peso * 10);
        }
    
    // método 2 (total compra)
    static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
        }    
}
