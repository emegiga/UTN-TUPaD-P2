/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico5.ejercicio12;

/**
 *
 * @author matut
 */
public class Calculadora {
    public void calcular(Impuesto impuesto) {
        System.out.println("El IVA (21%) de $" + impuesto.getMonto() + " es de $" + impuesto.getMonto()*0.21);
    }
}
