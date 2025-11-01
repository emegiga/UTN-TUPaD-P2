/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopractico6.ej2;

/**
 *
 * @author matut
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        
        //Crear al menos tres autores
        Autor autor1 = new Autor("A001", "Haruki Murakami", "Japón");
        Autor autor2 = new Autor("A002", "John Steinbeck", "EEUU");
        Autor autor3 = new Autor("A003", "Fyodor Dostoevsky", "Rusia");
        
        //Agregar 5 libros asociados a alguno de los Autores a la biblioteca.
        biblioteca.agregarLibro("ABC-465254", "Las uvas de la ira", 1942, autor2);
        biblioteca.agregarLibro("BDE-655126", "Tokyo Blues", 1980, autor1);
        biblioteca.agregarLibro("BDE-355746", "Kafka a la orilla", 1980, autor1);
        biblioteca.agregarLibro("USR-000646", "Crimen y Castigo", 1920, autor3);
        biblioteca.agregarLibro("BDE-111882", "Norwegian Wood", 1981, autor1);
        
        //Agregar 5 libros asociados a alguno de los Autores a la biblioteca.
        biblioteca.listarLibros();
        
        //Buscar un libro por su ISBN y mostrar su información.
        System.out.println("\n------------------------------------------------------------------------\n");
        Libro buscado = biblioteca.buscarLibrosPorIsbn("BDE-355746");
        if (buscado != null) buscado.mostrarInfo();        
        
        //Filtrar y mostrar los libros publicados en un año específico.
        System.out.println("\n------------------------------------------------------------------------\n");
        //inventario.filtrarPorCategoria(CategoriaProducto.ELECTRONICA);
        biblioteca.filtrarLibrosPorAnio(1980);
        
        //Eliminar un libro por su ISBN y listar los libros restantes.
        System.out.println("\n------------------------------------------------------------------------\n");
        biblioteca.eliminarLibro("BDE-355748");
        
        //Mostrar la cantidad total de libros en la biblioteca.
        System.out.println("\n------------------------------------------------------------------------\n");
        biblioteca.obtenerCantidadLibros();
        
        //Listar todos los autores de los libros disponibles en la biblioteca.
        System.out.println("\n------------------------------------------------------------------------\n");
        biblioteca.mostrarAutoresDisponibles();
    }
    
}
