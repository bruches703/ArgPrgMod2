
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
public class Ejercicio11 {
    public static void main (String[] args){
        Scanner leer = new Scanner(System.in);
        int num, cantidadDigitos=0;
        
        System.out.println("Ingrese número: ");
        num = leer.nextInt();
        
        while(num>0){ 
            num=Math.floorDiv(num, 10);
            cantidadDigitos++;
        }
        System.out.println("La cantidad de dígitos es: "+ cantidadDigitos);
    }
}
