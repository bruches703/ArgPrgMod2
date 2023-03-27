/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentros7y8;

import java.util.Scanner;

/**
 * Consigna:
 * 
 * Diseñe una función que pida el nombre y la edad de N personas e imprima los 
 * datos de las personas ingresadas por teclado e indique si son mayores o 
 * menores de edad. Después de cada persona, el programa debe preguntarle al 
 * usuario si quiere seguir mostrando personas y frenar cuando el usuario 
 * ingrese la palabra “No”.
 * 
 * @author bruch
 * 
 */
public class Ejercicio2 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        String nombre;
        int edad;
           
        do{
            nombre = ingresoDeNombre();
            edad=ingresoDeEdad();
            System.out.println("Nombre: " + nombre);
            System.out.println("Edad: "+ edad);
            informeDeMayoriaDeEdad(edad);
        }while(continuarBucle());
    }

    public static String ingresoDeNombre(){
        // Ingresar el nombre de la persona
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese nómbre:");
        return leer.nextLine();
    }
    public static int ingresoDeEdad(){
        // Ingresar la edad de la persona
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese edad:");
        return leer.nextInt();
    }
    public static void informeDeMayoriaDeEdad(int edad){
        if(edad<18){    
            System.out.println("Es menor de edad");
        }else{
            System.out.println("Es mayor de edad");
        }
    }
    public static boolean continuarBucle(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Desea continuar? Si/No");
        String continuar= leer.nextLine();
        while(!"SI".equalsIgnoreCase(continuar) && !"NO".equalsIgnoreCase(continuar)){
            System.out.println("Opcion incorrecta? ingrese Si/No");
            continuar= leer.nextLine();        
        }
        
        return "si".equalsIgnoreCase(continuar);
    }
}
