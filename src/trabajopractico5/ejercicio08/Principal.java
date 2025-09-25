/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopractico5.ejercicio08;

/**
 *
 * @author matut
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Usuario usuario = new Usuario("McGyver", "info@metallica.com");
        FirmaDigital firma = new FirmaDigital("AXZ-654212-JV", "19/09/2025", usuario, "Formulario 08", "Documento legal que formaliza la compraventa de un vehículo");
        
        // AGREGACION 1 A 1 FIRMADIGITAL -> USUARIO
        firma.mostrarUsuario();
        
        System.out.println("");
        
        // COMPOSICION 1 A 1 
        firma.mostrarDocumento();
    }
    
}
