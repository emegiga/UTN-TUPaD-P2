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
public class Universidad {

    private String nombre;
    private ArrayList<Curso> cursos;
    private ArrayList<Profesor> profesores;

    public Universidad(String nombre, ArrayList<Curso> cursos, ArrayList<Profesor> profesores) {
        this.nombre = nombre;
        this.cursos = cursos;
        this.profesores = profesores;
    }

    public Universidad() {
        this.nombre = "Universidad de las Universidades";
        this.cursos = new ArrayList<>();
        this.profesores = new ArrayList<>();;
    }

    public void agregarProfesor(Profesor p) {
        if (p != null) {
            boolean yaExiste = false;
            for (Profesor profesor : profesores) {
                if (profesor == p) {
                    yaExiste = true;
                    break;
                }
            }

            if (!yaExiste) {
                this.profesores.add(p);
            }
        }
    }

    public void agregarCurso(Curso c) {
        if (c != null) {
            boolean yaExiste = false;
            for (Curso curso : cursos) {
                if (curso == c) {
                    yaExiste = true;
                    break;
                }
            }

            if (!yaExiste) {
                this.cursos.add(c);
            }
        }
    }

    public Curso buscarCursoPorId(String id) {
        for (Curso c : this.cursos) {
            if (c.getCodigo().equals(id)) {
                return c;
            }
        }
        return null;
    }

    public Profesor buscarProfesorPorId(String id) {
        for (Profesor p : this.profesores) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso curso = buscarCursoPorId(codigoCurso);

        Profesor profesor = buscarProfesorPorId(idProfesor);

        if (codigoCurso != null && idProfesor != null) {
            curso.setProfesor(profesor);
        } else {
            System.out.println("No se encontró el curso y/o el profesor");
        }
    }

    public void listarProfesores() {
        System.out.println("\nLISTANDO PROFESORES CON SUS CURSOS ASIGNADOS...");
        for (Profesor profesor : profesores) {
            profesor.listarCursos();
        }
    }

    public void listarCursos() {
        System.out.println("\nLISTANDO CURSOS CON SU PROFESOR ASIGNADO...");
        for (Curso curso : cursos) {
            System.out.println("Curso: " + curso.getNombre());
            if (curso.getProfesor() != null) {
                System.out.println("  - Profesor asignado: " + curso.getProfesor().getNombre());
            } else {
                System.out.println("  - Sin profesor asignado");
            }
            System.out.println("");
        }
    }

    public void eliminarCurso(String codigo) {
        Curso cursoDelete = null;
        for (Curso curso : cursos) {
            if (codigo.equals(curso.getCodigo())) {
                cursoDelete = curso;
                break;
            }
        }
        if (cursoDelete != null) {
            cursoDelete.setProfesor(null);
            cursos.remove(cursoDelete);
            System.out.println("Ok... el curso " + cursoDelete.getNombre() + " ha sido eliminado.");
        }
    }

    public void eliminarProfesor(String id) {
        Profesor profesor = buscarProfesorPorId(id);

        if (profesor != null) {
            ArrayList<Curso> cursosDelProfesor = new ArrayList<>(profesor.getCursos());
            for (Curso curso : cursosDelProfesor) {
                curso.setProfesor(null);
            }
            this.profesores.remove(profesor);
            System.out.println("Profesor " + profesor.getNombre() + " eliminado.");
        }
    }
    
    public void reporteCursosPorProfesor() {
    System.out.println("\nCantidad de cursos por profesor:");
    for (Profesor p : profesores) {
        System.out.println("  - Profesor/a " + p.getNombre() + ": " + p.getCursos().size() + " curso(s).");
    }
}

}
