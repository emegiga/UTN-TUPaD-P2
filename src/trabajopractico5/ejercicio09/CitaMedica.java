/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico5.ejercicio09;

/**
 *
 * @author matut
 */
public class CitaMedica {
    private String fecha;
    private String hora;
    private Paciente paciente;
    private Profesional profesional;
    
    // constructor
    public CitaMedica(String fecha, String hora) {
        this.fecha = fecha;
        this.hora = hora;
    }
    
    // setter Paciente
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
    // metodo mostrar Paciente
    public void mostrarPaciente() {
        System.out.println("Nombre del paciente: " + paciente.getNombre() + "\nObra Social: " + paciente.getObraSocial());
    }
    
    // setter Profesional
    public void setProfesional(Profesional profesional) {
        this.profesional = profesional;
    }
    
    // metodo mostrar Profesional
    public void mostrarProfesional() {
        System.out.println("Nombre del médico: " + profesional.getNombre() + "\nEspecialidad: " + profesional.getEspecialidad());
    }
    
    // getters propios
    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }
    
}
