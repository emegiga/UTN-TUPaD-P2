/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopractico2;

/**
 *
 * @author matut
 */
public class Ejercicio12 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        
        // 1era impresion
        imprimirArray(precios);
        
        // modificamos el valor en la posición 2
        precios[2] = 129.99;
        System.out.println("");
        
        // 2da impresion (luego de actualizar valor)
        imprimirArray(precios);
    }
    static void imprimirArray(double[] precios) {
        for (double precio2 : precios) {
            System.out.println(precio2);
        }
    }
}
