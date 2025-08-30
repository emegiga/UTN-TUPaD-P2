/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico3;

/**
 *
 * @author matut
 */
public class Gallina {
    // *** Ejercicio 04: Crear una clase Gallina con los atributos: idGallina, edad, huevosPuestos. ***
    // *** Métodos requeridos: ponerHuevo(), envejecer(), mostrarEstado() *** 
    
    // definimos atributos
    private int idGallina;
    private int edad;
    private int huevosPuestos;
    private static int contadorGallinas; // static 
    
    // getters
    public int getIdGallina() {
        return idGallina;
    }    
    
    public int getEdad() {
        return edad;
    }

    public int getHuevosPuestos() {
        return huevosPuestos;
    }
    
    // mostrar info total
    public void mostrarEstado() {
        System.out.println("ID Gallina: " + getIdGallina() + "\nEdad: " + getEdad() + "\nCantidad de huevos: " + getHuevosPuestos() + "\n");
    }    
    
    // setters
    public int setIdGallina() {
        return this.idGallina = ++contadorGallinas;
    }
    
    public void setEdad(int edad) {    
        this.edad = edad;
    }    
    
    public void setHuevosPuestos(int huevosPuestos) {
        this.huevosPuestos = huevosPuestos;
    }

    // envejecer y poner huevos
    public void envejecer() {
        edad += 1;
    }    
    
    public void ponerHuevo(int huevos) {
        huevosPuestos += huevos;
    }  
    
}
