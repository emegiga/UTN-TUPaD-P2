/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopractico5.ejercicio01;

/**
 *
 * @author matut
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // instanciamos objetos
        Pasaporte passport = new Pasaporte("AE451212411", "19/07/1984","Foto blanco y negro en Egipto","PNG");
        Titular indy = new Titular("Indiana Jones", 6551265);
        
        // ASOCIACION BIDIRECCIONAL 1 A 1 PASAPORTE <-> TITULAR
        indy.setPassport(passport);
        System.out.println("TITULAR: " + indy.getNombre());
        System.out.println("PASAPORTE: " + passport.getNumero());
        System.out.println("");
        System.out.println("DATOS DE PASAPORTE ASOCIADOS AL TITULAR:");
        System.out.println(" * FECHA DE EMISION: " + indy.getPassport().getFechaEmision() + "\n * NRO DE PASAPORTE: " + indy.getPassport().getNumero());
        System.out.println("");
        
        // COMPOSICION 1 A 1 PASAPORTE -> FOTO
        passport.mostrarFoto();
    }
    
}
