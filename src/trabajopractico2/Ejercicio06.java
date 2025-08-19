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
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, positivos = 0, negativos = 0, ceros = 0;
        Scanner input = new Scanner(System.in);

        for (int i = 1; i < 11; i++) {
            System.out.print("Ingresa valor entero N°" + i + ": ");
            num = Integer.parseInt(input.nextLine());
            
            if (num > 0) {
                positivos += 1;
            } else if (num < 0) {
                negativos +=1;
            } else {
                ceros +=1;
            }
        }
        System.out.println("Ingresaste " + positivos + " nros positivos, " + negativos + " nros negativos, y " + ceros + " ceros.");
    }
    
}
