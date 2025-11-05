/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopractico8.parte2.ej1;

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
        int num1;
        int num2;
        double total;
        Scanner input = new Scanner(System.in);

        System.out.println("DIVISION SEGURA: Solicitar dos números y dividirlos.\nManejar ArithmeticException si el divisor es cero.");
        System.out.println("****************************************************\n");
        
        try {
            System.out.print("Ingresa el 1er número: ");
            num1 = Integer.parseInt(input.nextLine());

            System.out.print("Ingresa el 2do número: ");
            num2 = Integer.parseInt(input.nextLine());

            if (num2 == 0) {
                throw new ArithmeticException("No se puede dividir por cero.");
            }

            total = (double) num1 / num2;
            System.out.println("La división entre " + num1 + " y " + num2 + " da como resultado " + String.format("%.2f", total));

        } catch (ArithmeticException e) {
            System.out.println("*** ERROR: " + e.getMessage() + " ***");
        }

    }

}
