
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
public class Ejercicio09 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        int residuo, divisor, dividendo, cociente=0;
        
        System.out.println("Ingrese el número a dividir:");
        dividendo= leer.nextInt();
        residuo=dividendo;
        System.out.println("Ingrese el número divisor:");
        divisor= leer.nextInt();
        
        while(residuo>divisor){
            residuo=residuo-divisor;
            cociente++;
        }
        
        System.out.println("Dividendo: " + dividendo);
        System.out.println("Divisor: "+divisor);
        System.out.println("Cociente: "+cociente);
        System.out.println("Resto: "+residuo);
    }
}
