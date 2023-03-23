
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bruch
 */
public class Ejercicio5 {
    
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el limite de la suma");
        int limite = leer.nextInt();
        int suma=0;
        while(suma<=limite){
            System.out.println("La suma es de: " + suma);
            
            System.out.println("Ingrese otro numero para sumar:");
            suma = suma+leer.nextInt();
            System.out.println("\n");
        }
        System.out.println("La suma es de: " + suma);
    }
}
