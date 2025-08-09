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
public class Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, resultado1;
        double resultado2;
        
        System.out.println("Ingresa el divisor: ");
        num1 = Integer.parseInt(input.nextLine());
        
        System.out.println("Ingresa el dividendo: ");
        num2 = Integer.parseInt(input.nextLine());
        
        resultado1 = num1/num2;
        System.out.print("Versión 1 (int): ");
        System.out.println("La división entre " + num1 + " y " + num2 + " da " + resultado1);
        
        
        resultado2 = (num1*1.0)/num2;
        System.out.print("Versión 1 (double): ");
        System.out.println("La división entre " + num1 + " y " + num2 + " da " + resultado2);
    }
    
}
