/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopractico8.parte2.ej2;

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
        String texto;
        int textoAInt;
        Scanner input = new Scanner(System.in);
        
        System.out.println("CONVERSION DE CADENA A NUMERO: Leer texto del usuario e intentar convertirlo a int.\nManejar NumberFormatException si no es válido.");
        System.out.println("****************************************************\n");
        
        System.out.print("Ingresa el texto: ");
        texto = input.nextLine();

        try {
            textoAInt = Integer.parseInt(texto);
            System.out.println("Conversión finalizada... el número es " + textoAInt);
        } catch (NumberFormatException e) {
            System.out.println("*** ERROR: El texto ingresado no puede ser convertido a número entero ***");
        }

    }

}
