/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico5.ejercicio03;

/**
 *
 * @author matut
 */
public class Libro {

    private String titulo;
    private String isbn;
    private Autor autor;
    private Editorial editorial;

    public Libro(String titulo, String isbn, Autor autor, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.editorial = editorial;
    }

    // getters propios
    public String getTitulo() {
        return titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    // getter y setter con Editorial
    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    // 
    public void mostrarEditorial() {
        if (editorial == null) {
            System.out.println("El libro NO tiene una Editorial vinculada.");
        } else {
            System.out.println("Libro: " + titulo + " \nAutor: " + autor.getNombre());
            System.out.println("Editorial: " + editorial.getNombre() + " (" + editorial.getDireccion() + ")");
        }
    }

    // mostrar Autor
    public void mostrarAutor() {
        if (autor != null) {
            System.out.println("La autoría del libro " + titulo + " es de " + autor.getNombre());
        } else {
            System.out.println(titulo + " no tiene un autor definido.");
        }
    }

    // setter Autor
    public void setAutor(Autor autor) {
        this.autor = autor;
    }

}
