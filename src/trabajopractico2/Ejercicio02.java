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
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] numeros = new int[3];
        Scanner input = new Scanner(System.in);
        
        // solicitamos los nros
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingresa el nro N°" + i + ": ");
            numeros[i] = Integer.parseInt(input.nextLine());
        }
        
        // inicializamos comparador con el 1er valor del array
        int num = numeros[0];
        
        // recorremos el array para determinar el maximo        
        for (int i = 0; i < numeros.length; i++) {
            if (num < numeros[i]) {
                num = numeros [i];
            }
        }
        System.out.println(num);
    }
    
}
