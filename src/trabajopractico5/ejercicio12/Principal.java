/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopractico5.ejercicio12;

/**
 *
 * @author matut
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Contribuyente contribuyente = new Contribuyente("Norberto Ortega Sanchez", 10542878);
        Impuesto impuesto = new Impuesto(4500);
        Calculadora calculadora = new Calculadora();
        
        // ASOCIACION UNIDIRECCIONAL IMPUESTO -> CONTRIBUYENTE
        impuesto.setContribuyente(contribuyente);
        impuesto.mostrarContribuyente();
        
        System.out.println("");
        
        // DEPENDENCIA DE USO CALCULADORA -> IMPUESTO
        calculadora.calcular(impuesto);
    }
    
}
