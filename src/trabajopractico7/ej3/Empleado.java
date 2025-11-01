/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico7.ej3;

/**
 *
 * @author matut
 */
public abstract class Empleado {
    protected String nombre;
    protected int horasTrabajadasPorMes;

    public Empleado(String nombre, int horasTrabajadasPorMes) {
        this.nombre = nombre;
        this.horasTrabajadasPorMes = horasTrabajadasPorMes;
    }
    
    public abstract void calcularSueldo();
}
