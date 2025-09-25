/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico5.ejercicio13;

/**
 *
 * @author matut
 */
public class GeneradorQR {
    public void generar(String valor, Usuario usuario) {
        CodigoQR codigo = new CodigoQR(valor, usuario);
        System.out.println("QR: " + valor + "\nNombre: " + usuario.getNombre() + "\nCorreo: " + usuario.getEmail());
    }
}
