/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4extras;

import java.util.Scanner;

/**
 *
 * @author bruch
 */
public class Cuenta {
    private double saldo;
    private String titular;

    public Cuenta(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public Cuenta() {
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }
    
    public void retirarDinero(double monto){
            if(saldo-monto<0){
                System.out.println("ERROR!, Intenta extrar mas de lo que puede");
            }else{
                System.out.println("Extraccion concretada");
                saldo-=monto;
            }
        System.out.println("El saldo actual es de: "+saldo);  
    }
    
    
}
