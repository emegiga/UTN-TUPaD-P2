/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopractico5.ejercicio07;

/**
 *
 * @author matut
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Motor motor = new Motor("Diesel", 4544421);
        Vehiculo coche = new Vehiculo("BYT481", "Ford Fiesta", motor);
        Conductor piloto = new Conductor("Jarno Trulli", "IT455121");
        
        // AGREGACION 1 A 1 VEHICULO -> MOTOR
        coche.mostrarMotor();
        System.out.println("");
        
        // ASOCIACION BIDIRECCIONAL VEHICULO -> CONDUCTOR
        piloto.setVehiculo(coche);
        System.out.print("El piloto del vehiculo " + coche.getModelo() + " patente " + coche.getPatente() + " es "+ coche.getConductor().getNombre());
        System.out.println(".\nLicencia " + coche.getConductor().getLicencia());
    }
    
}
