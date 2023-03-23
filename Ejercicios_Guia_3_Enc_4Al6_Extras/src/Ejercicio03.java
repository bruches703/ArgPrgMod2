
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
public class Ejercicio03 {
    public static void main (String[] args){
    
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese letra");
        String letra = leer.nextLine();
        
        if(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u") ){
            System.out.println("La letra es una vocal");
        } else {
            System.out.println("La letra no es una vocal");
        }
    }
}
