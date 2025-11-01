/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico6.ej1;

import java.util.ArrayList;

/**
 *
 * @author matut
 */
public class Inventario {
    private ArrayList<Producto> productos;

    public Inventario(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public Inventario() {
        this.productos = new ArrayList<>();
    }    
    
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }
    
    public void listarProductos() {
        System.out.println("LISTADO DE PRODUCTOS:");
        for (Producto producto : productos) {
            producto.mostrarInfo();
        }
    }
    
    public Producto buscarProductoPorId(String id) {
        System.out.print("BUSCANDO... ");
        for (Producto producto : productos) {
            if (producto.getId().equals(id)) {
                return producto;
            } 
        }
        System.out.println(" Producto ID " + id +" no encontrado");
        return null;
    }
    
    public void eliminarProducto(String id) {
        Producto producto = buscarProductoPorId(id);
        if (producto != null) {
            productos.remove(producto);
            System.out.println("Listo! Se ha eliminado " + producto.getNombre() + " (ID " + producto.getId() + ").");
            listarProductos();
        } else {
            System.out.println("ID " + id + "no encontrado.");
        }
    }    
    
    public void actualizarStock(String id, int nuevaCantidad) {
        Producto producto = buscarProductoPorId(id);
        if (producto != null) {
            producto.setCantidad(nuevaCantidad);
            System.out.print("Stock actualizado de " + producto.getNombre() + ": " + nuevaCantidad + " unidades.");
            producto.mostrarInfo();
        } else {
            System.out.println("ID " + id + "no válido: " + producto.getNombre() + " no encontrado.");
        }
    }    
    
    public void filtrarPorCategoria(CategoriaProducto categoria) {
        System.out.println("FILTRANDO POR CATEGORIA " + categoria + ": ");
        boolean productoEncontrado = false;
        for (Producto producto : productos) {
            if (producto.getCategoria() == categoria) {
                producto.mostrarInfo();
                productoEncontrado = true;
            } 
        }
        if (productoEncontrado == false) {
            System.out.println("No se encontraron productos en " + categoria);
        }
    }
    
    public void filtrarProductosPorPrecio(double min, double max) {
        boolean encontrado = false;
        System.out.println("FILTRANDO PRODUCTOS ENTRE $" + min + " Y $" + max + ":");
        for (Producto producto : productos) {
            if (producto.getPrecio() >= min && producto.getPrecio() <= max) {
                producto.mostrarInfo();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No hay productos en ese rango de precios.");
        }
    }
    
    public void mostrarCategoriasDisponibles() {
        System.out.println("CATEGORIAS DISPONIBLES (producto: descripcion):\n");
        for (CategoriaProducto categoria : CategoriaProducto.values()) {
            System.out.println(" + " + categoria + ": " + categoria.getDescripcion());
        }
    }
    
    public int obtenerTotalStock() {
        System.out.print("STOCK TOTAL DE PRODUCTOS: " + productos.size());
        return productos.size();
    }
    
    public Producto obtenerProductoConMayorStock() {
        System.out.println("PRODUCTO CON MAYOR STOCK:");
        if (productos.isEmpty()) return null;
        Producto mayor = productos.get(0);
        for (Producto producto : productos) {
            if (producto.getCantidad() > mayor.getCantidad()) {
                mayor = producto;
            }
        }
        return mayor;
    }
}
