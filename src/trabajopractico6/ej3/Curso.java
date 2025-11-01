/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico6.ej3;

/**
 *
 * @author matut
 */
public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null;
    }    

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor nuevoProfesor) {
        if (this.profesor != null) {
            this.profesor.getCursos().remove(this);
        }

        this.profesor = nuevoProfesor;

        if (nuevoProfesor != null) {
            if (!nuevoProfesor.getCursos().contains(this)) {
                nuevoProfesor.getCursos().add(this);
            }
        }
    }    

    public void mostrarInfo() {
        System.out.println("    -Curso: " + nombre + " Codigo: " + codigo);
    }
    
}
