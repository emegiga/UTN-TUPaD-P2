/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopractico7.ej3;

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
        ArrayList<Empleado> empleados = new ArrayList<>();

        EmpleadoPlanta empleado1 = new EmpleadoPlanta("Dave Mustaine", 20);
        EmpleadoPlanta empleado2 = new EmpleadoPlanta("James Hetfield", 25);
        EmpleadoTemporal empleado3 = new EmpleadoTemporal("Phil Anselmo", 15);
        EmpleadoTemporal empleado4 = new EmpleadoTemporal("Bruce Dickinson", 21);

        empleados.add(empleado1);
        empleados.add(empleado2);
        empleados.add(empleado3);
        empleados.add(empleado4);

        for (Empleado empleado : empleados) {
            empleado.calcularSueldo();
            System.out.print("  - Estatus de empleado: ");
            if (empleado instanceof EmpleadoPlanta) {
                System.out.println("*** Permanente ***");
            } else if (empleado instanceof EmpleadoTemporal) {
                System.out.println("*** Temporal ***");
            }
            System.out.println("");
        }
    }
}
