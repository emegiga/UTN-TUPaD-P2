/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopractico5.ejercicio10;

/**
 *
 * @author matut
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria(2025421521, 45638.88, "password123", "19/07/2010");
        Titular titular = new Titular("Eddie Murphy", 21654321);
        
        // COMPOSICION 1 A 1 CUENTA BANCARIA -> CLAVESEGURIDAD
        cuenta.mostrarClave();
        
        System.out.println("");
        
        // ASOCIACION BIDIRECCIONAL CUENTA BANCARIA <-> TITULAR
        cuenta.setTitular(titular);
        System.out.println("Titular de la cuenta: " + cuenta.getTitular().getNombre() + "\nDNI: " + cuenta.getTitular().getDni() + "\n");
        System.out.println("Datos de la cuenta:\n *CBU: " + titular.getCuenta().getCbu() + "\n *Saldo: $" + titular.getCuenta().getSaldo());
    }
    
}
