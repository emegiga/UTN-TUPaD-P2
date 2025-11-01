/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopractico7.ej4;

import java.util.ArrayList;

/**
 *
 * @author matut
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList<>();
        
        Perro perro1 = new Perro("Maku", 5);
        Perro perro2 = new Perro("Drac", 7);
        Gato gato1 = new Gato("Pipi", 4);
        Gato gato2 = new Gato("Tori", 1);
        Vaca vaca1 = new Vaca("Lola", 6);
        Vaca vaca2 = new Vaca("Milka", 9);
        
        animales.add(perro1);
        animales.add(gato1);
        animales.add(vaca1);
        animales.add(perro2);
        animales.add(gato2);
        animales.add(vaca2);
        
        for (Animal animal : animales) {
            animal.describirAnimal();
            animal.hacerSonido();
            System.out.println("");
        }
    }
    
}
