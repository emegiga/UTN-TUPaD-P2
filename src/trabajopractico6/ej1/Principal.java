/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopractico6.ej1;

/**
 *
 * @author matut
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        
        
        // "Crear al menos cinco productos con diferentes categorías y agregarlos al inventario"
        Producto p1 = new Producto("P001", "Arroz", 1500, 20, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("P002", "Celular", 250000, 5, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("P003", "Camisa negra", 8000, 15, CategoriaProducto.ROPA);
        Producto p4 = new Producto("P004", "Taza", 1200, 30, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("P005", "Auriculares bluetooth", 2800, 8, CategoriaProducto.ELECTRONICA);        
    
        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);        


        // Listar todos los productos mostrando su información y categoría.S
        inventario.listarProductos();

        // Buscar un producto por ID y mostrar su información
        System.out.println("\n------------------------------------------------------------------------\n");
        Producto buscado = inventario.buscarProductoPorId("P003");
        if (buscado != null) buscado.mostrarInfo();

        // Filtrar y mostrar productos que pertenezcan a una categoría específica
        System.out.println("\n------------------------------------------------------------------------\n");
        inventario.filtrarPorCategoria(CategoriaProducto.ELECTRONICA);
        
        // Eliminar un producto por su ID y listar los productos restantes
        System.out.println("\n------------------------------------------------------------------------\n");
        inventario.eliminarProducto("P004");
        
        // Actualizar el stock de un producto existente.
        System.out.println("\n------------------------------------------------------------------------\n");
        inventario.actualizarStock("P002", 18);

        // Mostrar el total de stock disponible.
        System.out.println("\n------------------------------------------------------------------------\n");
        System.out.println(inventario.obtenerTotalStock());

        // Obtener y mostrar el producto con mayor stock
        System.out.println("\n------------------------------------------------------------------------\n");
        Producto mayor = inventario.obtenerProductoConMayorStock();
        if (mayor != null) mayor.mostrarInfo();

        // Filtrar productos con precios entre $1000 y $3000
        System.out.println("\n------------------------------------------------------------------------\n");
        inventario.filtrarProductosPorPrecio(1000, 3000);

        // Mostrar las categorías disponibles con sus descripciones
        System.out.println("\n------------------------------------------------------------------------\n");
        inventario.mostrarCategoriasDisponibles();
    }
    
}
