/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopractico5.ejercicio14;

/**
 *
 * @author matut
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EditorVideo editor = new EditorVideo();
        Proyecto proyecto = new Proyecto("PUBLICIDAD TARAGUI", "3");
        
        editor.exportar("AVI", proyecto); 
    }
    
}
