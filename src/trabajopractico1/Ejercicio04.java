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
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nombre;
        int edad;
        
        System.out.println("Ingresá tu nombre: ");
        nombre = input.nextLine();
        
        System.out.println("Ingresá tu edad: ");
        edad = Integer.parseInt(input.nextLine());
        
        System.out.println("Tu nombre es " + nombre + " y tenés " + edad + " años.");
    }
    
}
