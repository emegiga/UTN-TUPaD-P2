/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico5.ejercicio10;

/**
 *
 * @author matut
 */
public class CuentaBancaria {
    private int cbu;
    private double saldo;
    private ClaveSeguridad clave;
    private Titular titular;

    // constructor
    public CuentaBancaria(int cbu, double saldo, String codigo, String ultimaModificacion) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.clave = new ClaveSeguridad(codigo, ultimaModificacion);
    }
    
    // metodo mostrar clave
    public void mostrarClave() {
        System.out.println("Clave de seguridad: " + clave.getCodigo() + "\nÚltima modificación: " + clave.getUltimaModificacion());
    }
    
    // getter Titular
    public Titular getTitular() {
        return titular;
    }
    
    // setter Titular
    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null && titular.getCuenta() != this) {
            titular.setCuenta(this);
        }
    }
    
    
    // getters propios
    public int getCbu() {
        return cbu;
    }

    public double getSaldo() {
        return saldo;
    }
    
}
