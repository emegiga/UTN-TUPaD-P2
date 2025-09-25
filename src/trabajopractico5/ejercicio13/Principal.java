/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopractico5.ejercicio13;

/**
 *
 * @author matut
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GeneradorQR generador = new GeneradorQR();
        Usuario usuario = new Usuario("Richard Tex-Tex", "richard@textex.jp");
     
        generador.generar("GB-ASDAS-54", usuario);
    }
    
}
