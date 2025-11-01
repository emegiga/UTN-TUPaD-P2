/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico7.ej4;

/**
 *
 * @author matut
 */
public class Vaca extends Animal{
    public Vaca(String nombre, int edad) {
        super(nombre, edad);
    }
    
    @Override
    public void hacerSonido() {
        System.out.println("Hace MUU... MUUU... MUUU!!!");
    }
}
