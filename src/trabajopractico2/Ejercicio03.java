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
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int edad;
        Scanner input = new Scanner(System.in);
        
        // validamos que el valor ingresado sea mayor a cero
        do {            
            System.out.print("Ingresa tu edad: ");
            edad = Integer.parseInt(input.nextLine());
        } while (edad <= 0);
        
        if (edad < 12) {
            System.out.println("Sos un niño.");
        } else if (edad >= 12 && edad < 18){
            System.out.println("Sos un adolescente.");
        } else if (edad >= 18 && edad < 60){
            System.out.println("Sos un adulto.");
        } else {
            System.out.println("Sos un adulto mayor.");
        }
    }
    
}
