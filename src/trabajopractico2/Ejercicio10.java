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
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int stockActual, cantidadVendida, cantidadRecibida;
        Scanner input = new Scanner(System.in);
        
        // validamos los ingresos de stock actual, vendido y recibido
        do {
            System.out.print("Ingrese el stock actual del producto: ");
            stockActual = Integer.parseInt(input.nextLine());
        } while (stockActual < 0);
        
        do {
            System.out.print("Ingrese la cantidad vendida: ");
            cantidadVendida = Integer.parseInt(input.nextLine());
        } while (cantidadVendida < 0);
        
        do {
            System.out.print("Ingrese la cantidad recibida: ");
            cantidadRecibida = Integer.parseInt(input.nextLine());
        } while (cantidadRecibida < 0);
        
        // corremos el método calcularCostoEnvio 
        int nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);
        
        // impresion
        System.out.println("El nuevo stock del producto es " + nuevoStock);
        
    }
    static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        return (stockActual - cantidadVendida + cantidadRecibida);
    } 
}
