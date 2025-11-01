/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico7.ej4;

/**
 *
 * @author matut
 */
public abstract class Animal {
    private String nombre;
    private int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public void describirAnimal() {
        System.out.println("El animal se llama " + this.nombre + " y tiene " + this.edad + " años.");
    }
    
    public abstract void hacerSonido();
}
