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
public class Ejercicio4Extras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cuenta cuen=new Cuenta();
        setCuenta(cuen);
        extraccionDeDinero(cuen);
        System.out.println("Tramite finalizado");        
    }
    public static void extraccionDeDinero(Cuenta cuen){
        do{
           System.out.println("");
           cuen.retirarDinero(monto());   
        }while(continuar());
        System.out.println("");
    }
    public static void setCuenta(Cuenta cuen){
        cuen.setSaldo(18000.23);
        cuen.setTitular("David");
    }
    public static double monto(){
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese monto");
        return leer.nextDouble();
    }
    public static boolean continuar(){
        Scanner leer=new Scanner(System.in);
        System.out.println("Desea continuar? s/n");
        return "s".equals(leer.nextLine());
    }
}
