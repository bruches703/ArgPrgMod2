/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CeuntaBancaria;

/**
 *
 * @author bruch
 */
public class CuentaBancaria {
    private int numeroCuenta;
    private int dni;
    private double saldo;

    public CuentaBancaria() {
    }
    
    public CuentaBancaria(int numeroCuenta, int dni, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldo = saldo;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public int getDni() {
        return dni;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    private void saludo(){
        System.out.println("Hola");
    }
    
    
}
