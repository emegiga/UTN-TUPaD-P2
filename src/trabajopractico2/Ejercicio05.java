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
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, sumador = 0;
        Scanner input = new Scanner(System.in);
        
        do {            
            System.out.print("Ingresa un número entero: ");
            num = Integer.parseInt(input.nextLine());
            
            if (num % 2 == 0) {
                sumador += num;
            }
        } while (num != 0);
        
        System.out.println("La suma de los números pares ingresados da " + sumador);
    }
    
}
