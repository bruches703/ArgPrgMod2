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
public class Ejercicio2 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa tu nombre");
        String nombre = leer.nextLine();
        System.out.println("Tu nombre es: " + nombre);
        
    }
}
