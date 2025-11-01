/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico6.ej2;

import java.util.ArrayList;

/**
 *
 * @author matut
 */
public class Biblioteca {
    private String nombre;
    private ArrayList<Libro> libros;

    public Biblioteca() {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    public Biblioteca(String nombre, ArrayList<Libro> libros) {
        this.nombre = nombre;
        this.libros = libros;
    }
    
    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        libros.add(new Libro(isbn, titulo, anioPublicacion, autor));
    }
    
    public void listarLibros() {
        System.out.println("LISTADO DE LIBROS:");
        for (Libro libro : libros) {
            libro.mostrarInfo();
        }
    }    
    
    public Libro buscarLibrosPorIsbn(String isbn) {
        System.out.println("BUSQUEDA DE LIBROS:\n");
        System.out.print("Buscando libro por ISBN " + isbn + "... ");
        for (Libro libro : libros) {
            if (libro.getIsbn().equals(isbn)) {
                return libro;
            }
        }
        System.out.println("Libro ISBN " + isbn + " no encontrado.");
        return null;
    }
    
    public void filtrarLibrosPorAnio(int anio) {
        System.out.println("FILTRANDO POR AÑO " + anio + ": \n");
        boolean libroEncontrado = false;
        for (Libro libro : libros) {
            if (libro.getAnioPublicacion() == anio) {
                libro.mostrarInfo();
                libroEncontrado = true;
            }
        }
        if (libroEncontrado == false) {
            System.out.println("No se encontraron libros publicados en " + anio);
        }
    }

    public void eliminarLibro(String isbn) {
        Libro libro = buscarLibrosPorIsbn(isbn);
        if (libro != null) {
            libros.remove(libro);
            System.out.println("Listo! Se ha eliminado el libro " + libro.getTitulo() + " (ISBN " + libro.getIsbn() + ").");
        } else {
            System.out.println("No se ha encontrado el libro que querés eliminar (ISBN " + isbn + ").");
        }
    }
    
    public int obtenerCantidadLibros() {
        System.out.println("TOTAL DE LIBROS EN BIBLIOTECA: " + libros.size());
        return libros.size();
    }

    public void mostrarAutoresDisponibles() {
        System.out.println("AUTORES DISPONIBLES: ");
        ArrayList<String> autoresMostrados = new ArrayList<>();

        for (Libro libro : libros) {
            String nombreAutor = libro.getAutor().getNombre();
            if (!autoresMostrados.contains(nombreAutor)) {
                System.out.println(" - " + nombreAutor);
                autoresMostrados.add(nombreAutor);
            }
        }
    }

     
}    
