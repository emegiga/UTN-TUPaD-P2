/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopractico8.parte2.ej4;

import java.util.Scanner;

/**
 *
 * @author matut
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int edad;
        System.out.println("EXCEPCION PERSONALIZADA: Crear EdadInvalidaException. \nLanzarla si la edad es menor a 0 o mayor a 120. Capturarla y mostrar mensaje.");
        System.out.println("****************************************************\n");
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Ingresa tu edad: ");
            edad = Integer.parseInt(input.nextLine());

            if (edad < 1 || edad > 120) {
                throw new EdadInvalidaException("La edad está fuera de rango");
            } else {
                System.out.println("La edad ingresada (" + edad + ") está en el rango correcto.");
            }
        } catch (EdadInvalidaException e) {
            System.out.println("*** ERROR: " + e.getMessage() + " ***");
        }

    }

}
