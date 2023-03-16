package ejercicios_guia_2;

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
        System.out.println("Ingrese el número: ");
        int num = leer.nextInt();
        System.out.println("El doble es: " + (num*2));
        System.out.println("La raiz es: " + Math.sqrt(num));
    }
}
