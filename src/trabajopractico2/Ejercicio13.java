/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopractico2;


/**
 *
 * @author matut
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        
        // mostramos el array original
        mostrarVector(precios, 0);
        
        // modificamos el valor en la posición 2
        precios[2] = 129.99;
        System.out.println("");
        
        // mostamos el array actualizado
        mostrarVector(precios, 0);
    }

    static void mostrarVector(double[] vector, int indice) {
        // caso base (indice mayor o igual longitur del array)
        if (indice >= vector.length) {
            return;
        }

        // imprimimos valor actual y ejecutamos el método con indice + 1
        System.out.println(vector[indice]);
        mostrarVector(vector, indice + 1);
    }
}
