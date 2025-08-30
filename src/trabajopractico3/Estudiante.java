/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico3;

/**
 *
 * @author matut
 */
public class Estudiante {
    // *** Ejercicio 01: Crear una clase Estudiante con los atributos: nombre, apellido, curso, calificación. ***
    // *** Métodos requeridos: mostrarInfo(), subirCalificacion(puntos), bajarCalificacion(puntos) ***
    
    
    // definimos atributos
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;
    
    // métodos requeridos
    public void mostrarInfo() {
        System.out.println("Estudiante: " + nombre + " " + apellido + "\nCurso: " + curso + "\nNota: " + calificacion + "\n");
    }
    
    public void subirCalificacion(double puntos) {
        calificacion = calificacion + puntos;
    }
    
    public void bajarCalificacion(double puntos) {
        calificacion = calificacion - puntos;
    }
    
    
    // setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
    
    
}
