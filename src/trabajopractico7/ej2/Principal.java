/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopractico7.ej2;

import java.util.ArrayList;

/**
 *
 * @author matut
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Figura> figuras = new ArrayList<>();
        
        Circulo circulo1 = new Circulo(10, "Circulo N°1");
        Circulo circulo2 = new Circulo(15, "Circulo N°2");
        Circulo circulo3 = new Circulo(18, "Circulo N°3");
        Rectangulo rectangulo1 = new Rectangulo(10, 19, "Rectángulo N°1");
        Rectangulo rectangulo2 = new Rectangulo(20, 25, "Rectángulo N°2");
        Rectangulo rectangulo3 = new Rectangulo(8, 14, "Rectángulo N°3");
        
        figuras.add(circulo1);
        figuras.add(circulo2);
        figuras.add(circulo3);
        figuras.add(rectangulo1);
        figuras.add(rectangulo2);
        figuras.add(rectangulo3);
        
        for (Figura figura : figuras) {
            figura.calcularArea();
        }
    }
    
}
