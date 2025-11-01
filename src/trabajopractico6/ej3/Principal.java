/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopractico6.ej3;

/**
 *
 * @author matut
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Universidad universidad = new Universidad();
        
        //Crear al menos 3 profesores y 5 cursos
        Profesor p1 = new Profesor("P-001", "René Higuita", "Informática");
        Profesor p2 = new Profesor("P-002", "Oscar Passet", "Informática");
        Profesor p3 = new Profesor("P-003", "Germán Burgos", "Química");
        Curso c1 = new Curso("C-001", "AySO");
        Curso c2 = new Curso("C-002", "Organización Empresarial");
        Curso c3 = new Curso("C-003", "Programación I");
        Curso c4 = new Curso("C-004", "Bases de Datos I");
        Curso c5 = new Curso("C-005", "Programación II");  
        
        //Agregar profesores y cursos a la universidad.
        universidad.agregarProfesor(p1);
        universidad.agregarProfesor(p2);
        universidad.agregarProfesor(p3);
        universidad.agregarCurso(c1);
        universidad.agregarCurso(c2);
        universidad.agregarCurso(c3);
        universidad.agregarCurso(c4);
        universidad.agregarCurso(c5);

        //Asignar profesores a cursos usando asignarProfesorACurso(...).
        universidad.asignarProfesorACurso("C-001", "P-001");
        universidad.asignarProfesorACurso("C-003", "P-001");
        universidad.asignarProfesorACurso("C-005", "P-001");
        universidad.asignarProfesorACurso("C-002", "P-002");
        universidad.asignarProfesorACurso("C-004", "P-003");
        
        //Listar cursos con su profesor y profesores con sus cursos.
        System.out.println("******************************************************");
        universidad.listarCursos();
        System.out.print("----\n");
        universidad.listarProfesores();
        
        //Cambiar el profesor de un curso y verificar que ambos lados quedan sincronizados.
        System.out.println("******************************************************");
        System.out.println("Estado actual del profesor " + p1.getNombre() + ":");
        p1.listarCursos();
        System.out.println("Estado actual del profesor " + p3.getNombre() + ":");
        p3.listarCursos();
        
        System.out.println("\nReasignando profesor Germán Burgos (P-003) a curso AySO (C-001)...");
        universidad.asignarProfesorACurso("C-001", "P-003");
        p1.listarCursos();
        p3.listarCursos();
        
        
        //Remover un curso y confirmar que ya no aparece en la lista del profesor.
        System.out.println("******************************************************");
        System.out.println("\nEliminando curso Programación II (C-005)...");
        universidad.eliminarCurso("C-005");
//        universidad.listarCursos();
        universidad.listarProfesores();
        
        //Remover un profesor y dejar profesor = null
        System.out.println("******************************************************");
        System.out.println("\nEliminando profesor René Higuita (P-001)...");
        universidad.eliminarProfesor("P-001");
        universidad.listarProfesores();
        universidad.listarCursos();
        
        //Mostrar un reporte: cantidad de cursos por profesor
        System.out.println("******************************************************");
        universidad.reporteCursosPorProfesor();
      


    }
    
}
