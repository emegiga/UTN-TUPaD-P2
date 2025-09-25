/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico5.ejercicio14;

/**
 *
 * @author matut
 */
public class Render {
    private String formato;
    private Proyecto proyecto;

    // constructor
    public Render(String formato, Proyecto proyecto) {
        this.formato = formato;
        this.proyecto = proyecto;
    }

    // getter
    public String getFormato() {
        return formato;
    }
}
