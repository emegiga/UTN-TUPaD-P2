/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopractico1;

import java.util.Scanner;

/**
 *
 * @author matut
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, suma, resta, producto; 
        double division;
        
        System.out.println("Ingresa el 1er número: ");
        num1 = Integer.parseInt(input.nextLine());
        
        System.out.println("Ingresa el 2do número: ");
        num2 = Integer.parseInt(input.nextLine());
        
        suma = num1 + num2;
        resta = num1 - num2;
        producto = num1 * num2;
        division = (num1 * 1.0) / num2;
        
        System.out.println("Los números que has elegido son " + num1 + " y " + num2);
        System.out.println("La suma da " + suma);
        System.out.println("La resta da " + resta);
        System.out.println("La multiplicación " + producto);
        System.out.println("La división " + division);
    }
    
}
