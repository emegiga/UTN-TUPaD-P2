/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopractico5.ejercicio02;

/**
 *
 * @author matut
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bateria norauto = new Bateria("Norauto",24);
        Celular iphone = new Celular(6581315, "iPhone", "15", norauto);
        Usuario iorio = new Usuario("Ricardo Iorio", 15652411);
        
        // AGREGACION 1 A 1 CELULAR -> BATERIA
        iphone.mostrarBateria();
        iorio.setCelular(iphone);
        System.out.println("NOMBRE: " + iorio.getNombre() + "    DNI: " + iorio.getDni());
        //System.out.println("DATOS DEL CELULAR ASOCIADO AL USUARIO: " + iphone.);
        
        // ASOCIACION BIDIRECCIONAL 1 A 1 CELULAR <-> USUARIO
        System.out.println(iorio.getNombre() + " tiene un celular " + iorio.getCelular().getMarca() 
                + " " + iorio.getCelular().getModelo() + ". Su IMEI es " + iorio.getCelular().getImei());
        
    }
    
}
