/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_guia_2;

import java.util.Scanner;

/**
 *
 * @author bruch
 */
public class Ejercicio4 {
    public static void main (String[] args){
        
        double c, f;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese los grados celcius");
        c = leer.nextDouble();
        f= 32+(9*c/5);
        System.out.println("El equivalente en fahrenheit es: " + f);
        
    }        
}
