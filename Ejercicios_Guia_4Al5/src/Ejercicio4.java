
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
public class Ejercicio4 {
    
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        
 
        System.out.println("Ingrese frase:");
        String cadena = leer.nextLine();
        // HOLA MUNDO

        if("A".equalsIgnoreCase(cadena.substring(0,1))){
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    }
}
