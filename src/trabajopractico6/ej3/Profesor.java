/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico6.ej3;

import java.util.ArrayList;

/**
 *
 * @author matut
 */
public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    private ArrayList<Curso> cursos;

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }
    
    public void agregarCurso(Curso curso) {
        if (curso != null) {
            // Recorrer la lista para verificar si el curso ya existe
            boolean yaExiste = false;
            for (Curso c : this.cursos) {
                if (c == curso) {  
                    yaExiste = true;
                    break;
                }
            }

            // Si no existe, se agrega
            if (yaExiste == false) {
                this.cursos.add(curso);
                
                // Sincronizar
                if (curso.getProfesor() != this) {
                    curso.setProfesor(this);
                }
            }
        }
    }

    public String getId() {
        return id;
    }


    public String getNombre() {
        return nombre;
    }


    public String getEspecialidad() {
        return especialidad;
    }


    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void listarCursos() {
        System.out.println("Profesor: " + this.nombre);
        for (Curso curso : cursos) {
            System.out.println(" -Curso: " + curso.getNombre());
        }
        System.out.println("");
    }

    public void mostrarInfo() {
        System.out.println("\nPROFESOR " + nombre + " (ID " + id + ")\n  +Especialidad: " + especialidad);

    }

  
    
}
