/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopractico4;

/**
 *
 * @author matut
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creamos 2 objetos con el constructor parcial
        Empleado empleado03 = new Empleado("Ernie Hudson", "Administrativo");
        Empleado empleado04 = new Empleado("Harold Ramis", "Administrativo");
        
        // creamos 2 objetos con el constructor completo
        Empleado empleado01 = new Empleado(10, "Bill Murray", "Gerente", 25000);
        Empleado empleado02 = new Empleado(12, "Dan Aykroyd", "Seguridad", 75000);
            
        // actualizamos salario de empleado03 (monto)
        empleado03.actualizarSalario(2500);
       
        // actualizamos salario de empleado02 (porcentaje)
        empleado02.actualizarSalario(5.0);

        // imprimimos cada empleado
        System.out.print("\n**************************** REGISTRO DE EMPLEADOS ****************************");
        System.out.println(empleado01);
        System.out.println(empleado02);
        System.out.println(empleado03);
        System.out.println(empleado04);       
        
        // ejecutamos el método estático de la clase para mostrar el total de empleados
        System.out.println("\nTOTAL DE EMPLEADOS: " + Empleado.mostrarTotalEmpleados());
    }
    
}
