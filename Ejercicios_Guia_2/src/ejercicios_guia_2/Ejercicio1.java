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
public class Ejercicio1 {
        public static void main(String[] args) {
         
        Scanner leer = new Scanner(System.in); 
        
        System.out.println("Ingrese primer número: ");
        int num1 = leer.nextInt();
        
        System.out.println("Ingrese segundo número: ");
        int num2 = leer.nextInt();      
        
        System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
            
        }
}
