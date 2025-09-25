/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopractico5.ejercicio09;

/**
 *
 * @author matut
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Paciente paciente = new Paciente("Maestro Roshi", "PAMI");
        Profesional medico = new Profesional("Dr. House", "Médico Clínico");
        CitaMedica turno = new CitaMedica("21/09/2025","12:45");
        
        // ASOCIACION 1 A 1 CITA MEDICA -> PACIENTE
        turno.setPaciente(paciente);
        turno.mostrarPaciente();
        
        System.out.println("");
        // ASOCIACION 1 A 1 CITA MEDICA -> PROFESIONAL
        turno.setProfesional(medico);
        turno.mostrarProfesional();
        
    }
    
}
