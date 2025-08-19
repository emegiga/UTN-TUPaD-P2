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
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int precio;
        double precio_descuento;
        String categoria;
        double descuento;
        Scanner input = new Scanner(System.in);
        
        // validamos que el valor del producto sea mayor a cero
        do {            
            System.out.print("Ingresa el precio del producto $");
            precio = Integer.parseInt(input.nextLine());
        } while (precio <= 0);
        
        // validamos que la categoría sea A, B, o C
        do {            
            System.out.print("Ingresa categoría del producto: ");
            categoria = input.nextLine();
        } while (!categoria.equalsIgnoreCase("A") && !categoria.equalsIgnoreCase("B") && !categoria.equalsIgnoreCase("C"));
        
        // determinamos el descuento segun categoria
        switch (categoria.toUpperCase()) {
            case "A":
                descuento = 0.10;
                break;
            case "B":
                descuento = 0.15;
                break;
            default:
                descuento = 0.20;
        }
        
        // mostramos resultados
        precio_descuento = precio * descuento;
        System.out.println("Precio original: $" + precio);
        System.out.println("Descuento " + (descuento*100) + "%: $" + precio_descuento);
        System.out.println("Precio final: $" + (precio - precio_descuento));
        
    }
    
}
