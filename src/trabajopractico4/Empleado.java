/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico4;

/**
 *
 * @author matut
 */
public class Empleado {
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    
    private static int totalEmpleados;
    private static int contadorEmpleados;
    
    // constructor 1
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }
    
    // constructor 2
    public Empleado(String nombre, String puesto) {
        contadorEmpleados++;
        this.nombre = nombre;
        this.puesto = puesto;
        this.id = contadorEmpleados;    // id autoincremental
        totalEmpleados++;
        this.salario = 40000;         // salario x defecto
    }
    
    // setters
    public void setSalario(double salario) {
        if (salario >= 0) {
            this.salario = salario;
        } else {
            System.out.println("Valor inválido. El salario no puede ser menor o igual a 0 (cero).");
        }
        
    }
    
    // getters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public double getSalario() {
        return salario;
    }
    
    
    // metodo actualizar salario 1 (recibe monto a aumentar)
    public void actualizarSalario(int monto) {
        setSalario(getSalario() + monto);
        System.out.println("ACTUALIZANDO SALARIO ($) de " + getNombre() + ". Monto a actualizar + $" + monto);
    }
   
    // metodo actualizar salario 2 (recibe cantidad fija a aumentar)
    public void actualizarSalario(double porcentaje) {
        setSalario(getSalario() + getSalario() * (porcentaje / 100));
        System.out.println("ACTUALIZANDO SALARIO (%) de " + getNombre() + ". Porcentaje a actualizar + " + porcentaje + "%");
    }   
    
    // metodo estático mostrarTotalEmpleados
    public static int mostrarTotalEmpleados() {
        return + totalEmpleados;
    }
    
    // metodo toString
    @Override
    public String toString() {
        return "\n*** Empleado ID " + getId() + " ***" + "\n    - Nombre: " + getNombre() + "\n    - Puesto: " + getPuesto() + "\n    - Salario: $" + getSalario();
    }
    
    
    
}
