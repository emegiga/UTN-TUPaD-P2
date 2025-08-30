/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico3;
/**
 *
 * @author matut
 */
public class Libro {
    // *** Ejercicio 03: Crear una clase Libro con atributos privados: titulo, autor, añoPublicacion. ***
    // *** Métodos requeridos: Getters para todos los atributos. Setter con validación para añoPublicacion ***
    
    // definimos atributos
    private String titulo;
    private String autor;
    private int anioPublicacion;
    
    // getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }
    
    // mostrar info total
    public void mostrarInfo() {
        System.out.println("Título: " + getTitulo() + "\nAutor: " + getAutor() + "\nAño de publicación: " + getAnioPublicacion() + "\n");
    }
    
    // setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        if (anioPublicacion > 0 && anioPublicacion <= 2025) {
            this.anioPublicacion = anioPublicacion;
        } else {
            System.out.println("El año ingresado es incorrecto.");
        }
    }
    
}
