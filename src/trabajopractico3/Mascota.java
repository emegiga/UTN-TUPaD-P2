/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico3;

/**
 *
 * @author matut
 */
public class Mascota {
    // *** Ejercicio 02: Crear una clase Mascota con los atributos: nombre, especie, edad. ***
    // *** Métodos requeridos: mostrarInfo(), cumplirAnios(). ***
    
    // definimos atributos
    private String nombre;
    private String especie;
    private int edad;
    
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + "\nEspecie: " + especie + "\nEdad: " + edad + "\n");
    }
    
    public void cumplirAnios() {
        edad += 1;
    }
    
    // setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}
