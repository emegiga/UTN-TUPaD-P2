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
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int anio = 1;
        boolean bisiesto;
        Scanner input = new Scanner(System.in);

        // validamos que el valor de año sea mayor a cero
        do {            
            System.out.print("Ingresa el año: ");
            anio = Integer.parseInt(input.nextLine());
        } while (anio <= 0);
        
        // calculo
        if (anio % 4 == 0) {
            if (anio % 100 == 0 && anio % 400 != 0) {
                bisiesto = false;
            } else {
                bisiesto = true;
            } 
           
        } else {
            bisiesto = false;
        }
        
        // impresion del resultado
        if (bisiesto){
                System.out.println(anio + " ES un año bisiesto.");
            } else {
            System.out.println(anio + " NO es un año bisiesto.");
        }
    } 
}
