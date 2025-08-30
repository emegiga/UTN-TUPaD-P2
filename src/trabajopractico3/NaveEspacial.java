/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico3;

/**
 *
 * @author matut
 */
public class NaveEspacial {
    // *** Ejercicio 05: Crear una clase NaveEspacial con los atributos: nombre, combustible ***
    // *** Métodos requeridos: despegar(), avanzar(distancia), recargarCombustible(cantidad), mostrarEstado() ***  
    // *** Validar que haya suficiente combustible antes de avanzar y evitar que se supere el límite al recargar ***
    
    // definimos atributos
    private String nombre;
    private int combustible;
    private boolean volando = false; // define estado de vuelo (si está volando o en tierra)
    
    // mostrar estado
    public void mostrarEstado() {
        System.out.println("--- Estado de la nave ---");
        System.out.println("Nombre de la nave: " + getNombre() + "\nCombustible disponible: " + getCombustible() + "\n");
    }    

    // setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCombustible(int combustible) {
        this.combustible = combustible;
    }

    // getters
    public String getNombre() {
        return nombre;
    }

    public int getCombustible() {
        return combustible;
    }
    
    // validacion de combustible para límite de carga 100 unidades 
    public void recargarCombustible(int unidades) {
        if (volando) {
            System.out.println("ERROR: Debe aterrizar para poder recargar combustible.");
        } else {
            System.out.print("Iniciando recarga de combustible... ");
            if (unidades + getCombustible() <= 100) {

                System.out.println("Recarga completa.\n");
                combustible += unidades;
            } else {
                System.out.println("ERROR en cantidad a recargar (se supera la capacidad total de combustible).\n");
            }
        }
    }
    
    // validacion de cantidad de combustible antes de avanzar/despegar. gasto de combustible: 1 unidad x 1 unidad (distancia). Despegue = 1 unidad combustible
    public boolean gastoCombustible(int distancia) {
        if (combustible < distancia) {
            return true;
        } else {
            return false;
        }
    }
    
    // avanzar
    public void avanzar(int distancia) {
        System.out.print("Iniciando secuencia de avance... ");
        if (!volando) {
            System.out.println("ERROR: Antes de avanzar, debe DES-PE-GAR...\n");
        } else {
            if (gastoCombustible(distancia)) {
                System.out.println("ERROR: No es posible avanzar. El gasto de combustible supera a la distancia.\n");
            } else {
                combustible -= distancia;
                System.out.println("Avanzamos! Distancia recorrida: " + distancia + "\n");
            }
        }

    }
    
    // despegar
    public void despegar() {
        System.out.println("Iniciando secuencia de despegue...");
        if (volando) {
            System.out.println("ERROR: Comando incorrecto. La nave ya se encuentra volando.\n");
        } else {
            if (gastoCombustible(2)) {
                System.out.println("ERROR: No hay suficiente combustible para comenzar el viaje.\n");
            } else {
                volando = true;
                combustible -= 1;
                System.out.println("Despegue existoso!");
            }
        }
        
        
    }
    
    // aterrizar
    public void aterrizar() {
        System.out.println("Iniciando secuencia de atterizaje...");
        if (volando) {
            volando = false;
            System.out.println("Aterrizaje completo.");
        } else {
            combustible -= 1;
            System.out.println("ERROR: Ya se encuentra en tierra.");
        }
    }
}
