/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico5.ejercicio14;

/**
 *
 * @author matut
 */
public class EditorVideo {
    public void exportar(String formato, Proyecto proyecto){
        Render render = new Render(formato, proyecto);
        //Proyecto proyectoDependencia = new Proyecto("Futurama S03E05", "25");
        System.out.println("Formato: " + formato + "\nProyecto:" + proyecto.getNombre() + "\nDuración (mins): " + proyecto.getDuracionMin());
    }
}
