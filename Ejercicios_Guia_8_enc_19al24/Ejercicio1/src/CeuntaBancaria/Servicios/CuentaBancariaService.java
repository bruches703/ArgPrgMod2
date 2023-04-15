/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CeuntaBancaria.Servicios;

import CeuntaBancaria.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author bruch
 */
public class CuentaBancariaService {
    Scanner leer = new Scanner(System.in);
    
    /**
     * Ingresar datos de nueva cuenta
     *  El saldo se inicia en 0 (cero)
     *
     * @return  new Cuenta bancaria*/
    
    public CuentaBancaria CrearCuenta(){
        System.out.println("Ingrese numero de cuenta: ");
        int numCuenta = leer.nextInt();
        System.out.println("Ingrese DNI");
        int dni = leer.nextInt();
        System.out.println("Ingrese saldo");
        double saldo=0;
        
        return new CuentaBancaria(numCuenta, dni, saldo);
    }
    
    /**
     * 
     * @param saldo 
     * @param cuenta 
     */
    public void IngresarDinero(double saldo, CuentaBancaria cuenta){        
        cuenta.setSaldo(cuenta.getSaldo()+saldo);   
        System.out.println("Saldo es de : "+cuenta.getSaldo());
    }
    
    /**
     * Descuenta el saldo de la cuenta por lo ingresado en "saldoARetirar"
     * @param saldoARetirar 
     * @param cuenta 
     */
    public void Retirar(double saldoARetirar, CuentaBancaria cuenta){
        if(cuenta.getSaldo()-saldoARetirar<=0){
            cuenta.setSaldo(0);
            System.out.println("Se retiro el total");
            System.out.println("Saldo es de : "+cuenta.getSaldo());
        } else {
            cuenta.setSaldo((cuenta.getSaldo()-saldoARetirar));
            System.out.println("Se retiro "+ saldoARetirar);
            System.out.println("Saldo disponible: "+cuenta.getSaldo());
        }
    }
    
    /**
     * 
     * @param saldo 
     * @param cuenta 
     */
    public void ExtraccionRapida(double saldo, CuentaBancaria cuenta){
        while(saldo>cuenta.getSaldo()*0.2){
            System.out.println("No puede retirar mas del 20%, reingrese monto");
            saldo=leer.nextDouble();
        } 
        Retirar(saldo, cuenta);
    }
    
    public void ConsultarSaldo(CuentaBancaria cuenta){
        System.out.println("Su saldo es de: "+cuenta.getSaldo());
    }
    
    public void ConsultarDatos(CuentaBancaria cuenta){
        System.out.println("Num cuenta " + cuenta.getNumeroCuenta());
        System.out.println("DNI " + cuenta.getDni());
        System.out.println("Saldo " + cuenta.getSaldo());
    }
    
    
}
