/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_guia_2;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;


/**
 *
 * @author bruch
 */
public class Ejercicio3 {
        public static void main(String[] args) {

        Scanner leer = new Scanner(System.in); 
        
        System.out.println("Ingrese la cadena");
        String cadena = leer.nextLine();
        
            System.out.println("La cadena ingresada es: " + cadena);
            System.out.println("La cadena ingresada en minúsculas es: " + toLowerCase(cadena));
            System.out.println("La cadena ingresada en mayúsculas es: " + toUpperCase(cadena));

        }
}
