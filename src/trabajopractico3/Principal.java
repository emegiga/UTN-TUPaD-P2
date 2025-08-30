/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopractico3;

/**
 *
 * @author matut
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // ********* EJERCICIO 01: Registro de Estudiantes *********
        // Instanciar a un estudiante, mostrar su información, aumentar y disminuir calificaciones
        System.out.println("****************** EJERCICIO 01: Registro de Estudiantes ******************\n");
        
        // instanciar estudiante
        Estudiante estudiante01 = new Estudiante();
        estudiante01.setNombre("Ricardo");
        estudiante01.setApellido("Mollo");
        estudiante01.setCurso("Música");
        estudiante01.setCalificacion(6);
        
        // mostrar info
        System.out.println("01-01) Mostrar información: ");
        estudiante01.mostrarInfo();
        
        // aumentar calificacion y mostrar info
        System.out.println("01-02) Calificación aumentada.Información actualizada: ");
        estudiante01.subirCalificacion(4);
        estudiante01.mostrarInfo();
        
        // disminuir calificacion y mostrar info
        System.out.println("01-03) Calificación disminuida.Información actualizada:");
        estudiante01.bajarCalificacion(3);
        estudiante01.mostrarInfo();
        
        
        // ********* EJERCICIO 02: Registro de Mascotas *********
        // Crear una mascota, mostrar su información, simular el paso del tiempo y verificar los cambios.
        System.out.println("\n****************** EJERCICIO 02: Registro de Mascotas ******************\n");
        
        // creamos la mascota
        Mascota mascota01 = new Mascota();
        mascota01.setNombre("Momo");
        mascota01.setEspecie("Gato");
        mascota01.setEdad(4);
        
        // mostramos info
        mascota01.mostrarInfo();
        
        // simulamos paso del tiempo (4 años)
        mascota01.cumplirAnios();
        mascota01.cumplirAnios();
        mascota01.cumplirAnios();
        mascota01.cumplirAnios();
        
        // mostramos info
        mascota01.mostrarInfo();
        
        // ********* EJERCICIO 03: Encapsulamiento con la Clase Libro *********
        // Crear un libro, intentar modificar el año con un valor inválido y luego con uno válido, mostrar la información final.
        System.out.println("\n****************** EJERCICIO 03: Encapsulamiento con la Clase Libro ******************\n");  
        
        // creamos un libro
        Libro libro01 = new Libro();
        libro01.setTitulo("No Logo");
        libro01.setAutor("Naomi Klein");
        libro01.setAnioPublicacion(1984);
        
        // mostramos info
        libro01.mostrarInfo();
        
        // intento de modificar año con valor inválido
        libro01.setAnioPublicacion(2030);
        
        // intento de modificar año con valor válido
        libro01.setAnioPublicacion(1999);
        libro01.mostrarInfo();
        
        // ********* EJERCICIO 04: Gestión de Gallinas en Granja Digital *********
        // Crear dos gallinas, simular sus acciones (envejecer y poner huevos), y mostrar su estado
        System.out.println("\n****************** EJERCICIO 04: Gestión de Gallinas en Granja Digital ******************\n");     
        
        // creamos gallina 1
        Gallina gallina01 = new Gallina();
        gallina01.setIdGallina();
        gallina01.setEdad(1);
        gallina01.setHuevosPuestos(0);
        
        // creamos gallina 2
        Gallina gallina02 = new Gallina();
        gallina02.setIdGallina();
        gallina02.setEdad(3);
        gallina02.setHuevosPuestos(2);
        
        // mostramos info
        gallina01.mostrarEstado();
        gallina02.mostrarEstado();
        
        // simulando acciones
        gallina01.ponerHuevo(6);
        gallina01.envejecer();
        gallina01.envejecer();
        gallina02.ponerHuevo(1);
        gallina02.ponerHuevo(2);
        gallina02.envejecer();
       
        // mostramos info
        gallina01.mostrarEstado(); // 3 años, 6 huevos
        gallina02.mostrarEstado(); // 4 años,  5 huevos
        
        // ********* EJERCICIO 05: Simulación de Nave Espacial *********
        // Crear una nave con 50 unidades de combustible, intentar avanzar sin recargar, luego recargar y avanzar correctamente.Mostrar el estado al final
        System.out.println("\n****************** EJERCICIO 05: Simulación de Nave Espacial ******************\n");   
        
        // creamos la nave
        NaveEspacial nave01 = new NaveEspacial();
        nave01.setNombre("USS Enterprise");
        nave01.setCombustible(50);
        
        nave01.mostrarEstado();
        
        // intentamos avanzar sin despegar
        nave01.avanzar(10);
        
        // despegamos e intentamos avanzar mas de 50 unidades sin recargar
        nave01.despegar();
        nave01.avanzar(51);
        
        // aterrizar y recargar
        nave01.aterrizar();
        nave01.recargarCombustible(10);
        
        // despegar y avanzar
        nave01.despegar();
        nave01.avanzar(45);
        
        // mostrar info
        nave01.mostrarEstado();
    }
    
}
