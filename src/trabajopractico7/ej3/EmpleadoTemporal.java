/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico7.ej3;

/**
 *
 * @author matut
 */
public class EmpleadoTemporal extends Empleado {

    public EmpleadoTemporal(String nombre, int horasTrabajadasPorMes) {
        super(nombre, horasTrabajadasPorMes);
    }

    @Override
    public void calcularSueldo() {
        System.out.println("Calculando sueldo $$$...");
        System.out.println("Nombre: " + nombre + " | Sueldo mensual $" + horasTrabajadasPorMes * 25);
    }

}
